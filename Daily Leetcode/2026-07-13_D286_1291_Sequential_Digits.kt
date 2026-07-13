/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sequential-digits/solutions/8394286/kotlin-easy-by-pixelprince-mdoj
Problem      : 1291. Sequential Digits
Day          : 286
Date         : 2026-07-13
*/

class Solution{
    fun sequentialDigits(l:Int,h:Int)=buildList{
        for(i in 1..9){
            var x=i
            for(j in i+1..9){
                x=x*10+j
                if(x>h)break
                if(x>=l)add(x)
            }
        }
    }.sorted()
}