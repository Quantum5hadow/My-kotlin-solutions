/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/binary-gap/solutions/7602155/easy-by-pixelprince-zqjr
Problem      : 868. Binary Gap
Day          : 145
Date         : 2026-02-22
*/

class Solution{
    fun binaryGap(n:Int):Int{
        var x=n;var p=-1;var i=0;var r=0
        while(x>0){
            if(x and 1==1){if(p!=-1)r=maxOf(r,i-p);p=i}
            x=x shr 1;i++
        }
        return r
    }
}
