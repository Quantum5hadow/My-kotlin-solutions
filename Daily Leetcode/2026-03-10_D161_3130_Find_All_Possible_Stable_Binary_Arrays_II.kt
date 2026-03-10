/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-all-possible-stable-binary-arrays-ii/solutions/7638588/kotlin-easy-by-pixelprince-pzkl
Problem      : 3130. Find All Possible Stable Binary Arrays II
Day          : 161
Date         : 2026-03-10
*/

class Solution{
    fun numberOfStableArrays(z:Int,o:Int,l:Int):Int{
        val M=1_000_000_007
        val dp=HashMap<Int,Long>()
        fun f(a:Int,b:Int):Long=
            if(a<=0||b<0)0
            else if(b==0)if(a<=l)1 else 0
            else dp.getOrPut(a*1000+b){
                (f(a-1,b)+f(b,a-1)-f(b,a-minOf(a,l)-1)+M)%M
            }
        return ((f(z,o)+f(o,z))%M).toInt()
    }
}

