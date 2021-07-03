class LC1 {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        val idxMap = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            if (idxMap.containsKey(target - num)) {
                result[0] = idxMap[target - num] ?: -1
                result[1] = i
                return result
            } else {
                idxMap[num] = i;
            }
        }
        return IntArray(0)
    }

    /**
     * Learnings:
     * 1. You cannot return null from a function of non-null return type
     */
}