package hello_kotlin

import hello_kotlin.hello_kotlin.FileReader


fun main(args: Array<String>) {

   val readFile = FileReader()
     readFile.readFileLineByLineUsingForEachLine("src/resources/thermopylae.txt")



}
