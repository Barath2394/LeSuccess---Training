package com.Barath.Day21

class MyClass {
    def methodMissing(String name, args) {
        println "Method ${name} is not defined"
    }
}

def obj = new MyClass()
obj.sayHello()

