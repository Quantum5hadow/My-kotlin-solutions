/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-all-possible-stable-binary-arrays-i/solutions/7636806/kotlin-easy-by-pixelprince-4e7l
Problem      : 3129. Find All Possible Stable Binary Arrays I
Day          : 160
Date         : 2026-03-09
*/ 

class Solution{
    fun numberOfStableArrays(z:Int,o:Int,l:Int):Int{
        val mod=1_000_000_007
        val dp=HashMap<Int,Int>()
        fun f(a:Int,b:Int):Int{
            if(a==0)return 0
            if(b==0)return if(a<=l)1 else 0
            return dp.getOrPut(a*401+b){
                var r=0
                for(i in 1..minOf(a,l)) r=(r+f(b,a-i))%mod
                r
            }
        }
        return (f(z,o)+f(o,z))%mod
    }
}

