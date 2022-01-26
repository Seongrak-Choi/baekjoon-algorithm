package step9

import application.BaseClass

class No1978 : BaseClass(){
    fun main(){
        val n = sc.nextInt()
        var count = 0
        for (i in 0 until n){
            val num = sc.nextInt()
            if (num!=1){
                if(num!=2){
                    for (j in 2 until num){
                        if (num%j==0)
                        {
                            break
                        }else{
                            if (j==num-1)
                                count+=1
                        }

                    }
                }else
                    count+=1
            }
        }
        println(count)
    }
}