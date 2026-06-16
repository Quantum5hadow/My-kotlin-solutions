/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/process-string-with-special-operations-i/solutions/8346755/kotlin-easy-by-pixelprince-tp6t
Problem      : 3612. Process String with Special Operations I
Day          : 259
Date         : 2026-06-16
*/

class Solution{
    fun processStr(s:String)=s.fold(""){r,c->
        when(c){
            '*'->r.dropLast(1)
            '%'->r.reversed()
            '#'->r+r
            else->r+c
        }
    }
}