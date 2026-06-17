/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/process-string-with-special-operations-ii/solutions/8346757/kotlin-easy-by-pixelprince-wib7
Problem      : 3614. Process String with Special Operations II
Day          : 260
Date         : 2026-06-17
*/

class Solution{
    fun processStr(s:String,k:Long):Char{
        val l=LongArray(s.length);var n=0L
        for(i in s.indices){
            n=when(s[i]){
                '*'->maxOf(0,n-1)
                '#'->n*2
                '%'->n
                else->n+1
            }
            l[i]=n
        }
        if(k>=n)return '.'
        var p=k
        for(i in s.lastIndex downTo 0){
            when(s[i]){
                '#'->{ val pre=if(i>0)l[i-1] else 0; if(pre>0)p%=pre }
                '%'->p=l[i]-1-p
                '*'->{}
                else->if(p==l[i]-1)return s[i]
            }
        }
        return '.'
    }
}