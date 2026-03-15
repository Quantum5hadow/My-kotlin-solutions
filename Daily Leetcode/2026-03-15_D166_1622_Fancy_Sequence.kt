/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/fancy-sequence/solutions/7658102/kotlin-easy-by-pixelprince-v29f
Problem      : 1622. Fancy Sequence
Day          : 166
Date         : 2026-03-15
*/

class Fancy{
    val a=ArrayList<Long>();var add=0L;var mul=1L;val M=1_000_000_007L
    fun append(v:Int){a.add(((v-add+M)%M)*pow(mul,M-2)%M)}
    fun addAll(x:Int){add=(add+x)%M}
    fun multAll(x:Int){mul=mul*x%M;add=add*x%M}
    fun getIndex(i:Int)=if(i>=a.size)-1 else((a[i]*mul+add)%M).toInt()
    fun pow(a:Long,b:Long):Long{var x=a;var y=b;var r=1L;while(y>0){if(y and 1L==1L)r=r*x%M;x=x*x%M;y/=2};return r}
}
