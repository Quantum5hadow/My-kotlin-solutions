/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-unique-binary-string/solutions/7634549/easy-by-pixelprince-u1in
Problem      : 1980. Find Unique Binary String
Day          : 159
Date         : 2026-03-08
*/

class Solution{
    fun findDifferentBinaryString(a:Array<String>):String{
        val n=a.size
        val r=CharArray(n)
        for(i in 0 until n) r[i]=if(a[i][i]=='0')'1' else '0'
        return String(r)
    }
}
