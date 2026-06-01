/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/solutions/8306130/kotlin-easy-by-pixelprince-jv70
Problem      : 2144. Minimum Cost of Buying Candies With Discount
Day          : 244
Date         : 2026-06-01
*/

class Solution{
    fun minimumCost(a:IntArray)=
        a.sortedDescending().filterIndexed{i,_->i%3<2}.sum()
}