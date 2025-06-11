package com.Barath.Day19

Scanner sc = new Scanner(System.in)
print "Enter the string : "
def str = sc.next()
println (reverse(str.toCharArray()).equals(str))

def reverse(str) {
    def left = 0
    def right = str.length - 1
    while (left < right) {
        def temp = str[left]
        str[left] = str[right]
        str[right] = temp
        left++
        right--
    }
    return new String(str)
}
