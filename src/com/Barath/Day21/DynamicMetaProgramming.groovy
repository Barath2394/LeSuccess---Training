package com.Barath.Day21

class DynamicClass {
    String name
}

def obj = new DynamicClass()
obj.metaClass.age = 25
obj.metaClass.sayInfo = {
    println "Name: ${delegate.name}, Age: ${delegate.age}"
}

obj.name = "Barath C"
println "Age (added dynamically): ${obj.age}"
obj.sayInfo()

