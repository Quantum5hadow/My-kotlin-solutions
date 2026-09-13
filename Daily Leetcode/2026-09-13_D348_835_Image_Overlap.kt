/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/image-overlap/solutions/8519373/kotlin-easy-by-pixelprince-5g5k
Problem      : 835. Image Overlap
Day          : 348
Date         : 2026-09-13
*/

class Solution{
    fun largestOverlap(a:Array<IntArray>,b:Array<IntArray>)=
        (1-a.size until a.size).maxOf{dy->
            (1-a.size until a.size).maxOf{dx->
                (maxOf(0,-dy)..minOf(a.lastIndex,a.lastIndex-dy)).sumOf{y->
                    (maxOf(0,-dx)..minOf(a.lastIndex,a.lastIndex-dx))
                        .sumOf{x->b[y][x]*a[y+dy][x+dx]}
                }
            }
        }
}