package com.Barath.Day21

class MyClassExample {
    def propertyMissing(String name) {
        return "undefined"
    }
}

def obj = new MyClass()
println obj.unknownProperty
