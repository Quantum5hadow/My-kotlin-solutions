/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/solutions/7597422/easy-one-line-by-pixelprince-5gkp
Problem      : 762. Prime Number of Set Bits in Binary Representation
Day          : 144
Date         : 2026-02-21
*/

class Solution{
    fun countPrimeSetBits(l:Int,r:Int)=
        (l..r).count{(665772 shr it.countOneBits()) and 1==1}
}