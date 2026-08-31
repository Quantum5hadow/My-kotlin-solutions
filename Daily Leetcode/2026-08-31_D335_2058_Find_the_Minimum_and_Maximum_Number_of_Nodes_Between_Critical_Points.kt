/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/solutions/8493149/kotlin-easy-by-pixelprince-o1sk
Problem      : 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
Day          : 335
Date         : 2026-08-31
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
    fun nodesBetweenCriticalPoints(h:ListNode?)=run{
        var p=-1;var f=-1;var mn=Int.MAX_VALUE;var i=1
        var a=h?.`val`;var b=h?.next
        while(b?.next!=null){
            val c=b.next!!.`val`
            if((a!!-b.`val`).toLong()*(c-b.`val`)>0){
                if(f<0)f=i else mn=minOf(mn,i-p)
                p=i
            }
            a=b.`val`;b=b.next;i++
        }
        listOf(if(f<0||mn==Int.MAX_VALUE)-1 else mn,if(f<0||mn==Int.MAX_VALUE)-1 else p-f)
    }
}