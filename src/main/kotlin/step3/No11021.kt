package step3

import application.BaseClass

class No11021 : BaseClass() {
    fun main(){
        val count = sc.nextInt()

        for (i in 1 .. count){
            val a = sc.nextInt()
            val b = sc.nextInt()
            println("Case #$i: ${a+b}")
        }
    }
}