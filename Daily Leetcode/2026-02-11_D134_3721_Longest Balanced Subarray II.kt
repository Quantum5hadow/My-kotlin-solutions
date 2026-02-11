/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-balanced-subarray-ii/solutions/7583482/longest-balanced-subarray-ii-easy-by-pix-epwu
Problem      : 3721. Longest Balanced Subarray II
Day          : 134
Date         : 2026-02-11
*/

class Solution {
    fun longestBalanced(a: IntArray): Int {
        val n=a.size; val p=IntArray(100001)
        val s=IntArray(4*n); val mn=IntArray(4*n); val mx=IntArray(4*n)
        fun u(i:Int,v:Int,l:Int=0,r:Int=n-1,t:Int=1){
            if(l==r){s[t]=v;mn[t]=v;mx[t]=v;return}
            val m=(l+r)/2
            if(i<=m)u(i,v,l,m,t*2) else u(i,v,m+1,r,t*2+1)
            s[t]=s[t*2]+s[t*2+1]
            mn[t]=minOf(mn[t*2],s[t*2]+mn[t*2+1])
            mx[t]=maxOf(mx[t*2],s[t*2]+mx[t*2+1])
        }
        fun q(l:Int=0,r:Int=n-1,t:Int=1,a0:Int=0):Int=
            if(l==r)l else{
                val m=(l+r)/2
                if(s[1]-a0 in mn[t*2]..mx[t*2]) q(l,m,t*2,a0)
                else q(m+1,r,t*2+1,a0+s[t*2])
            }
        var ans=0
        for(i in a.indices){
            if(p[a[i]]>0)u(p[a[i]]-1,0)
            p[a[i]]=i+1
            u(i, if(a[i] and 1==1)1 else -1)
            ans=maxOf(ans, if(s[1]==0)i+1 else i-q())
        }
        return ans
    }
} 