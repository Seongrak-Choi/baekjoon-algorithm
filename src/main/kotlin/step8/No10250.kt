package step8

import application.BaseClass

class No10250 : BaseClass() {
    fun main() {
        val t = sc.nextInt()
        var list = Array(t){""}
        for (i in 0 until t){
            val h = sc.nextInt()
            val w = sc.nextInt()
            val n = sc.nextInt()

            var unit : Int
            val floor : String

            if (n%h!=0) {
                unit = n % h
                floor = String.format("%02d", n / h + 1)
            }
            else{
                unit = h
                floor = String.format("%02d", n / h)
            }


            list[i]="$unit$floor"
        }

        list.forEach {
            println(it)
        }
    }
}