package step2
import java.util.Scanner

class No2753_LeapYear {
    fun main(){
        val sc  = Scanner(System.`in`)
        val year = sc.nextInt()

        if (year in 1..4000){
            if (year%400==0){
                println(1)
            }else if (year%100!=0){
                if (year%4==0){
                    println(1)
                }else
                    println(0)
            }else{
                println(0)
            }
        }
    }
}