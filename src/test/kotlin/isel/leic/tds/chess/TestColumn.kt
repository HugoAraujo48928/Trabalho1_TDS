import isel.leic.tds.chess.*
import kotlin.test.*

/**
 * The Column type identifies one of the columns on the board, also called files.
 * Columns are identified by a letter from 'a' to 'h'. The left column is 'a'.
 */
class TestColumn {
    @Test
    fun `Letter to Column with ordinal property`() {
        val column = 'c'.toColumnOrNull()
        assertNotNull(column)
        assertEquals(2, column.ordinal)

    }
    @Test
    fun `Int to Column with letter property`() {
        val column = 3.toColumn()
        assertEquals('d' ,column.letter)
    }
    @Test
    fun `Invalid letter to Column results null`() {
        val column = 'x'.toColumnOrNull()
        assertNull(column)
    }
    @Test
    fun `All valid letters to columns`() {
        assertEquals((0..7).toList(),  ('a'..'z').mapNotNull{ it.toColumnOrNull()?.ordinal })
    }
    @Test
    fun `Get all valid values of Column`() {
        Column

        assertEquals(8, Column.values.size)
        assertEquals(('a'..'h').toList(), Column.values.map{ it.letter })
    }
    @Test
    fun `All invalid columns`() {
        val invalidChars = (0..255).map{ it.toChar() } - ('a'..'h')
        val invalidColumns = invalidChars.mapNotNull{ it.toColumnOrNull() }
        assertEquals(0 , invalidColumns.size)
    }
}