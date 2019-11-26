#!/bin/python

import math
import os
import random
import re
import sys

# Complete the extraLongFactorials function below.
def extraLongFactorials(n):
    fac = 1
    for i in range(1, n + 1): #1부터 n까지 곱
        fac *= i
    print(fac)

if __name__ == '__main__':
    #n=int(raw_input())
    n = int(input())
    extraLongFactorials(n)