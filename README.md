
# LeetCode Challenge D22


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [557.  Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

>**Input:** `s` = `"Let's take LeetCode contest"`
>
>**Output:** `"s'teL ekat edoCteeL tsetnoc"`

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
My initial approach was to convert the String to a char array and then reverse this array, which does not provide the required output because it reverses the entire character array, including spaces, leading to incorrect word order in the reversed string.

Then in the current approach I decided to split the String first into separate words using the split method and regex as `" "`. Then two for loops were used: one to iterate through the words in the String and another to iterate through the letters in each word.  For each word, I employed a `StringBuilder` to efficiently reverse the order of letters. Finally all words in the array were joined with a space separating each pair.
