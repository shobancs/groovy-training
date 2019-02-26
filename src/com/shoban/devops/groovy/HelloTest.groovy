/**
 * 
 */
package com.shoban.devops.groovy

import java.util.regex.Matcher

def text = "some text to match"
def m = text =~ /match/                                           
assert m instanceof Matcher                                       
if (!m) {                                                         
    throw new RuntimeException("Oops, text not found!")
}
