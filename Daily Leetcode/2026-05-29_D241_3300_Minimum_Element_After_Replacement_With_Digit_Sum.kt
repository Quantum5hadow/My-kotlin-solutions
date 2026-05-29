/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/solutions/8300839/kotlin-easy-by-pixelprince-vycc
Problem      : 3300. Minimum Element After Replacement With Digit Sum
Day          : 241
Date         : 2026-05-29
*/

class Solution{
    fun minElement(a:IntArray)=a.minOf{
        var x=it;var s=0
        while(x>0){s+=x%10;x/=10}
        s
    }
}