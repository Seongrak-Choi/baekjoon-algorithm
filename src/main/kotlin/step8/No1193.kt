package step8

import application.BaseClass

class No1193 : BaseClass() {
    fun main(){
        val x = sc.nextInt()

        var line=0
        var maxCount=0

        while (x> maxCount){
            line+=1
            maxCount+=line
        }

        var gap = maxCount-x

        if (line%2==0)
            println("${line-gap}/${gap+1}")
        else
            println("${gap+1}/${line-gap}")
    }
}