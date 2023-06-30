package lesson3.hw3.controller

import lesson3.hw3.utils.exception.CustomIllegalArgumentException
import lesson3.hw3.model.UserData
import lesson3.hw3.utils.Constants
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.IOException

class UserDataWriter {

    /**
     * Функция принимает объект UserData,
     * генерирует имя файла на основе фамилии пользователя
     * и записывает данные в файл.
     *
     * @param userData
     *
     * Проверка существующих данных: Если файл уже существует,
     * то происходит чтение его содержимого. Затем проверяется,
     * содержит ли файл уже запись с такими же данными.
     * Если да, выбрасывается исключение CustomIllegalArgumentException.
     *
     * @throws CustomIllegalArgumentException
     * @throws IOException
     *
     * Запись данных в файл: Используя BufferedWriter и FileWriter,
     * данные записываются в файл.
     * Флаг true позволяет добавить новые данные без удаления старых.
     * Запись осуществляется в новую строку.
     *
     * Обработка исключений: В случае ошибки при работе с файлом
     * выводится сообщение об ошибке и стек вызовов исключения.
     *
     * Вывод сообщения об успешной записи: Если запись прошла успешно,
     * выводится сообщение о том, что данные были успешно записаны
     * в файл с указанием его имени.
     */
    fun saveUserDataToFile(userData: UserData) {
        val fileName = "${userData.lastName}.txt"
        val line = "<${userData.lastName}><${userData.firstName}><${userData.middleName}><${userData.birthDate}><${userData.phoneNumber}><${userData.gender}>"

        try {
            val file = File(fileName)
            if (file.exists()) {
                val existingData = file.readText()
                if (existingData.contains(line)) {
                    throw CustomIllegalArgumentException(Constants.Message.DATA_ALREADY_EXISTS)
                }
            }

            BufferedWriter(FileWriter(file, true)).use { bufferedWriter ->
                bufferedWriter.write(line)
                bufferedWriter.newLine()
            }
            println("Данные успешно записаны в файл $fileName")
        } catch (e: IOException) {
            println(Constants.Message.FILE_ERROR)
            e.printStackTrace()
        }
    }
}