
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/solutions/7702252/kotlin-easy-by-pixelprince-tb4m
Problem      : 2946. Matrix Similarity After Cyclic Shifts
Day          : 178
Date         : 2026-03-27


class Solution{
    fun areSimilar(m:Array<IntArray>,k:Int):Boolean{
        for(r in m){
            val n=r.size
            val s=((k%n)+n)%n
            for(i in 0 until n)
                if(r[i]!=r[(i+s)%n]) return false
        }
        return true
    }
}
