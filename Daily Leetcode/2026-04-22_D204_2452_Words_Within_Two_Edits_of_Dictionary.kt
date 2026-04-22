/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/words-within-two-edits-of-dictionary/solutions/8045493/kotlin-easy-by-pixelprince-886d
Problem      : 2452. Words Within Two Edits of Dictionary
Day          : 204
Date         : 2026-04-22
*/

class Solution{
    fun twoEditWords(q:Array<String>,d:Array<String>)=
        q.filter{a->d.any{b->a.indices.count{i->a[i]!=b[i]}<=2}}
}