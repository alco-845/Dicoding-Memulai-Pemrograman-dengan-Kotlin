// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(""""
        String result: $stringResult
        Int result: $intResult
    """.trimMargin())
}

// TODO 1
fun <T> getResult(args: T): Int {
    var res = 0

    if(args is Int)  res = args * 5

    else if(args is String) res = args.length

    return res
}