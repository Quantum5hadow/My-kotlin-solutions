/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/solutions/7921313/kotlin-easy-by-pixelprince-hvp4
Problem      : 3740. Minimum Distance Between Three Equal Elements I
Day          : 192
Date         : 2026-04-10
*/

class Solution{
    fun minimumDistance(n:IntArray)=
        n.indices.groupBy{n[it]}.values
            .flatMap{it.windowed(3){2*(it[2]-it[0])}}
            .minOrNull()?:-1
}