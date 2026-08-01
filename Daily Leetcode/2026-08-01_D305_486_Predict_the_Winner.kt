/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/predict-the-winner/solutions/8433670/kotlin-easy-by-pixelprince-bnwk
Problem      : 486. Predict the Winner
Day          : 305
Date         : 2026-08-01
*/

class Solution{
    fun predictTheWinner(a:IntArray):Boolean{
        val d=a.clone()
        for(i in a.lastIndex-1 downTo 0)
            for(j in i+1..a.lastIndex)
                d[j]=maxOf(a[i]-d[j],a[j]-d[j-1])
        return d.last()>=0
    }
}