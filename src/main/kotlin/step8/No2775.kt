package step8

import application.BaseClass

class No2775: BaseClass() {
    fun main(){
        val n = sc.nextInt()
        val list = Array(15){Array<Int>(15){1}}

        for(i in 1..14){
            list[0][i]=i+1
        }

        for (i in 1 until 15){
           for (j in 1 until 15){
               list[i][j] = list[i-1][j]+list[i][j-1]
           }
        }

        for (i in 0 until n){
            val k = sc.nextInt()
            val n = sc.nextInt()

            println(list[k][n-1])
        }
    }
}