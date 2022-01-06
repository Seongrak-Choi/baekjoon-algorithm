package step3

import application.BaseClass

class No10871:BaseClass() {
    fun main(){
        val aArray = ArrayList<Int>()
        val n = sc.nextInt()
        val x = sc.nextInt()

        for (i in 0 until n){
            val a = sc.nextInt()
            if (a<x)
                aArray.add(a)
        }
        print(aArray.joinToString(separator = " "))
    }
}