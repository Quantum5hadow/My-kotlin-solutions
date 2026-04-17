/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/solutions/7956073/kotlin-easy-by-pixelprince-g56g
Problem      : 3761. Minimum Absolute Distance Between Mirror Pairs
Day          : 199
Date         : 2026-04-17
*/

class Solution{
    fun minMirrorPairDistance(a:IntArray)=HashMap<Int,Int>().let{m->
        a.indices.minOf{i->
            i-(m[a[i]]?:-a.size).also{
                m[a[i].toString().reversed().toInt()]=i
            }
        }.takeIf{it<a.size}?:-1
    }
}
