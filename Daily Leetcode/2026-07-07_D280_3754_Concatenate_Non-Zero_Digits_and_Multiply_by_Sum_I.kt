/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/solutions/8381617/kotlin-easy-by-pixelprince-75se
Problem      : 3754. Concatenate Non-Zero Digits and Multiply by Sum I
Day          : 280
Date         : 2026-07-07
*/

class Solution{
    fun sumAndMultiply(n:Int):Long{
        var x=n;var s=0;var t=""
        while(x>0){val d=x%10;s+=d;if(d>0)t=d.toString()+t;x/=10}
        return ("0$t").toLong()*s
    }
}