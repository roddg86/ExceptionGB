package lesson3.hw3.controller

import lesson3.hw3.utils.exception.CustomIllegalArgumentException
import lesson3.hw3.model.UserData
import lesson3.hw3.utils.Constants

class UserDataParser {

    /**
     * Функция parseUserData принимает список строк в качестве входных данных,
     * проверяет их на корректность и создает объект UserData.
     *
     * @see UserData
     * @return объект UserData
     */
    fun parseUserData(data: List<String>): UserData {
        val lastName = validateName(data[0], Constants.Message.LAST_NAME)
        val firstName = validateName(data[1], Constants.Message.FIRST_NAME)
        val middleName = validateName(data[2], Constants.Message.SURNAME)
        val birthDate = validateAndFormatBirthDate(data[3])
        val phoneNumber = validatePhoneNumber(data[4])
        val gender = validateGender(data[5])

        return UserData(lastName, firstName, middleName, birthDate, phoneNumber, gender)
    }

    /**
     * Функция validateName проверяет, является ли имя пустым
     * или содержит недопустимые символы с помощью регулярного выражения.
     *
     * @throws CustomIllegalArgumentException
     */
    private fun validateName(name: String, fieldName: String): String {
        val regex = Regex("[a-zA-Zа-яА-Я]+")
        if (name.isBlank()) {
            throw CustomIllegalArgumentException("Не указано $fieldName")
        } else if (!regex.matches(name)) {
            throw CustomIllegalArgumentException("Некорректное значение $fieldName")
        }
        return name
    }

    /**
     * Функция validateAndFormatBirthDate проверяет формат
     * строки даты рождения с помощью регулярного выражения.
     *
     * @throws CustomIllegalArgumentException
     */
    private fun validateAndFormatBirthDate(birthDate: String): String {
        val regex = Regex("""\d{2}\.\d{2}\.\d{4}""")
        if (!regex.matches(birthDate)) {
            throw CustomIllegalArgumentException(Constants.Message.DATE_OF_BIRTH)
        }
        return birthDate
    }

    /**
     * Функция validatePhoneNumber проверяет формат строки номера телефона
     * с помощью регулярного выражения и преобразует его в тип Long.
     *
     * @throws CustomIllegalArgumentException
     */
    private fun validatePhoneNumber(phoneNumber: String): Long {
        val regex = Regex("""\d+""")
        if (!regex.matches(phoneNumber)) {
            throw CustomIllegalArgumentException(Constants.Message.PHONE_NUMBER)
        }
        try {
            return phoneNumber.toLong()
        } catch (e: NumberFormatException) {
            throw CustomIllegalArgumentException(Constants.Message.PHONE_NUMBER)
        }
    }

    /**
     * Функция validateGender проверяет формат строки пола
     * и возвращает первый символ.
     *
     * @throws CustomIllegalArgumentException
     */
    private fun validateGender(gender: String): Char {
        if (gender.length != 1 || !listOf('f', 'm').contains(gender[0])) {
            throw CustomIllegalArgumentException(Constants.Message.FLOOR)
        }
        return gender[0]
    }
}