package lesson3.hw3

import lesson3.hw3.controller.UserDataParser
import lesson3.hw3.controller.UserDataWriter
import lesson3.hw3.utils.exception.CustomIllegalArgumentException
import lesson3.hw3.utils.Constants
import lesson3.hw3.utils.logger.UserDataLogger
import lesson3.hw3.view.UserDataInput
import java.io.IOException

fun main() {
    val userDataInput = UserDataInput();
    val userDataProcessor = UserDataParser()
    val userDataWriter = UserDataWriter()
    val logger = UserDataLogger()

    while (true) {
        try {
            val input = userDataInput.readUserDataInput()
            val userData = userDataProcessor.parseUserData(input)
            userDataWriter.saveUserDataToFile(userData)
        } catch (e: IOException) {
            logger.logError(Constants.Message.FILE_ERROR, e)
            println(Constants.Message.FILE_ERROR)
            e.printStackTrace()
        } catch (e: CustomIllegalArgumentException) {
            logger.logWarning("Ошибка ввода данных: ${e.message}")
            println(Constants.Message.IO_ERROR)
            println(e.message)
        }
    }
}

