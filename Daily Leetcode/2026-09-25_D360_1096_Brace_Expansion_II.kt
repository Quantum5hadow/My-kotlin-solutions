/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/brace-expansion-ii/solutions/8539270/kotlin-easy-by-pixelprince-laec
Problem      : 1096. Brace Expansion II
Day          : 360
Date         : 2026-09-25
*/

class Solution{
    fun braceExpansionII(s:String):List<String>{
        var i=0
        fun parse():Set<String>{
            var cur=setOf("")
            val out=mutableSetOf<String>()
            while(i<s.length&&s[i]!='}'){
                if(s[i]==','){out+=cur;cur=setOf("");i++;continue}
                val x=if(s[i]=='{'){i++;parse().also{ i++ }}
                    else setOf(s[i++].toString())
                cur=cur.flatMap{a->x.map{b->a+b}}.toSet()
            }
            return out+cur
        }
        return parse().sorted()
    }
}