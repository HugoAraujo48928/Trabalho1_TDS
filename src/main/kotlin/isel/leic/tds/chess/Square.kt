package isel.leic.tds.chess



fun String.toSquareOrNull() : Square? {
    if(this.length == 2)
        if (this[0].toColumnOrNull() != null && this[1].toRowOrNull() != null)
            return Square(this[0].toColumnOrNull()!! , this[1].toRowOrNull()!!)
    return null
}


class Square(col: Column, ro: Row) {

    val column = col
    val row = ro

    override fun toString() = "".plus(this.column.letter).plus(this.row.digit)

    companion object {
        val values = listOf(
            Square(0.toColumn(),0.toRow()),
            Square(0.toColumn(),1.toRow()),
            Square(0.toColumn(),2.toRow()),
            Square(0.toColumn(),3.toRow()),
            Square(0.toColumn(),4.toRow()),
            Square(0.toColumn(),5.toRow()),
            Square(0.toColumn(),6.toRow()),
            Square(0.toColumn(),7.toRow()),
            Square(1.toColumn(),0.toRow()),
            Square(1.toColumn(),1.toRow()),
            Square(1.toColumn(),2.toRow()),
            Square(1.toColumn(),3.toRow()),
            Square(1.toColumn(),4.toRow()),
            Square(1.toColumn(),5.toRow()),
            Square(1.toColumn(),6.toRow()),
            Square(1.toColumn(),7.toRow()),
            Square(2.toColumn(),0.toRow()),
            Square(2.toColumn(),1.toRow()),
            Square(2.toColumn(),2.toRow()),
            Square(2.toColumn(),3.toRow()),
            Square(2.toColumn(),4.toRow()),
            Square(2.toColumn(),5.toRow()),
            Square(2.toColumn(),6.toRow()),
            Square(2.toColumn(),7.toRow()),
            Square(3.toColumn(),0.toRow()),
            Square(3.toColumn(),1.toRow()),
            Square(3.toColumn(),2.toRow()),
            Square(3.toColumn(),3.toRow()),
            Square(3.toColumn(),4.toRow()),
            Square(3.toColumn(),5.toRow()),
            Square(3.toColumn(),6.toRow()),
            Square(3.toColumn(),7.toRow()),
            Square(4.toColumn(),0.toRow()),
            Square(4.toColumn(),1.toRow()),
            Square(4.toColumn(),2.toRow()),
            Square(4.toColumn(),3.toRow()),
            Square(4.toColumn(),4.toRow()),
            Square(4.toColumn(),5.toRow()),
            Square(4.toColumn(),6.toRow()),
            Square(4.toColumn(),7.toRow()),
            Square(5.toColumn(),0.toRow()),
            Square(5.toColumn(),1.toRow()),
            Square(5.toColumn(),2.toRow()),
            Square(5.toColumn(),3.toRow()),
            Square(5.toColumn(),4.toRow()),
            Square(5.toColumn(),5.toRow()),
            Square(5.toColumn(),6.toRow()),
            Square(5.toColumn(),7.toRow()),
            Square(6.toColumn(),0.toRow()),
            Square(6.toColumn(),1.toRow()),
            Square(6.toColumn(),2.toRow()),
            Square(6.toColumn(),3.toRow()),
            Square(6.toColumn(),4.toRow()),
            Square(6.toColumn(),5.toRow()),
            Square(6.toColumn(),6.toRow()),
            Square(6.toColumn(),7.toRow()),
            Square(7.toColumn(),0.toRow()),
            Square(7.toColumn(),1.toRow()),
            Square(7.toColumn(),2.toRow()),
            Square(7.toColumn(),3.toRow()),
            Square(7.toColumn(),4.toRow()),
            Square(7.toColumn(),5.toRow()),
            Square(7.toColumn(),6.toRow()),
            Square(7.toColumn(),7.toRow()))
    }
}




