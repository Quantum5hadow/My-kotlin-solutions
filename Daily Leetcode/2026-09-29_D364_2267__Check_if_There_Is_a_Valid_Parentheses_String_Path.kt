/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/solutions/8546069/kotlin-easy-by-pixelprince-kiko
Problem      : 2267.  Check if There Is a Valid Parentheses String Path
Day          : 364
Date         : 2026-09-29
*/

class Solution{
    fun hasValidPath(g:Array<CharArray>):Boolean{
        val m=g.size;val n=g[0].size
        if((m+n)%2==0||g[0][0]==')'||g[m-1][n-1]=='(')return false
        var d=Array(n){mutableSetOf<Int>()}
        d[0]+=1
        for(i in 0 until m)for(j in 0 until n){
            if(i==0&&j==0)continue
            val x=if(g[i][j]=='(')1 else -1
            val s=mutableSetOf<Int>()
            if(i>0)for(v in d[j])if(v+x>=0)s+=v+x
            if(j>0)for(v in d[j-1])if(v+x>=0)s+=v+x
            d[j]=s
        }
        return 0 in d[n-1]
    }
}