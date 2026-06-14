/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/solutions/8346751/kotlin-easy-by-pixelprince-u04b
Problem      : 2130. Maximum Twin Sum of a Linked List
Day          : 257
Date         : 2026-06-14
*/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution{
    fun pairSum(h:ListNode?):Int{
        var s=h;var f=h
        val a=ArrayDeque<Int>()
        while(f!=null){a+=s!!.`val`;s=s.next;f=f.next?.next}
        var r=0
        while(s!=null){r=maxOf(r,a.removeLast()+s.`val`);s=s.next}
        return r
    }
}