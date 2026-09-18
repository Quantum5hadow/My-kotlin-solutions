/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/solutions/8528604/kotlin-easy-by-pixelprince-2f2o
Problem      : 1520. Maximum Number of Non-Overlapping Substrings
Day          : 353
Date         : 2026-09-18
*/

class Solution{
    fun maxNumOfSubstrings(s:String):List<String>{
        val a=s.toCharArray();val n=a.size
        val l=IntArray(26){n};val r=IntArray(26){-1}
        for(i in 0 until n){val c=a[i]-'a';l[c]=minOf(l[c],i);r[c]=i}
        val v=mutableListOf<IntArray>()
        for(c in 0..25)if(r[c]>=0){
            var x=l[c];var y=r[c];var ok=true
            while(x<=y){val q=a[x]-'a';if(l[q]<l[c]){ok=false;break};y=maxOf(y,r[q]);x++}
            if(ok)v+=intArrayOf(y,l[c])
        }
        v.sortWith(compareBy({it[0]},{it[1]}))
        val z=mutableListOf<String>();var end=-1
        for((r0,l0) in v)if(l0>end){z+=s.substring(l0,r0+1);end=r0}
        return z
    }
}