package step5
import java.util.Scanner

class No4344 {
    fun main(){
        val sc = Scanner(System.`in`)
        val arr = ArrayList<String>()

        val count = sc.nextInt()

        for(i in 0 until count){
            val score = readLine()
            arr.add(score!!)
        }

        for (j in arr){
            var sum = 0
            var person = 0
            val list = j.split(" ")

            for (k in 1 until list.size){
                sum += list.elementAt(k).toInt()
            }

            val avg = sum.toFloat()/(list.size-1).toFloat()

            for (l in 1 until list.size){
                if (avg<list.elementAt(l).toInt()){
                    person++
                }
            }

            println("%.3f".format(person.toFloat()/(list.size-1).toFloat()*100f)+"%")
        }
    }
}