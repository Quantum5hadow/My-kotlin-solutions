
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/walking-robot-simulation-ii/solutions/7806971/kotlin-easy-by-pixelprince-yvi7
Problem      : 2069. Walking Robot Simulation II
Day          : 189
Date         : 2026-04-07


class Robot(val w:Int,val h:Int){
    private val p=(w+h-2)*2
    private var i=0;private var init=true
    fun step(n:Int){init=false;i=(i+n)%p}
    fun getPos():IntArray=when{
        i<w->intArrayOf(i,0)
        i<w+h-1->intArrayOf(w-1,i-w+1)
        i<2*w+h-2->intArrayOf(2*w+h-3-i,h-1)
        else->intArrayOf(0,p-i)
    }
    fun getDir():String{
        if(init)return "East"
        if(i==0)return "South"
        return when{
            i<w->"East"
            i<w+h-1->"North"
            i<2*w+h-2->"West"
            else->"South"
        }
    }
}
