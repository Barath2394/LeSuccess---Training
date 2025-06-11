package com.Barath.Day19

Scanner sc = new Scanner(System.in)
print "Enter the Number : "
def num = sc.nextInt()
if (isPrime(num)) {
    println num + " is a Prime number"
}
else {
    println num + " is not a Prime number"
}

def isPrime(num) {
    def count = 0;
    for (i = 1; i <= num; i++) {
        if (num % i == 0) count++;
    }
    return count == 2
}