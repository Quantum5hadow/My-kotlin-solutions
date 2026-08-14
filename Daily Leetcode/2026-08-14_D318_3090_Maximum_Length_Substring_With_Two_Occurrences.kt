/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/solutions/8460446/kotlin-easy-by-pixelprince-5ej6
Problem      : 3090. Maximum Length Substring With Two Occurrences
Day          : 318
Date         : 2026-08-14
*/
class Solution{
    fun maximumLengthSubstring(s:String):Int{
        val f=IntArray(26);var l=0;var r=0
        for(i in s.indices){
            val c=s[i]-'a';f[c]++
            while(f[c]>2){f[s[l]-'a']--;l++}
            r=maxOf(r,i-l+1)
        }
        return r
    }
}
