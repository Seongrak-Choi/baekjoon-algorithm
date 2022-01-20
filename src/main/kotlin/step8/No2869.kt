package step8

import application.BaseClass

class No2869: BaseClass() {
    fun main(){
        val a = sc.nextInt()
        val b = sc.nextInt()
        val v = sc.nextInt()

        if ((v-a)%(a-b)==0)
            print((v-a)/(a-b)+1)
        else
            print((v-a)/(a-b)+2)
    }
}