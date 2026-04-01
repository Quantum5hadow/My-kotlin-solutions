/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/robot-collisions/solutions/7740229/easy-kotlin-by-pixelprince-hcpo
Problem      : 2751. Robot Collisions
Day          : 183
Date         : 2026-04-01
*/
class Solution{
    fun survivedRobotsHealths(p:IntArray,h:IntArray,d:String):List<Int>{
        val idx=p.indices.sortedBy{p[it]}
        val st=ArrayDeque<Int>();val res=ArrayList<Int>()
        for(i in idx){
            if(d[i]=='R'){st.addLast(i);continue}
            while(st.isNotEmpty()&&h[i]>0){
                val j=st.removeLast()
                if(h[j]>h[i]){h[i]=0;h[j]--;st.addLast(j)}
                else if(h[j]<h[i])h[i]--
                else h[i]=0
            }
            if(h[i]>0)res+=i
        }
        res.addAll(st)
        return res.sorted().map{h[it]}
    }
}
