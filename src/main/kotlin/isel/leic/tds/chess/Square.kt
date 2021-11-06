package isel.leic.tds.chess

data class Square(val col: Char, val row: Int, val piece: Char?){

    init{
        CheckColumnValue(col)
        CheckRowValue(row)
        CheckPieceValue(piece)
    }

    private val PieceValues = listOf('r','b','n','k','q','p', ' ', null)
    private val RowValues = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    private val ColumnValues = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')

    fun CheckColumnValue(Column : Char) =
        check(ColumnValues.contains(Column)) { "Column value is not valid" }

    fun CheckRowValue(Row : Int) =
        check(RowValues.contains(Row)) { "Row value is not valid" }

    fun CheckPieceValue(Piece : Char?){

        check(PieceValues.contains(Piece?.lowercaseChar())) { "Piece value is not valid" }

    }

}






