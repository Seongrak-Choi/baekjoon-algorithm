package step1
import java.util.Scanner

class ArithmeticOperation {

    fun main(){
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a+b)
        println(a-b)
        println(a*b)
        println(a/b)
        println(a%b)
    }
}