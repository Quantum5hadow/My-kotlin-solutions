/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/solutions/7610927/easy-by-pixelprince-veaa
Problem      : 1404. Number of Steps to Reduce a Number in Binary Representation to One
Day          : 149
Date         : 2026-02-26
*/

class Solution{
    fun numSteps(s:String):Int{
        var c=0;var r=0
        for(i in s.lastIndex downTo 1){
            val b=s[i]-'0'
            if(b+r==1){c+=2;r=1}else c+=1
        }
        return c+r
    }
}
