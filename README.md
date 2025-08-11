# Problem Topic : **Maximum Subarray**
**Problem Description : Given an integer array nums, find the subarray with the largest sum, and return its sum.**

## 🚀 Solution Overview

This problem is elegantly solved using a **Dynamic Programming** approach. The idea is to build up the solution by making optimal choices at each step based on previously computed results.



### 🔍 Algorithm Used: Kadane’s Algorithm

Kadane’s Algorithm works by iterating through the array and maintaining two key variables:
- `current_answer`: the maximum sum of subarray ending at the current index.
- `ans`: the overall maximum sum found so far.

If `current_answer` becomes negative, we reset it to zero since continuing with a negative sum would reduce the total. At each step, we update `ans` if `current_answer` exceeds it.


## 🧠 My Approach

I started by initializing both `ans` and `current_answer` with the first element of the array. Then, I looped through the rest of the array:
- If `current_answer` is negative, I reset it to zero.
- I add the current element to `current_answer`.
- If `current_answer` exceeds `ans`, I update `ans`.

This ensures that we always track the best possible subarray sum ending at each index.

## 💻 Code Implementation

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int current_answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current_answer < 0) {
                current_answer = 0;
            }
            current_answer = current_answer + nums[i];
            if (current_answer > ans) {
                ans = current_answer;
            }
        }
        return ans;
    }
}
```
### ⛓️ Time and Space Complexity
- **Time Complexity:** O(n) — We traverse the array once.
- **Space Complexity:** O(1) — No extra space is used apart from variables.
