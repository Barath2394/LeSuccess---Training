package com.Barath.Day21

try {
    def result = 10 / 0
    println "Result: $result"
    def file = new File("nonexistent.txt")
    println file.text
} catch (ArithmeticException e) {
    println "Caught divide-by-zero: ${e.message}"
} catch (FileNotFoundException e) {
    println "File not found: ${e.message}"
} catch (Exception e) {
    println "Some other error: ${e.message}"
} finally {
    println "This block always runs (finally)."
}
