import java.text.SimpleDateFormat
import java.util.*


fun main () {
    println("Exercise 1: " + evenIndexAvg(masivi))
    println("Exercise 2: " + isPalindrome(str))
    println("Exercise 3: " + currentDate.formatted())
}

//დავალება 1
/*
        დაწერეთ ფუნქცია, რომელიც პარამეტრად მიიღებს მთელი რიცხვების მასივს და დააბრუნებს
    მთელ მნიშვნელობას.ფუნქციამ უნდა გამოთვალოს მასივში ლუწ ინდექსზე მდგომი რიცხვების
    საშუალო არითმეტიკული.
    მოიყვანეთ ფუნქციის გამოყენების მაგალითი.

 */


val masivi = intArrayOf(2,7,12,7,53,12,6,5,5,26)

fun evenIndexAvg(args: IntArray): Int {

    //ლუწ ინდექსზე მდგომი ელემენტების წამოღება თავდაპირველი მასივიდან და ახალ მასივში გადაწერა
    val evenIndexedMasivi = args.filterIndexed { i, new -> i > 1 && i % 2 == 0 }

    //ახალი მასივის საშუალოს გამოთვლა
    return evenIndexedMasivi.sum() / evenIndexedMasivi.size
}


//დავალება 2
/*
        დაწერეთ ფუნქცია, რომელსაც გადაეცემა String ტიპის პარამეტრი და დააბრუნებს Boolean
    მნიშვნელობას.ფუნქციამ უნდა დააბრუნოს true, თუ გადმოცემული String მნიშვნელობა
    პალინდრომია, წინააღმდეგ შემთხვევაში false.
    (პალინდრომი— სიტყვა, ფრაზა ან ლექსი, რომელიც წაღმა და უკუღმა ერთნაირად იკითხება)
 */

val str = "hannah"

fun isPalindrome (arg: String): Boolean {
    //შებრუნება
    val reverseStr = arg.reversed()

    return reverseStr == str
}


//დავალება 3
/*
        დაწერეთ extension ფუნქცია Date კლასისთვის, რომელსაც გადაეცემა პატერნი და დააბრუნებს
    დაფორმატებულ დროს String - ად.
 */

private const val DATE_FORMAT = "dd/MM/yyyy"
val currentDate = System.currentTimeMillis()

fun Long.formatted(): String {
    //დაფორმატება
    val simpleDateFormat = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
    simpleDateFormat.timeZone = TimeZone.getDefault()

    return simpleDateFormat.format(Date(this))
}




