fun isValidDigit(input: String): Boolean {
    return input.length == 1 && input[0].isDigit()
}

fun main() {
    println("Программа принимает две различные цифры и пытается составить из них нечётное число.")

    var digit1: Char? = null
    while (digit1 == null) {
        println("Введите первую цифру (от 0 до 9):")
        val input1 = readln().trim()

        if (!isValidDigit(input1)) {
            println("Ошибка: необходимо ввести одну цифру. Попробуйте снова.")
            continue
        }
        digit1 = input1[0]
    }

    var digit2: Char? = null
    while (digit2 == null) {
        println("Введите вторую цифру (от 0 до 9), отличную от первой:")
        val input2 = readln().trim()

        if (!isValidDigit(input2)) {
            println("Ошибка: необходимо ввести одну цифру. Попробуйте снова.")
            continue
        }

        digit2 = input2[0]

        if (digit1 == digit2) {
            println("Ошибка: цифры должны быть различны. Попробуйте снова.")
            digit2 = null
        }
    }

    if (digit1!!.isDigit() && digit1.toString().toInt() % 2 != 0) {

        println("Из введённых цифр можно составить нечётное число: $digit2$digit1")
    } else if (digit2!!.isDigit() && digit2.toString().toInt() % 2 != 0) {

        println("Из введённых цифр можно составить нечётное число: $digit1$digit2")
    } else {
        println("Создать нечётное число невозможно.")
    }
}