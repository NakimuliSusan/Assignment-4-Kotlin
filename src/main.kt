fun main () {
    var a = multiplyElements(arrayOf(3,90,78,65,7,9))
    println(a)
}
fun multiplyElements (num:Array<Int>):Int {
    var product = 1
    num.forEach { number ->
        product*=number


    }
     mixedup(arrayOf("susan",6.8,7,true,7.9F,"mary",5.2))
     var w = getNumber(arrayOf('a','b','c','d','e','f','g','i','h'))
     println(w)
    return product
}
fun mixedup (el:Array<Any>):Double{
    var sum = 0.0
    el.forEach { decimal ->
        if (decimal is Double || decimal is Float){
            sum+=decimal.toString().toDouble()
        }

    }
    println(sum)
    return sum

}
fun getNumber (vowels:Array<Char>):Int {
    var num = 0
    vowels.forEach { vowel ->
        if (vowel =='a' || vowel== 'e' ||vowel == 'i'|| vowel == 'o' || vowel == 'u' ){
           num++

        }
    }
    return num

}