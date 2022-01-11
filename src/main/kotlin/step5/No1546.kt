package step5
import java.util.Scanner

class No1546 {
    fun main(){
        val sc = Scanner(System.`in`)
        val count = sc.nextInt()
        var maxScore = 0
        val scoreArr = ArrayList<Int>()

        for (i in 0 until count){
            val score = sc.nextInt()
            if (maxScore<score)
                maxScore=score
            scoreArr.add(score)
        }
        var sum = 0f

        for (j in scoreArr){
            sum+=(j.toFloat()/maxScore.toFloat())*100
        }
        println(sum/scoreArr.size)
    }
}