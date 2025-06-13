package com.Barath.Day20

def add = {a,b -> a+b}
def sub = {a,b -> a-b}
def mul = {a,b -> a*b}
def div = {a,b -> a/b}
// CallBack Function
def calculator(a,b,callBack) {
    return callBack(a,b)
}
println "Sum : " + calculator(4,2,add)
println "Sub : " + calculator(4,2,sub)
println "Mul : " + calculator(4,2,mul)
println "Div : " + calculator(4,2,div)