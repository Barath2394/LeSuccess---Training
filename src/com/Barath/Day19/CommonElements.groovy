package com.Barath.Day19

def list1 = [1, 2, 3, 4]
def list2 = [3, 4, 5, 6]

def common = []

for (item in list1) {
    if (list2.contains(item) && !common.contains(item)) {
        common.add(item)
    }
}

println common
