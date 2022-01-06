import java.util.Scanner

class No2231 {
    fun main(){
        val sc = Scanner(System.`in`)
        val num = sc.nextInt()

        if (num in 1..1000000){
            for(i in 0..num){
                val numToString = i.toString()
                var digitTotal = 0
                var totalNum = 0
                for (j in numToString.indices){
                    digitTotal += Character.getNumericValue(numToString[j])
                }
                totalNum = digitTotal+i
                if (totalNum==num){
                    print(i)
                    break
                }else if (i==num){
                    print(0)
                    break
                }
            }
        }else{
            print(0)
        }
    }
}