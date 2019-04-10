# Create by LeeDongGeun
# 문제풀이 수정완료

def compPrime(inputData):
    intCheck = 0
    resultVal = []

    for i in range(1, inputData//2+1):
        intCheck = inputData - i
        if checkPrime(i) == True and checkPrime(intCheck) == True:
            resultVal.append((i, intCheck))

    #연속수로 처리되므로 가장 마지막 처리된 값이 상호 차이가 가장 작음
    print(resultVal[-1])

def checkPrime(inputData):
    for i in range(2,inputData):
        if inputData%i == 0:
            return False
    return True

compPrime(6)
compPrime(16)
compPrime(32)