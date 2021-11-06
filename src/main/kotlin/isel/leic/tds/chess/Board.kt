package isel.leic.tds.chess

import java.io.File

private const val DefaultBoardPath = "src\\main\\kotlin\\isel\\leic\\tds\\chess\\DefaultChessBoard.txt"

class Board {

    private val Squares: List<Square> = defaultChessBoard()


    private fun defaultChessBoard(): List<Square> {
        //go read txt file to fill default board
        val Rows = readFileAsLines(DefaultBoardPath);

        val returnList = mutableListOf<Square>()

        Rows.forEachIndexed { RowIndex, row ->
            row.forEachIndexed { ColIndex, Piece ->
                returnList.add(Square(IntToChar(ColIndex + 1), RowIndex + 1, Piece))
            }
        }

        return returnList;

    }


    private fun IntToChar(Col: Int): Char =
        when (Col) {
            1 -> 'a'
            2 -> 'b'
            3 -> 'c'
            4 -> 'd'
            5 -> 'e'
            6 -> 'f'
            7 -> 'g'
            8 -> 'h'
            else -> throw Exception("Col Int couldn't be converted")
        }
}

fun readFileAsLines(fileName: String): List<String> = File(fileName).readLines()


enum class Column(val number: Int) {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8),
}
//override fun toString(): String =
//    Squares.joinToString(separator = "") { square -> "${square.col}${square.row}" }
//}

