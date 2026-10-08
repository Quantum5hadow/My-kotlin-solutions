// ┌────────────────────────────────────────────────────────────┐
// │  LeetCode ID  : PixelPrince                                │
// │  Profile      : https://leetcode.com/u/PixelPrince/        │
// │  Submission   : https://leetcode.com/problems/remove-outermost-parentheses/solutions/8562092/kotlin-easy-by-pixelprince-1ff9│
// │  Problem      : 1021. Remove Outermost Parentheses         │
// │  Day          : 373                                        │
// │  Date         : 2026-10-08                                 │
// └────────────────────────────────────────────────────────────┘

class Solution {
    fun removeOuterParentheses(s: String): String {
        var d = 0
        val r = StringBuilder()
        for (c in s) {
            if (c == '(') {
                if (d++ > 0) r.append(c)
            } else if (--d > 0) r.append(c)
        }
        return r.toString()
    }
}