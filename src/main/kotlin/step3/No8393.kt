package step3

import application.BaseClass

class No8393: BaseClass() {
    fun main(){
        val sc = sc
        val n = sc.nextInt()
        var sum = 0
        for (i in 1..n)
            sum+=i
        println(sum)
    }
}