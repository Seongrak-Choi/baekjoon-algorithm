package step8
import java.util.Scanner
import kotlin.math.*

class No1011 {
    fun main() {
        val sc = Scanner(System.`in`)

        val num = sc.nextInt()

        for (i in 0 until num){
            val num1 = sc.nextInt()
            val num2 = sc.nextInt()

            val d = num2-num1

            var n:Long = 0

            while(true){
                if (d<=n*(n+1))
                    break
                n+=1
            }

            if (d<=(n.toDouble().pow(2)))
                println(n*2-1)
            else
                println(n*2)
        }
    }
}