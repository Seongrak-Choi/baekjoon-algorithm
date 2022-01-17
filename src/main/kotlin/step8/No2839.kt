package step8

import application.BaseClass

class No2839: BaseClass() {
    fun main(){
        val n = sc.nextInt()

        var quotient5 = n/5

        for (i in quotient5 downTo 1){
            var a = n-5*i
            if (a==0){
                println(i)
                return
            }else{
                if (a%3==0){
                    println("${i+(a/3)}")
                    return
                }
            }
        }

        if (n%3==0)
            println(n/3)
        else
            println("-1")
    }
}