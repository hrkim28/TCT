# Create by LeeDongGeun
# 문제풀이 진행중입니다.(미완성)

def compPrime(inputData):
    intCheck = 0
    minCheck = 0
    minCnt = 0
    for i in range(1, inputData):
        intCheck = inputData - i
        if checkPrime(i) == False or checkPrime(intCheck) == False:
            continue
        else:
            minCheck = intCheck - i
            if minCheck > minCnt:
            else:
                minCnt = minCheck


def checkPrime(inputData):
    for i in range(2,inputData):
        if inputData%i == 0:
            return False
    return True
