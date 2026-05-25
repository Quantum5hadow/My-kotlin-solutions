/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/jump-game-vii/solutions/8292234/kotlin-easy-by-pixelprince-ky3w
Problem      : 1871. Jump Game VII
Day          : 237
Date         : 2026-05-25
*/

class Solution{
    fun canReach(s:String,l:Int,r:Int):Boolean{
        val v=BooleanArray(s.length)
        v[0]=s[0]=='0';var c=0
        for(i in l until s.length){
            if(v[i-l])c++
            if(c>0&&s[i]=='0')v[i]=true
            if(i>=r&&v[i-r])c--
        }
        return v.last()
    }
}