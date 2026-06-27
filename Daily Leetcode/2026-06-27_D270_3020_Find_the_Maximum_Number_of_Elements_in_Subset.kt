/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset/submissions/2047608126
Problem      : 3020. Find the Maximum Number of Elements in Subset
Day          : 270
Date         : 2026-06-27
*/

class Solution{
    fun maximumLength(a:IntArray):Int{
        val c=HashMap<Double,Int>()
        for(x in a)c[x.toDouble()]=(c[x.toDouble()]?:0)+1
        var r=c[1.0]?.let{it-(it+1)%2}?:1
        for(x in a)if(x>1){
            var s=1;var y=sqrt(x.toDouble())
            while((c[y]?:0)>1){s+=2;y=sqrt(y)}
            r=maxOf(r,s)
        }
        return r
    }
}