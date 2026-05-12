/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/solutions/8255974/kotlin-easy-by-pixelprince-voj0
Problem      : 1665. Minimum Initial Energy to Finish Tasks
Day          : 224
Date         : 2026-05-12
*/

class Solution{
    fun minimumEffort(a:Array<IntArray>):Int{
        a.sortByDescending{it[1]-it[0]}
        var need=0;var cur=0
        for(t in a){
            if(cur<t[1]){need+=t[1]-cur;cur=t[1]}
            cur-=t[0]
        }
        return need
    }
}