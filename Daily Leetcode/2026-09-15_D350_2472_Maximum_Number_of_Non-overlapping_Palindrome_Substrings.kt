/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/solutions/8522537/kotlin-easy-by-pixelprince-w0hq
Problem      : 2472. Maximum Number of Non-overlapping Palindrome Substrings
Day          : 350
Date         : 2026-09-15
*/

class Solution{
    fun maxPalindromes(s:String,k:Int):Int{
        val n=s.length
        val p=Array(n){BooleanArray(n)}
        for(i in n-1 downTo 0)for(j in i until n)
            p[i][j]=s[i]==s[j]&&(j-i<2||p[i+1][j-1])
        val d=IntArray(n+1)
        for(i in 1..n){
            d[i]=d[i-1]
            for(j in 0..i-k)if(p[j][i-1])d[i]=maxOf(d[i],d[j]+1)
        }
        return d[n]
    }
}