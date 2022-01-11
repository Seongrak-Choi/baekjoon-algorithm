package step4

import application.BaseClass

class No1110:BaseClass() {
    fun main() {

        var x = sc.nextInt().let {
            if (it !in 0..99){
                return
            }else
                it
        }

        var n=x
        var count = 0

        do {
            count+=1
            var n1 = n/10
            var n2 = n%10

            n=(n2*10)+(n1+n2)%10
        }while (x!=n)

        println(count)
    }
}