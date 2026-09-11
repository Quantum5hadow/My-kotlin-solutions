/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/unique-3-digit-even-numbers/solutions/8515587/kotlin-easy-by-pixelprince-tkp0
Problem      : 3483. Unique 3-Digit Even Numbers
Day          : 346
Date         : 2026-09-11
*/

class Solution{
    fun totalNumbers(d:IntArray)=
        (100..998 step 2).count{n->
            n.toString().groupingBy{it}.eachCount()
                .all{(c,x)->d.count{it==c-'0'}>=x}
        }
}