/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/two-furthest-houses-with-different-colors/solutions/8012849/kotlin-easy-by-pixelprince-grqs
Problem      : 2078. Two Furthest Houses With Different Colors
Day          : 202
Date         : 2026-04-20
*/

class Solution{
    fun maxDistance(c:IntArray):Int{
        val n=c.size
        for(i in 0 until n)
            if(c[i]!=c[n-1]||c[n-1-i]!=c[0])return n-1-i
        return 0
    }
}