class Solution{
    fun longestValidParentheses(s:String):Int{
        val st=java.util.ArrayDeque<Int>();st.add(-1)
        var ans=0
        for(i in s.indices)
            if(s[i]=='(')st.add(i)
            else{st.removeLast();if(st.isEmpty())st.add(i)else ans=maxOf(ans,i-st.peekLast())}
        return ans
    }
}