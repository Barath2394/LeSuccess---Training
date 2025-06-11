package com.Barath.Day19

def n = 10
def a = 0
def b = 1

print "$a "

for (int i = 1; i < n; i++) {
    print "$b "
    def next = a + b
    a = b
    b = next
}

