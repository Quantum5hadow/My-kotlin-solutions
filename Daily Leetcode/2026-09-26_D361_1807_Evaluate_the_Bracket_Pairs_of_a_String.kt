/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/solutions/8540547/kotlin-easy-by-pixelprince-2b1x
Problem      : 1807. Evaluate the Bracket Pairs of a String
Day          : 361
Date         : 2026-09-26
*/

class Solution{
    fun evaluate(s:String,k:List<List<String>>):String{
        val m=k.associate{it[0] to it[1]}
        return Regex("\\((.*?)\\)").replace(s){
            m[it.groupValues[1]]?:"?"
        }
    }
}