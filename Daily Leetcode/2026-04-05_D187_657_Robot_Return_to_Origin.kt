/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/robot-return-to-origin/solutions/7782541/kotlin-smaller-easy-by-pixelprince-0yeh
Problem      : 657. Robot Return to Origin
Day          : 187
Date         : 2026-04-05
*/
 

approach 1 :

class Solution{
    fun judgeCircle(m:String)=
        m.count{it=='U'}==m.count{it=='D'} &&
        m.count{it=='L'}==m.count{it=='R'}
}

approach 2 : 

class Solution{
    fun judgeCircle(m:String):Boolean{
        var x=0;var y=0
        for(c in m){
            if(c=='U')y++
            else if(c=='D')y--
            else if(c=='L')x--
            else x++
        }
        return (x or y) == 0
    }
}