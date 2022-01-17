package step7

import application.BaseClass

class No10809:BaseClass() {
    /*
    when으로 알파벳을 구분 한 코드 수행시간 116ms
     */
//    fun main(){
//        val s = sc.nextLine()
//        var charList = Array<Int>(26) { -1 }
//
//        for (i in s.indices){
//            when (s.elementAt(i)){
//                'a'->{
//                   if (charList[0]==-1)
//                       charList[0]=i
//                }
//                'b'->{
//                    if (charList[1]==-1)
//                        charList[1]=i
//                }
//                'c'->{
//                    if (charList[2]==-1)
//                        charList[2]=i
//                }
//                'd'->{
//                    if (charList[3]==-1)
//                        charList[3]=i
//                }
//                'e'->{
//                    if (charList[4]==-1)
//                        charList[4]=i
//                }
//                'f'->{
//                    if (charList[5]==-1)
//                        charList[5]=i
//                }
//                'g'->{
//                    if (charList[6]==-1)
//                        charList[6]=i
//                }
//                'h'->{
//                    if (charList[7]==-1)
//                        charList[7]=i
//                }
//                'i'->{
//                    if (charList[8]==-1)
//                        charList[8]=i
//                }
//                'j'->{
//                    if (charList[9]==-1)
//                        charList[9]=i
//                }
//                'k'->{
//                    if (charList[10]==-1)
//                        charList[10]=i
//                }
//                'l'->{
//                    if (charList[11]==-1)
//                        charList[11]=i
//                }
//                'm'->{
//                    if (charList[12]==-1)
//                        charList[12]=i
//                }
//                'n'->{
//                    if (charList[13]==-1)
//                        charList[13]=i
//                }
//                'o'->{
//                    if (charList[14]==-1)
//                        charList[14]=i
//                }
//                'p'->{
//                    if (charList[15]==-1)
//                        charList[15]=i
//                }
//                'q'->{
//                    if (charList[16]==-1)
//                        charList[16]=i
//                }
//                'r'->{
//                    if (charList[17]==-1)
//                        charList[17]=i
//                }
//                's'->{
//                    if (charList[18]==-1)
//                        charList[18]=i
//                }
//                't'->{
//                    if (charList[19]==-1)
//                        charList[19]=i
//                }
//                'u'->{
//                    if (charList[20]==-1)
//                        charList[20]=i
//                }
//                'v'->{
//                    if (charList[21]==-1)
//                        charList[21]=i
//                }
//                'w'->{
//                    if (charList[22]==-1)
//                        charList[22]=i
//                }
//                'x'->{
//                    if (charList[23]==-1)
//                        charList[23]=i
//                }
//                'y'->{
//                    if (charList[24]==-1)
//                        charList[24]=i
//                }
//                'z'->{
//                    if (charList[25]==-1)
//                        charList[25]=i
//                }
//
//            }
//        }
//        charList.forEach {
//            print("$it ")
//        }
//    }

    fun main(){
        val s = readLine()
        var charList = Array<Int>(26){-1}

        for (i in s!!.indices){
            if (charList[s[i].toInt()-97]==-1)
                charList[s[i].toInt()-97]=i
        }

        charList.forEach {
            print("$it ")
        }
    }
}