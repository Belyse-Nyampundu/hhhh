fun main(){
    names(name = "Ada")

    div(14,4)
    var result = div(14,4)
    println(result)

    add(1,2,3,4)
    var sum =add(1,2,3,4)
    println(sum)

    fact(fact = "I love cartoon")

}
fun names(name: String) {
    var names = ("Hello" +" "+name)
    println(names)
}
fun div(num1: Int, num2: Int): Int {
    return num1%num2
}
fun add(x: Int,y: Int,z: Int,Q: Int): Int {
    var sum = x+y+z+Q
    return sum
    println(sum)
}
fun fact(fact: String){
    var fact = "I love cartoon"
    println(fact)
}