/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/solutions/7621887/kotlin-easy-by-pixelprince-btfo
Problem      : 1545. Find Kth Bit in Nth Binary String
Day          : 154
Date         : 2026-03-03
*/

class Solution {
    fun findKthBit(n: Int, k: Int): Char {
        var str = StringBuilder("0")
        for(i in 2..n){
            str.append('1')
            for(j in str.length-2 downTo 0) str.append((str[j].code xor 1).toChar())
        }
        return str[k-1]
    }
}
