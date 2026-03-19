/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/solutions/7664877/kotlin-easy-by-pixelprince-kd0k
Problem      : 3212. Count Submatrices With Equal Frequency of X and Y
Day          : 170
Date         : 2026-03-19
*/

class Solution{
    fun numberOfSubmatrices(g:Array<CharArray>):Int{
        val x=IntArray(g[0].size);val y=IntArray(g[0].size);var r=0
        for(i in g.indices){
            var cx=0;var cy=0
            for(j in g[i].indices){
                if(g[i][j]=='X')x[j]++;if(g[i][j]=='Y')y[j]++
                cx+=x[j];cy+=y[j]
                if(cx==cy&&cx>0)r++
            }
        }
        return r
    }
}