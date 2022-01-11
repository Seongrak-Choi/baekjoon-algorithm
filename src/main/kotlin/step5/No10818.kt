package step5
import java.util.Scanner

class No10818 {
    fun main(){
        val sc = Scanner(System.`in`)
        val count = sc.nextInt()

        val firstNum=sc.nextInt()
        var min = firstNum
        var max = firstNum


        for (i in 0 until count-1){
            val inputNum = sc.nextInt()

            if (min>inputNum)
                min=inputNum

            if (max<inputNum)
                max=inputNum
        }

        println("$min $max")
    }
}