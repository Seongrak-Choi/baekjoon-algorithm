package step2
import java.util.Scanner

class No2884_alarmWatch {
    fun main(){
        val sc = Scanner(System.`in`)
        val h = sc.nextInt()
        val m = sc.nextInt()

        val alarmM = m-45

        if (alarmM<0){
            val alarmH = h-1
            if (alarmH<0)
                println("${24+alarmH} ${60+alarmM}")
            else
                println("$alarmH ${60+alarmM}")
        }
        else
            println("$h $alarmM")
    }
}