/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-paths-with-max-score/solutions/8376905/kotlin-easy-by-pixelprince-byyt
Problem      : 1301. Number of Paths with Max Score
Day          : 278
Date         : 2026-07-05
*/

class Solution{
    fun pathsWithMaxScore(b:List<String>):IntArray{
        val n=b.size;val s=Array(n){Array(n){-1 to 0}}
        s[0][0]=0 to 1
        for(i in 0 until n)for(j in 0 until n){
            if(i+j==0||b[i][j]=='X')continue
            val a=listOfNotNull(if(i>0)s[i-1][j]else null,if(j>0)s[i][j-1]else null,if(i>0&&j>0)s[i-1][j-1]else null)
            val m=a.maxOfOrNull{it.first}?:-1
            if(m<0)continue
            val c=a.filter{it.first==m}.sumOf{it.second}%1000000007
            s[i][j]=(m+if(b[i][j]=='S')0 else b[i][j]-'0') to c
        }
        return intArrayOf(maxOf(0,s[n-1][n-1].first),s[n-1][n-1].second)
    }
}