/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii/solutions/8315056/kotlin-easy-by-pixelprince-pbz9
Problem      : 3753. Total Waviness of Numbers in Range II
Day          : 248
Date         : 2026-06-05
*/

class Solution{
    fun totalWaviness(a:Long,b:Long):Long{
        val p=LongArray(17);p[0]=1
        for(i in 1..16)p[i]=p[i-1]*10
        fun calc(x:Long):Long{
            val s="$x"
            val dp=HashMap<String,Long>()
            fun f(i:Int,pp:Int,pr:Int,t:Boolean):Long{
                if(i==s.length)return 0
                val k="$i $pp $pr $t"
                dp[k]?.let{return it}
                var r=0L
                for(d in 0..if(t)9 else s[i]-'0'){
                    val nt=t||d<s[i]-'0'
                    if(pp>=0&&(pp-pr)*(d-pr)>0)
                        r+=if(nt)p[s.length-1-i] else (s.substring(i+1).toLongOrNull()?:0)+1
                    r+=f(i+1,if(pr<0&&d==0)-1 else pr,if(pr<0&&d==0)-1 else d,nt)
                }
                return dp.put(k,r)?:r
            }
            return f(0,-1,-1,false)
        }
        return calc(b)-calc(a-1)
    }
}