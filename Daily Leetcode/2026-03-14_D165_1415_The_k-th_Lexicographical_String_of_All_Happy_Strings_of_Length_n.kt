/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/solutions/7658087/kotlin-easy-by-pixelprince-6th1
Problem      : 1415. The k-th Lexicographical String of All Happy Strings of Length n
Day          : 165
Date         : 2026-03-14
*/

class Solution{
    fun getHappyString(n:Int,k:Int):String{
        val a=charArrayOf('a','b','c');var kk=k;var res=""
        fun dfs(s:String,p:Int){
            if(res!="")return
            if(s.length==n){if(--kk==0)res=s;return}
            for(i in 0..2)if(i!=p)dfs(s+a[i],i)
        }
        dfs("",-1)
        return res
    }
}
