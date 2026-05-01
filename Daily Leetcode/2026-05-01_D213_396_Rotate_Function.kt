
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rotate-function/solutions/8124662/kotlin-easy-by-pixelprince-pa4n
Problem      : 396. Rotate Function
Day          : 213
Date         : 2026-05-01

class Solution{
    fun maxRotateFunction(n:IntArray):Int{
        val s=n.sum();var a=n.indices.sumOf{it*n[it]};var r=a
        for(i in n.size-1 downTo 1){a+=s-n.size*n[i];r=maxOf(r,a)}
        return r
    }
}