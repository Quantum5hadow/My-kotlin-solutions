/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game-iii/solutions/8437746/kotlin-easy-by-pixelprince-8muz
Problem      : 1406. Stone Game III
Day          : 307
Date         : 2026-08-03
*/

class Solution{
    fun stoneGameIII(a:IntArray):String{
        val d=IntArray(a.size+1)
        for(i in a.lastIndex downTo 0){
            var s=0
            d[i]=Int.MIN_VALUE
            for(j in i until minOf(i+3,a.size)){
                s+=a[j]
                d[i]=maxOf(d[i],s-d[j+1])
            }
        }
        return when{
            d[0]>0->"Alice"
            d[0]<0->"Bob"
            else->"Tie"
        }
    }
}