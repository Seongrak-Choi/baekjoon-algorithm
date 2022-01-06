package step2
import java.util.Scanner
class No1330_num_compare {
    fun main(){
        val sc = Scanner(System.`in`)
        val num1 = sc.nextInt()
        val num2 = sc.nextInt()

        if (num1<num2)
            println("<")
        else if (num1>num2)
            println(">")
        else
            println("==")
    }
}