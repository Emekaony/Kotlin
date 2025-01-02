package main.kotlin.com.emeka.first_step

fun main( ) {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filterOdd: (Int) -> Boolean = {it % 2 != 0}
    val filterEven: (Int) -> Boolean = {it % 2 == 0}

    filterList(nums, filterEven)
    filterList(nums, filterOdd)
}

fun filterList(ll: List<Int>, predicate: (Int) -> Boolean) {
    // this functional programming thing is madness, whatttttt!!!
    ll.filter(predicate).forEach { println(it) }
}