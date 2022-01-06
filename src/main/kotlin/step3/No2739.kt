package step3
import java.util.Scanner
class No2739 {
    fun main(){
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()

        for (i in 1..9)
            println("$n * $i = ${n*i}")
    }
}