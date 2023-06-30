package lesson3.hw3.model

/**
 * @param lastName: строковое значение, представляющее фамилию пользователя.
 * @param firstName: строковое значение, представляющее имя пользователя.
 * @param middleName: строковое значение, представляющее отчество пользователя.
 * @param birthDate: строковое значение, представляющее дату рождения пользователя.
 * @param phoneNumber: целочисленное значение типа Long, представляющее номер телефона пользователя.
 * @param gender: символ типа Char, представляющий пол пользователя.
 */
data class UserData(
    val lastName: String,
    val firstName: String,
    val middleName: String,
    val birthDate: String,
    val phoneNumber: Long,
    val gender: Char
)