/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-distance-to-type-a-word-using-two-fingers/solutions/7921368/kotlin-easy-by-pixelprince-o658
Problem      : 1320. Minimum Distance to Type a Word Using Two Fingers
Day          : 194
Date         : 2026-04-12
*/

class Solution{
    private val pos=Array(26){it/6 to it%6}
    fun minimumDistance(w:String):Int{
        val n=w.length;val dp=HashMap<Triple<Int,Int,Int>,Int>()
        fun d(a:Int,b:Int)=if(a<0||b<0)0 else
            kotlin.math.abs(pos[a].first-pos[b].first)+kotlin.math.abs(pos[a].second-pos[b].second)
        fun f(i:Int,x:Int,y:Int):Int{
            if(i==n)return 0
            val key=Triple(i,x,y);dp[key]?.let{return it}
            val cur=w[i]-'A'
            val r=minOf(d(x,cur)+f(i+1,cur,y),d(y,cur)+f(i+1,x,cur))
            dp[key]=r;return r
        }
        return f(0,-1,-1)
    }
}