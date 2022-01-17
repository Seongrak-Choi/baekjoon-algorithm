package step8

import application.BaseClass

class No1712 : BaseClass() {
    /*
    나는 while문으로 돌리면서 처리했지만, 수학적으로 간편하게 풀어버릴 수도 있다.
     */
    //    fun main(){
//        val a = sc.nextInt()
//        var b = sc.nextInt()
//        var c = sc.nextInt()
//
//
//        var brakeEvenPoint : Long= 0
//        var bb : Long = 0
//        var count : Long = 0
//
//        if (b<c){
//            while ((a+bb)>=brakeEvenPoint){
//                count++
//                bb=b*count
//                brakeEvenPoint=c*count
//            }
//            println(count)
//        }else{
//            println("-1")
//        }
//    }
    fun main() {
        val case = readLine()!!.split(" ")
        val a = case[0].toLong()
        val b = case[1].toLong()
        val c = case[2].toLong()

        if (c - b <= 0)
            print("-1")
        else
            print("${a/(c-b)+1}")
    }
}