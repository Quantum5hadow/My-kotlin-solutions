/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rotating-the-box/solutions/8255879/kotlin-easy-by-pixelprince-907x
Problem      : 1861. Rotating the Box
Day          : 218
Date         : 2026-05-06
*/

class Solution{
    fun rotateTheBox(b:Array<CharArray>)=
        b.map{r->var j=0
            for(i in r.indices)
                if(r[i]=='.'){r[i]='#';r[j++]='.'}
                else if(r[i]=='*')j=i+1
        }.let{List(b[0].size){i->CharArray(b.size){b[b.size-1-it][i]}}}
}