/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-the-number-of-complete-components/solutions/8389847/kotlin-easy-by-pixelprince-f22b
Problem      : 2685. Count the Number of Complete Components
Day          : 284
Date         : 2026-07-11
*/

class Solution{
    fun countCompleteComponents(n:Int,e:Array<IntArray>):Int{
        val p=IntArray(n){it};val s=IntArray(n){1};val d=IntArray(n)
        fun f(x:Int):Int=if(x==p[x])x else f(p[x]).also{p[x]=it}
        for((u,v) in e){
            d[u]++;d[v]++
            var a=f(u);var b=f(v)
            if(a!=b){
                if(s[a]<s[b])a=b.also{b=a}
                p[b]=a;s[a]+=s[b]
            }
        }
        val c=IntArray(n);val ok=BooleanArray(n){true}
        for(i in 0 until n)c[f(i)]++
        for(i in 0 until n)if(d[i]!=c[f(i)]-1)ok[f(i)]=false
        return (0 until n).count{f(it)==it&&ok[it]}
    }
}