package isel.leic.tds.chess

import isel.leic.tds.mongoDb.MongoDriver

fun main() {


    MongoDriver().use { mongoDriver ->
        while (true) {
            val (cmd, parameter) = readCommand()
            when (cmd) {
                "GET" -> TODO()
                "POST" -> TODO()



                "EXIT" -> break
                else -> println("Invalid command")
            }
        }
    }

}

typealias LineCommand = Pair<String, String?>

fun readCommand(): LineCommand {
    print("> ")
    return readln().parseCommand()
}

fun String.parseCommand(): LineCommand {
    val line = this.trim()
    val cmd = line.substringBefore(' ').uppercase()
    val param = line.substringAfter(' ',"").ifBlank { null }
    return cmd to param
}


fun readln() = readLine()!!
fun readlnOrNull() = readLine()

