package step6

import application.BaseClass

class No1065:BaseClass() {
    fun main(){
        val n = sc.nextInt()
        var count = 0

        for (i in 1 .. n){
            if (i<100)
                count++
            else{
                var num1 = i%10
                var num10 = i%100/10
                var num100 = i/100

                if ((num100-num10)==(num10-num1))
                    count++
            }
        }
        println(count)
    }
}