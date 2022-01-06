package step3

import application.BaseClass

class No2438:BaseClass() {
    fun main(){
        val n = sc.nextInt()

        for (i in 0 until  n){
            for (j in 0..i){
                print("*")
            }
            println()
        }
    }
}