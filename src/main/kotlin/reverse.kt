fun main() {
    var eat = reverse("Good food")
    println(eat)
}

fun reverse(whatToEat: String): String {
    var eat = ""
    for (i in whatToEat.length - 1 downTo 0) {
        eat += whatToEat[i]
    }
    return eat
}