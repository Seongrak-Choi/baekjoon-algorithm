import application.BaseClass
import java.util.*
import kotlin.collections.ArrayList

class No1874 : BaseClass() {
    private val stack = Stack<Int>()
    private val stackArray = ArrayList<String>()
    private val nArray = ArrayList<Int>()
    private val inputArray = ArrayList<Int>()
    var index = 0


    fun main() {
        var i = 0
        val n = sc.nextInt()
        for (i in 1..n) {
            nArray.add(i)
            inputArray.add(sc.nextInt())
        }

        while (i < inputArray.size) {
            if (nArray.elementAt(i) < inputArray.elementAt(index)) {
                stackPush(nArray.elementAt(i))
            } else if (nArray.elementAt(i) > inputArray.elementAt(index)) {
                minPop(nArray.elementAt(i))
                continue
            } else {//nArray.elementAt(i) == inputArray.elementAt(index)
                stackPop(nArray.elementAt(i))
                index++
                continue
            }
            i++
        }
    }

    private fun stackPush(int: Int) {
        stack.push(int)
        stackArray.add("+")
    }

    private fun stackPop(int: Int) {
        stack.push(int)
        stack.pop()
        stackArray.add("-")
    }

    private fun minPop(int: Int) {
        if (stack.peek() == inputArray.elementAt(index)) {
            stack.pop()
            stackArray.add("-")
        } else {
            println("NO")
            return
        }
    }

}