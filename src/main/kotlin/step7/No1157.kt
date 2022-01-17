package step7

class No1157 {
    fun main(){
        var charList = Array(26){0}
        val s = readLine()!!
        var upperS=s.uppercase()
        var maxIndex:Int?=0
        for (i in s.indices){
            charList[upperS[i].toInt()-65]+=1
        }

        maxIndex= charList.indexOf(charList.maxOrNull())

        for (j in maxIndex+1 until charList.size){
            if (charList.maxOrNull()==charList.elementAt(j)){
                println("?")
                return
            }
        }
        println((charList.indexOf(charList.maxOrNull())+65).toChar())
    }
}