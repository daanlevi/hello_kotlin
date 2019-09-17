package hello_kotlin

import hello_kotlin.hello_kotlin.Calculate
import hello_kotlin.hello_kotlin.FileReader


fun main(args: Array<String>) {

   val readFile = FileReader()

    //readFile.readFileLineByLineUsingForEachLine("src/resources/thermopylae.txt")

     readFile.readFileAsLinesUsingUseLines("src/resources/thermopylae.txt").forEach {
         println(it)
     }

    val a =1
    val b =3
    val c =4

    val daniel = Calculate()
    val i = daniel.sum2(a, b)
    print(i)

    print(Calculate().sum2(2,3) +c)

    Calculate().sum(a, b)

    val resC = Calculate().sum2(2,3)+ c
}
