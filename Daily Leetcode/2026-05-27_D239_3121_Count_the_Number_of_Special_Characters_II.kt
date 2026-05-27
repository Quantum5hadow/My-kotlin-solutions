
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-the-number-of-special-characters-ii/solutions/8295895/kotlin-easy-by-pixelprince-spwd
Problem      : 3121. Count the Number of Special Characters II
Day          : 239
Date         : 2026-05-27


class Solution{
    fun numberOfSpecialChars(w:String):Int{
        var r=0
        for(c in 'a'..'z')
            if(w.lastIndexOf(c)<w.indexOf(c.uppercaseChar())&&w.contains(c)&&w.contains(c.uppercaseChar()))
                r++
        return r
    }
}