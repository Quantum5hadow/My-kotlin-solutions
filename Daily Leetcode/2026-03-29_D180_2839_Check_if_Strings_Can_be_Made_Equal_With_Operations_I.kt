
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/solutions/7713290/kotlin-easy-by-pixelprince-verx
Problem      : 2839. Check if Strings Can be Made Equal With Operations I
Day          : 180
Date         : 2026-03-29


class Solution{
    fun canBeEqual(a:String,b:String)=
        (a[0].code*a[2].code==b[0].code*b[2].code) &&
        (a[1].code*a[3].code==b[1].code*b[3].code)
}