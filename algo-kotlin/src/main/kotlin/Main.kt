import java.util.*

class Solution {
    fun solution(name: String): Int {
        var answer = 0

        val aasd: Int = name.map {
            getDistance(it)
        }.reduce { acc, current ->
            acc + current
        }

        return answer
    }

    private fun getDistance(c: Char): Int {
        val dist: Int = c - 'A'
        return min(dist, 26 - dist)
    }

    private fun <T: Int> min(a: T, b: T) = if(a > b) b else a
}