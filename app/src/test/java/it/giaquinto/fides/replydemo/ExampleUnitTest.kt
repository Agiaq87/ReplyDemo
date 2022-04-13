package it.giaquinto.fides.replydemo

import it.giaquinto.fides.replydemo.model.Publisher
import it.giaquinto.fides.replydemo.utils.minus
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkMinusOperation() {
        assertEquals("Pub", "Publisher(" - "lisher(")
        assertEquals("Publ", "Publisher(" - "isher(")
        assertEquals("Publi", "Publisher(" - "sher(")
    }

    @Test
    fun publisherConvertedFromString() {
        var p = Publisher.fromString("Publisher(name='name', homepage='http://www.google.it', id='id')");
        assertEquals("Publisher(name='name', homepage='http://www.google.it', id='id')", p.toString())
    }
}