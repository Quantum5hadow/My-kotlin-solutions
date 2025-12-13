
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/coupon-code-validator/solutions/7581628/3606-coupon-code-validator-easy-by-pixel-mcdh
Problem     : 3606. Coupon Code Validator
Day         : 74
Date        : 2025-12-13
*/

class Solution {
    fun validateCoupons(code: Array<String>, businessLine: Array<String>, isActive: BooleanArray): List<String> {
        val validBusinessLines = hashSetOf("electronics", "grocery", "pharmacy", "restaurant")
        val filteredCoupons = mutableListOf<Pair<String, String>>()
        for (i in code.indices) {
            if (!isActive[i]) {
                continue
            }
            val currentBusinessLine = businessLine[i]
            if (currentBusinessLine !in validBusinessLines) {
                continue
            }
            val currentCode = code[i]
            if (currentCode.isEmpty()) {
                continue
            }

            var isValidCodeChar = true
            for (char in currentCode) {
                if (!(char == '_' || char.isLetterOrDigit())) {
                    isValidCodeChar = false
                    break
                }
            }

            if (isValidCodeChar) {
                filteredCoupons.add(Pair(currentCode, currentBusinessLine))
            }
        }
        filteredCoupons.sortWith(compareBy<Pair<String, String>> { it.second }.thenBy { it.first })
        return filteredCoupons.map { it.first }
    }
}