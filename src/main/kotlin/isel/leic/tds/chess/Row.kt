package isel.leic.tds.chess

fun Char.toRowOrNull() = if(Row.values.map { it.digit }.contains(this)) Row(this) else null

fun Int.toRow() = Row(this)

class Row(row: Char) {
    //56 is the ASCII CODE FOR char '8'
    val ordinal: Int = 56 - row.code
    val digit: Char = row

    companion object {
        val values = listOf(
            Row('8'),
            Row('7'),
            Row('6'),
            Row('5'),
            Row('4'),
            Row('3'),
            Row('2'),
            Row('1'))
    }

    //56 is the ASCII CODE for char '8'
    constructor(row : Int): this((56 - row).toChar())
}