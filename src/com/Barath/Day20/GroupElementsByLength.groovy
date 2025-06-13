package com.Barath.Day20

def words = ["hi", "hello", "bye", "good", "sun"]

// Create a map with default value as empty list
def groupedByLength = [:].withDefault { [] }

// Group words by their length
words.each { word ->
    groupedByLength[word.length()] << word
}

// Print the result
groupedByLength.each { length, wordList ->
    println "$length → $wordList"
}
