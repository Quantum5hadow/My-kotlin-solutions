/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rotate-list/solutions/8255872/kotlin-easy-by-pixelprince-sa31
Problem      : 61. Rotate List
Day          : 217
Date         : 2026-05-05
*/

class Solution{
    fun rotateRight(h:ListNode?,k:Int):ListNode?{
        h?.next?:return h;var t=h;var n=1
        while(t?.next!=null){t=t.next;n++}
        t.next=h
        repeat(n-k%n){t=t?.next}
        return t?.next.also{t?.next=null}
    }
}