/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-ii/solutions/8384138/kotlin-easy-by-pixelprince-fiix
Problem      : 3756. Concatenate Non-Zero Digits and Multiply by Sum II
Day          : 281
Date         : 2026-07-08
*/

class Solution{
    fun sumAndMultiply(s:String,q:Array<IntArray>):IntArray{
        val m=1_000_000_007
        val c=IntArray(s.length+1);val z=IntArray(s.length+1)
        val t=IntArray(s.length+1);val p=IntArray(s.length+1){1}
        for(i in s.indices){
            val d=s[i]-'0'
            z[i+1]=z[i]+(d>0).compareTo(false)
            t[i+1]=(t[i]+d)%m
            c[i+1]=((c[i].toLong()*(if(d>0)10 else 1)+d)%m).toInt()
            if(i<p.lastIndex)p[i+1]=(p[i].toLong()*10%m).toInt()
        }
        return IntArray(q.size){
            val(l,R)=q[it];val r=R+1
            (((t[r]-t[l]+m).toLong()*
             ((c[r]-c[l].toLong()*p[z[r]-z[l]]%m+m)%m))%m).toInt()
        }
    }
}