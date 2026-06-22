/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-number-of-balloons/solutions/8350985/kotlin-easy-by-pixelprince-0s38
Problem      : 1189. Maximum Number of Balloons
Day          : 265
Date         : 2026-06-22
*/

class Solution{
    fun maxNumberOfBalloons(s:String)=
        "balon".minOf{
            s.count{c->c==it}/if(it=='l'||it=='o')2 else 1
        }
}