
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/solutions/7602180/very-easy-by-pixelprince-kki3
Problem      : 1461. Check If a String Contains All Binary Codes of Size K
Day          : 146
Date         : 2026-02-23
*/
class Solution{
    fun hasAllCodes(s:String,k:Int)=
        s.windowed(k).distinct().size==1 shl k
}