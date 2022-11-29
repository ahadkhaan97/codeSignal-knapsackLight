fun main() {
    print(solution(3, 5, 3, 8, 10))
}

fun solution(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    return if (weight1 + weight2 <= maxW) {
        value1 + value2
    } else if ((value1 >= value2 || weight2 > maxW) && weight1 <= maxW) {
        value1
    } else if (value2 > value1 && weight2 <= maxW) {
        value2
    } else {
        0
    }
}