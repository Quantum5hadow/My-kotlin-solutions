/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/solutions/7626633/kotlin-easy-by-pixelprince-vpes
Problem      : 1758. Minimum Changes To Make Alternating Binary String
Day          : 156
Date         : 2026-03-05
*/

class Solution{
    fun minOperations(s:String):Int{
        var c=0
        for(i in s.indices) if((s[i]-'0')==i%2) c++
        return minOf(c,s.length-c)
    }
}
