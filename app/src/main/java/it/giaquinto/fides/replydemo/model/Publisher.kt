package it.giaquinto.fides.replydemo.model

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey
import it.giaquinto.fides.replydemo.utils.minus
import java.lang.NumberFormatException

@Entity(tableName = "publisher_table")
data class Publisher(
    val name: String,
    val homepage: Uri
) {
    @PrimaryKey
    var id: Int? = null


    override fun toString(): String {
        return "Publisher(name='$name', homepage='$homepage', id='$id')"
    }

    companion object {
        fun fromString(publisher: String): Publisher {
            var name= "";
            var homepage: Uri? = null
            var id = 0

            var temp = (publisher - "Publisher(" - ")").trim()

            var list = temp.split(",")

            list.forEach {
                    when {
                        it.contains("name") -> {name = (it - "name='" - "'".trim())}
                        it.contains("homepage") -> {
                            var t = it - " homepage='" - "'".trim()
                            homepage = Uri.parse(t)
                        }
                        it.contains(" id") -> {id = try {
                            (it - "id='" - "'").trim().toInt()
                        } catch(e: NumberFormatException) { 0 }
                        }
                    }
            }
            homepage?.let {
                return Publisher(name, it)
            }

            return Publisher(name, Uri.EMPTY)
        }
    }
}