package step8

import application.BaseClass

class No2292: BaseClass() {
    fun main(){
        val n = sc.nextInt()
        var startNum = 2
        var count = 0

        if (n!=1){
            while (true){
                count++
                var endNum = startNum+(6*count)
                if (n in startNum until endNum){
                    break
                }
                startNum=endNum
            }
        }
        print(++count)
    }
}