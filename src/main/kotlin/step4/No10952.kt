package step4

import application.BaseClass

class No10952 : BaseClass(){
    fun main(){
        var a: Int? = null
        var b: Int? = null
        var list = ArrayList<Int>()

        while (a!=0 && b!=0){
            a = sc.nextInt()
            b = sc.nextInt()

            if (a==0 && b==0)
                break

            list.add(a+b)
        }

        list.forEach { it->
            println(it)
        }
    }
}