// 8. Написать функцию, которая проверяет длиннее ли первая строка второй. (String, String) -> Boolean.
// Подсказка: у строки можно вызвать length
fun main() {
    val str1 = "Good morning!"
    val str2 = "Good night!"
    println(comparison(str1, str2))
}

fun comparison(str1: String, str2: String): Boolean {
    return str1.length > str2.length

}
