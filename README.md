<div align="center">

# ⚡ my kotlin solutions

### daily leetcode grind — one problem at a time

[![kotlin](https://img.shields.io/badge/Kotlin-100%25-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![leetcode](https://img.shields.io/badge/LeetCode-PixelPrince-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/u/PixelPrince/)
[![knight](https://img.shields.io/badge/Knight%20🏇-Rating-FF6F00?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/u/PixelPrince/)
[![problems](https://img.shields.io/badge/problems%20solved-140+-00C853?style=for-the-badge)](#-solution-log)
[![license](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)](LICENSE)

**`discipline > motivation`**

<br>

![LeetCode Stats](https://leetcard.jacoblin.cool/PixelPrince?theme=dark&font=Karma&ext=contest)

---

</div>

## 🧠 about

hey,i'm [**Quantum5hadow**](https://github.com/Quantum5hadow). i don't do "i'll start tomorrow." i just start.

this repo is my daily leetcode journal — one problem,every single day,all in kotlin. i pick a topic,go deep on it for a week (divisibility,balanced arrays,stock trading,geometry — whatever catches my eye),and always pair the easy version with the hard one back to back. no cherry-picking easy problems to feel good. if there's a part II,i'm solving it the next day.

166 days in and the streak is still alive. not because i'm motivated every morning — i'm not. but discipline hits different when you stop negotiating with yourself.

> *"champions aren't born in the gym, they're born in the dark at day 166 when nobody's watching"*

---

## 📊 stats

```
🔥 current streak    : 166 days
📝 problems solved   : 153 unique problems
🗓️ started           : october 1,2025
💻 language          : kotlin (100%)
🏷️ leetcode id       : PixelPrince
```

---

## 🗂️ topics covered

| category | problems | examples |
|:---------|:--------:|:---------|
| 🧮 **dynamic programming** | 15+ | maximal rectangle,champagne tower,ones and zeroes,max dot product |
| 🔍 **binary search** | 10+ | maximize minimum powered city,last day where you can still cross |
| 🌳 **trees** | 8+ | balanced BST,maximum level sum,deepest nodes,splitted binary tree |
| 📊 **arrays & math** | 20+ | plus one,water bottles,four divisors,binary watch,matrix sum |
| 🔗 **graphs & BFS/DFS** | 10+ | pacific atlantic water flow,find all people with secret |
| 🧩 **union find** | 5+ | find all people with secret,k-divisible components |
| 💡 **greedy** | 10+ | minimum time to make rope colorful,maximize happiness |
| 🔢 **bit manipulation** | 8+ | reverse bits,add binary,smallest number with all set bits |
| 📐 **geometry** | 6+ | count trapezoids I & II,separate squares I & II |
| 🪟 **sliding window** | 6+ | X-sum of subarrays I & II,minimum cost subarrays |
| 📦 **prefix sum** | 5+ | make sum divisible by P,increment submatrices by one |
| 🏗️ **stack & monotonic stack** | 4+ | maximal rectangle,trapping rain water II |
| 🧵 **strings** | 6+ | minimum deletions for balanced string,palindromic subsequences |
| 📋 **matrix** | 8+ | unguarded cells,magic squares,count covered buildings |
| 🔄 **sorting & heap** | 8+ | meeting rooms III,minimize max pair sum,minimum absolute difference |

---

## 📁 file naming

every file follows this format:

```
YYYY-MM-DD_D{day}_{problemID}_{ProblemName}.kt
```

for example:
```
2026-02-17_D140_401_Binary Watch.kt
│          │    │    └── problem name
│          │    └── leetcode problem id
│          └── day number of the streak
└── date solved
```

---

## 👀 sample solution

here's what a typical solution looks like — **day 163,maximize spanning tree stability with upgrades**:

```kotlin
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/binary-watch/solutions/...
Problem      : 1622. Fancy Sequence
Day          : 166
Date         : 2026-03-15
*/

class Solution {
    fun readBinaryWatch(k: Int) =
        (0 until 720).mapNotNull {
            val h = it / 60
            val m = it % 60
            if (Integer.bitCount(h) + Integer.bitCount(m) == k)
                "%d:%02d".format(h, m)
            else null
        }
}
```

clean,readable,no fluff. every solution has a header with links back to the leetcode submission.

---

## 🚀 how to use this repo

**browse solutions:**
just scroll through the files — they're sorted by date and day number

**search for a specific problem:**
use github's search or `ctrl+f` with the problem number

```
example: search "85" to find Maximal Rectangle
example: search "2092" to find Find All People With Secret
```

**run locally:**
```bash
# grab the repo
git clone https://github.com/Quantum5hadow/My-kotlin-solutions.git

# open any .kt file in your IDE
# each file is a standalone leetcode solution
```

---

## 🏆 milestones

| milestone | date | days |
| --- | --- | --- |
| 🎯 first commit | oct 1,2025 | 1 |
| 🔥 30 day streak | oct 30,2025 | 30 |
| 💪 50 problems | nov 19,2025 | 50 |
| 🏅 100 day streak | jan 08,2026 | 100 |
| ⚡ 150 day streak | feb 27,2026 | 150 |
| ⚡ 166 days and counting | mar 15,2026 | 166 |



---

## 📈 the grind

```
oct 2025    ██████████████████░░░░░░░░░░░░  19 problems
nov 2025    █████████████████████████████░  29 problems
dec 2025    █████████████████████████████░  30 problems
jan 2026    ██████████████████████████████  32 problems
feb 2026    ██████████████████████████████  28 problems
mar 2026    ██████████████░░░░░░░░░░░░░░░░  15 problems (in progress)
```

---

## 🤝 contributing

found a bug? have a better approach? check out the [contributing guide](CONTRIBUTING.md).

---

## 📄 license

this repo is [MIT licensed](LICENSE) — use the solutions however you want,just don't submit them as your own on leetcode. that's not cool.

---

<div align="center">

**if this repo helped you or you think the grind is real,drop a ⭐**

[![follow](https://img.shields.io/github/followers/Quantum5hadow?label=follow&style=social)](https://github.com/Quantum5hadow)
[![stars](https://img.shields.io/github/stars/Quantum5hadow/My-kotlin-solutions?style=social)](https://github.com/Quantum5hadow/My-kotlin-solutions)

*built with discipline,not motivation* 💜

</div>
