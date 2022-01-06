package step1
import java.util.Scanner

class No2588_Multi {
    fun main(){
        val sc = Scanner(System.`in`)
        val a = sc.next()
        val b = sc.next()

        for(i in b.length-1 downTo 0){
            val number : Int = Character.getNumericValue(b[i])
            println(a.toInt()*number)
        }
        println(a.toInt()*b.toInt())
    }
}