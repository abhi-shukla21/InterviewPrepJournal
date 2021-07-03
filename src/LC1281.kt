/**
Given an integer number n, return the difference
between the product of its digits and the sum of its digits.
 */
fun subtractProductAndSum(arg: Int): Int {
    var n = arg
    if (n == 0) return 0
    var prod = 1
    var sum = 0
    while (n > 0) {
        var digit = n % 10
        prod *= digit
        sum += digit
        n /= 10
    }
    return prod - sum
}

/**
 *Learnings:
 * 1. In kotlin, function arguments are immutable :P
 * 2. n /= 10 is not a valid statement
 */