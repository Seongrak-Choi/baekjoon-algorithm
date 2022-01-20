package step8

import application.BaseClass

class No10757{
    fun main(){
        val numList = readLine()!!.split(" ")
        val big : String
        val small : String
        var count = 0
        var up = 0
        val resultArr = ArrayList<String>()

        if (numList[0].length>=numList[1].length){
            big=numList[0]
            small=numList[1]
        }else{
            big=numList[1]
            small=numList[0]
        }


        for (i in big.length-1 downTo 0){
            if (small.length-1-count>=0) {
                val sum = Character.getNumericValue(big[i]) + Character.getNumericValue(small[small.length - 1 - count])+up
                up=0
                if (sum>9){
                    up=1
                }
                resultArr.add((sum%10).toString())
                count++
            }else{
                val sum = Character.getNumericValue(big[i])+up
                up=0
                if (sum>9){
                    up=1
                }
                resultArr.add((sum%10).toString())
            }
        }

        if (up!=0)
            resultArr.add("1")

        resultArr.reverse()

        resultArr.forEach {
            print(it)
        }
    }
}