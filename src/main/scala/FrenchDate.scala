import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
    def main(args: Array[String]): Unit ={
        val now = new Date
        val df = getDateInstance(LONG, Locale.CHINA)
        println(df format now)
    }
}