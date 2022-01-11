package step5
import java.util.Scanner

class No2577 {
    fun main(){
        val sc = Scanner(System.`in`)

        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()


        var zero = 0
        var one = 0
        var two = 0
        var three = 0
        var four = 0
        var five = 0
        var six = 0
        var seven = 0
        var eight= 0
        var nine = 0

        val str = (a*b*c).toString()

        for (i in str){
            when (i){
                '0'-> zero++
                '1'->one++
                '2'->two++
                '3'->three++
                '4'->four++
                '5'->five++
                '6'->six++
                '7'->seven++
                '8'->eight++
                '9'->nine++
            }
        }
        println(zero)
        println(one)
        println(two)
        println(three)
        println(four)
        println(five)
        println(six)
        println(seven)
        println(eight)
        println(nine)
    }
}