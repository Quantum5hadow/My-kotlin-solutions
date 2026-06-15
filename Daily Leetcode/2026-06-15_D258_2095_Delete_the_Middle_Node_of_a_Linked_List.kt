/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/solutions/8346754/kotlin-easy-by-pixelprince-rb37
Problem      : 2095. Delete the Middle Node of a Linked List
Day          : 258
Date         : 2026-06-15
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
    fun deleteMiddle(h:ListNode?)=run{
        val d=ListNode(0).apply{next=h}
        var s:ListNode?=d;var f=h
        while(f?.next!=null){s=s?.next;f=f.next?.next}
        s?.next=s?.next?.next
        d.next
    }
}