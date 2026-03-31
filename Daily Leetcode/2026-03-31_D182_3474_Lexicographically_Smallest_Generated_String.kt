
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/lexicographically-smallest-generated-string/solutions/7725094/kotlin-easy-by-pixelprince-4bvd
Problem      : 3474. Lexicographically Smallest Generated String
Day          : 182
Date         : 2026-03-31


class Solution{
    fun generateString(a:String,b:String):String{
        val n=a.length;val m=b.length;val s=CharArray(n+m-1)
        for(i in 0 until n)if(a[i]=='T')
            for(j in 0 until m){
                val p=i+j
                if(s[p]!=0.toChar()&&s[p]!=b[j])return ""
                s[p]=b[j]
            }
        for(i in s.indices)if(s[i]==0.toChar())s[i]='a'
        for(i in 0 until n)if(a[i]=='F'){
            var ok=true
            for(j in 0 until m)if(s[i+j]!=b[j]){ok=false;break}
            if(ok){
                var done=false
                for(j in m-1 downTo 0){
                    val p=i+j
                    if(s[p]=='a'){s[p]='b';done=true;break}
                }
                if(!done)return ""
            }
        }
        return String(s)
    }
}