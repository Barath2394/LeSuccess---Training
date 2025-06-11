package com.Barath.Day19

def str1 = "listen"
def str2 = "silent"

def isAnagram = str1.length() == str2.length()

if (isAnagram) {
    def arr1 = str1.toCharArray().sort()
    def arr2 = str2.toCharArray().sort()
    isAnagram = arr1 == arr2
}

println isAnagram

