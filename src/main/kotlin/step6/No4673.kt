package step6


class No4673 {
    /*
    이 방법은 2376ms 이상 시간이 걸림
     */
//    fun main() {
//        for (i in 1..10000) {
//            var check = false
//            for (j in 1..i) {
//                val strNum = j.toString()
//                var sum = j
//                for (k in strNum.indices) {
//                    sum += Character.getNumericValue(strNum[k])
//                }
//
//                if (sum==i){
//                    check=false
//                    break
//                }
//
//                if (i==j)
//                    check=true
//            }
//            if (check)
//                println(i)
//        }
//    }

    fun main(){
        for (i in 1..10000){
            var check = false
            for (j in 1..i){
                if (isNum(j)==i){
                    break
                }
                if (i==j){
                    check=true
                }
            }
            if (check)
                println(i)
        }
    }

    fun isNum(n:Int):Int{
        var num=n
        var sum=num
        while (num>0){
            sum+=num%10
            num /= 10
        }
        return sum
    }
}