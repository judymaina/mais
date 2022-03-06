import java.util.*

fun main(){
house(arrayOf("Bungalow","Bedsitter","Single","Mansion"))
    city()
    nums(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    jina(arrayOf("Joy","Jane","Mark"))
    }
fun house(names:Array<String>){
    println(names.contentToString())

}
fun city(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { names ->
        println(names.capitalize())
    }

}
fun nums(numbers:Array<Int>){
var add=numbers[1]+numbers[4]
    println(add)
    var index=numbers.indexOf(158)
println(index)
    var order=numbers.sortedArray()
    println(Arrays.toString(order))

}
fun jina(names:Array<String>):Array<String>{
    var name = names
    println(names.contentToString())
    return(name)



}