class LC1624 {
    /**
     * Given a string s, return the length of the longest substring
     * between two equal characters, excluding the two characters.
     * If there is no such substring return -1.
     */

    fun maxLengthBetweenEqualCharacters(s: String): Int {
        var maxLen = -1
        val idxMap = mutableMapOf<Char, Int>()
        for((idx, c) in s.withIndex()){
            if(idxMap[c] != null){
                maxLen = maxOf(maxLen, idx - idxMap[c]!! - 1)
            }else{
                idxMap[c] = idx
            }
        }
        return maxLen
    }

    /**
     * Learnings:
     * - HashMap is not a mutable map
     * - Smart cast doesn't work on null safety
     */
}