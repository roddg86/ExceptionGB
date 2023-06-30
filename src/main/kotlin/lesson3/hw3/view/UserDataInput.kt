package lesson3.hw3.view

import lesson3.hw3.utils.exception.CustomIllegalArgumentException
import lesson3.hw3.utils.Constants
import java.io.IOException

class UserDataInput{
    /**
     * Функция запрашивает у пользователя ввод и считывает его с консоли,
     * затем разбивает его на список строк.
     *
     * @return список строк
     */
    fun readUserDataInput(): List<String> {
        println(Constants.Message.INPUT_DATA)
        val input = readLine() ?: throw IOException(Constants.Message.INPUT_DATA_ERROR)
        val data = input.split(" ")
        if (data.size != 6) {
            if (data.size < 6) {
                throw CustomIllegalArgumentException(Constants.Message.INPUT_LESS_ERROR)
            } else {
                throw CustomIllegalArgumentException(Constants.Message.INPUT_MORE_ERROR)
            }
        }
        return data
    }
}
