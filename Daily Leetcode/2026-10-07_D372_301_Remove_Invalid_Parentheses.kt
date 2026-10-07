// ┌────────────────────────────────────────────────────────────┐
// │  LeetCode ID  : PixelPrince                                │
// │  Profile      : https://leetcode.com/u/PixelPrince/        │
// │  Submission   : https://leetcode.com/problems/remove-invalid-parentheses/solutions/8560347/kotlin-easy-by-pixelprince-nwna│
// │  Problem      : 301. Remove Invalid Parentheses            │
// │  Day          : 372                                        │
// │  Date         : 2026-10-07                                 │
// └────────────────────────────────────────────────────────────┘

class Solution{
    fun removeInvalidParentheses(s:String):List<String>{
        val q=ArrayDeque<String>();val seen=mutableSetOf(s);val ans=mutableListOf<String>()
        q.add(s)
        while(q.isNotEmpty()&&ans.isEmpty()){
            repeat(q.size){
                val x=q.removeFirst();var d=0;var ok=true
                for(c in x)when(c){
                    '('->d++
                    ')'->if(--d<0)ok=false
                }
                if(ok&&d==0)ans+=x
                if(!ok||ans.isEmpty())for(i in x.indices)if(x[i]=='('||x[i]==')')
                    x.removeRange(i,i+1).let{if(seen.add(it))q.add(it)}
            }
        }
        return ans.distinct()
    }
}