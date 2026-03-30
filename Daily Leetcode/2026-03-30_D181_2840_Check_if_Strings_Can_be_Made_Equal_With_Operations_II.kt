
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/solutions/7717735/kotlin-easy-by-pixelprince-j4hd
Problem      : 2840. Check if Strings Can be Made Equal With Operations II
Day          : 181
Date         : 2026-03-30

class Solution{
    fun checkStrings(a:String,b:String):Boolean{
        val e=IntArray(26);val o=IntArray(26)
        for(i in a.indices){
            val x=a[i]-'a';val y=b[i]-'a'
            if(i%2==0){e[x]++;e[y]--}else{o[x]++;o[y]--}
        }
        return e.all{it==0}&&o.all{it==0}
    }
}
