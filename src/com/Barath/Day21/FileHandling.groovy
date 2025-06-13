package com.Barath.Day21

def file = new File("name.txt")
file.text = "Barath C"

def content = file.text
println "Read from file: ${content}"

