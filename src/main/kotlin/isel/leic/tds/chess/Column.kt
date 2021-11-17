package isel.leic.tds.chess

fun Char.toColumnOrNull() = if(Column.values.map { it.letter }.contains(this)) Column(this) else null

fun Int.toColumn() = Column(this)

class Column(col: Char) {

    val ordinal: Int = col.code - 97
    val letter: Char = col

    companion object {
        val values = listOf(Column('a'), Column('b'), Column('c'), Column('d'), Column('e'), Column('f'), Column('g'), Column('h'))
    }

    //for numbers
    constructor(col : Int): this((col + 97).toChar())
}