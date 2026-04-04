
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/decode-the-slanted-ciphertext/solutions/7777483/kotlin-easy-by-pixelprince-apu8
Problem      : 2075. Decode the Slanted Ciphertext
Day          : 186
Date         : 2026-04-04


class Solution{
    fun decodeCiphertext(s:String,r:Int):String{
        if(r==1)return s
        val c=s.length/r
        val sb=StringBuilder()
        for(j in 0 until c)
            for(i in 0 until r){
                val k=i*c+j+i
                if(k<s.length)sb.append(s[k])
            }
        return sb.toString().trimEnd()
    }
}