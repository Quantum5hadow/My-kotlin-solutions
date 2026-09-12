/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-score-of-non-overlapping-intervals/solutions/8516625/kotlin-easy-by-pixelprince-dvgz
Problem      : 3414. Maximum Score of Non-overlapping Intervals
Day          : 347
Date         : 2026-09-12
*/

class Solution{
    data class A(val w:Long,val a:List<Int>)
    val m=HashMap<Long,A>()

    fun maximumWeight(x:List<List<Int>>):IntArray{
        val a=x.mapIndexed{i,v->v+i}.sortedBy{it[0]}
        fun f(i:Int,k:Int):A{
            if(i==a.size||k==0)return A(0,emptyList())
            m[i*5L+k]?.let{return it}
            var z=f(i+1,k);var l=i+1;var r=a.size
            while(l<r){val q=(l+r)/2;if(a[q][0]>a[i][1])r=q else l=q+1}
            for(j in 0 until k){
                val t=f(l,j);val b=(t.a+a[i][3]).sorted();val w=t.w+a[i][2]
                var ok=false
                for(q in b.indices){
                    if(q==z.a.size){ok=true;break}
                    if(b[q]!=z.a[q]){ok=b[q]<z.a[q];break}
                }
                if(w>z.w||w==z.w&&ok)z=A(w,b)
            }
            return z.also{m[i*5L+k]=it}
        }
        return f(0,4).a.toIntArray()
    }
}