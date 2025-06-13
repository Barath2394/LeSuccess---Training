package com.Barath.Day20

def input = "hello world hello"
def word = input.split(" ")

def wordCount = [:].withDefault {0}

word.each { string ->
    wordCount[string] += 1
}

// Printing the word with it's count
wordCount.each {eachWord, count ->
    println "$eachWord => $count"
}
