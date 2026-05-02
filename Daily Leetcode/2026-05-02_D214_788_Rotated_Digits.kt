
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rotated-digits/solutions/8134398/kotlin-easy-by-pixelprince-gkxs
Problem      : 788. Rotated Digits
Day          : 214
Date         : 2026-05-02

class Solution{
    fun rotatedDigits(n:Int):Int{
        var c=0
        fun ok(x:Int):Boolean{
            var t=x;var f=false
            while(t>0){
                val d=t%10
                if(d==3||d==4||d==7)return false
                if(d==2||d==5||d==6||d==9)f=true
                t/=10
            }
            return f
        }
        for(i in 1..n)if(ok(i))c++
        return c
    }
}