/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-substring-of-one-repeating-character/solutions/8458861/kotlin-easy-by-pixelprince-g4ee
Problem      : 2213. Longest Substring of One Repeating Character
Day          : 317
Date         : 2026-08-13
*/

class Solution {
    fun longestRepeating(s:String,q:String,p:IntArray):IntArray {
        val n=s.length;val a=s.toCharArray();val t=Array(4*n){intArrayOf(1,1,1)}
        fun g(i:Int,l:Int,r:Int,m:Int){
            val x=t[i*2];val y=t[i*2+1];t[i][0]=x[0];t[i][1]=y[1]
            if(a[m]==a[m+1]){
                if(x[0]==m-l+1)t[i][0]+=y[0]
                if(y[1]==r-m)t[i][1]+=x[1]
            }
            t[i][2]=maxOf(x[2],y[2],if(a[m]==a[m+1])x[1]+y[0]else 0)
        }
        fun f(i:Int,l:Int,r:Int){
            if(l==r)return
            val m=(l+r)/2;f(i*2,l,m);f(i*2+1,m+1,r);g(i,l,r,m)
        }
        fun u(i:Int,l:Int,r:Int,p:Int){
            if(l==r)return
            val m=(l+r)/2
            if(p<=m)u(i*2,l,m,p)else u(i*2+1,m+1,r,p)
            g(i,l,r,m)
        }
        f(1,0,n-1)
        return IntArray(p.size){i->a[p[i]]=q[i];u(1,0,n-1,p[i]);t[1][2]}
    }
}