package step7

class No2908 {
    /*
    리벌스 하는 함수를 직접 만들어서 112ms 가 나왔다.
     */
    fun main(){
        val s = readLine()!!

        val splitList=s.split(" ")

        val frontNum = reverseNum(splitList[0])
        val backNum = reverseNum(splitList[1])

        if (frontNum.toInt()<backNum.toInt())
            println(backNum)
        else
            println(frontNum)
    }


    private fun reverseNum(num:String):String{
        val numToInt = num.toInt()
        val num1 = numToInt%10
        val num10 = numToInt/10%10
        val num100 = numToInt/100

        return "$num1$num10$num100"
    }

    /*
    reverser를 이용하여 코드의 길이는 줄였지만 이상하게 수행시간은 116ms로 거의 비슷하다.
     */
//    fun main(){
//        val s = readLine()!!
//
//        val splitList = s.reversed().split(" ")
//
//        if (splitList[0]<splitList[1])
//            println(splitList[1])
//        else
//            println(splitList[0])
//    }
}