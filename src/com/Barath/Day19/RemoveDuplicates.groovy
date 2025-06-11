package com.Barath.Day19

def list = [1, 2, 2, 3, 4, 4, 5]
def result = []

for (item in list) {
    if (!result.contains(item)) {
        result.add(item)
    }
}

println result
