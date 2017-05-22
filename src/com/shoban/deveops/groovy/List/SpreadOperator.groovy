package com.shoban.deveops.groovy.List

def list = ["Hello", "Test", "Lars"]

// calculate the length of every String in the list
def sizeList = list*.size()
assert sizeList == [5, 4, 4]
