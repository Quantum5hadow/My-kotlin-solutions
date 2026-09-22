/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-x-value-of-array-ii/solutions/8534266/kotlin-easy-by-pixelprince-rzz1
Problem      : 3525. Find X Value of Array II
Day          : 357
Date         : 2026-09-22
*/

class Solution{
    fun resultArray(a:IntArray,k:Int,q:Array<IntArray>):IntArray{
        val n=a.size
        val t=Array(4*n){IntArray(k)}
        val m=IntArray(4*n)
        fun pull(p:Int){
            val l=p*2+1;r@run{
                val r=l+1
                m[p]=m[l]*m[r]%k
                t[p].fill(0)
                for(x in 0 until k){
                    t[p][x]+=t[l][x]
                    t[p][m[l]*x%k]+=t[r][x]
                }
            }
        }
        fun build(p:Int,l:Int,r:Int){
            if(l==r){m[p]=a[l]%k;t[p][m[p]]=1;return}
            val x=(l+r)/2
            build(p*2+1,l,x);build(p*2+2,x+1,r);pull(p)
        }
        fun upd(p:Int,l:Int,r:Int,i:Int,v:Int){
            if(l==r){m[p]=v%k;t[p].fill(0);t[p][m[p]]=1;return}
            val x=(l+r)/2
            if(i<=x)upd(p*2+1,l,x,i,v)else upd(p*2+2,x+1,r,i,v)
            pull(p)
        }
        build(0,0,n-1)
        return IntArray(q.size){z->
            upd(0,0,n-1,q[z][0],q[z][1])
            val p=q[z][2];var mul=1;val c=IntArray(k)
            fun get(v:Int,l:Int,r:Int){
                if(r<p)return
                if(l>=p){
                    for(x in 0 until k)c[mul*x%k]+=t[v][x]
                    mul=mul*m[v]%k;return
                }
                val x=(l+r)/2
                get(v*2+1,l,x);get(v*2+2,x+1,r)
            }
            get(0,0,n-1)
            c[q[z][3]]
        }
    }
}