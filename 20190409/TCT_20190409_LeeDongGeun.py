# Create by LeeDongGeun
# 문제풀이 수정완료

def compPrime(inputData):
    intCheck = 0
    resultVal = []
    minCnt = 0
    subCnt = 0

    for i in range(1, inputData):
        intCheck = inputData - i
        if checkPrime(i) == False or checkPrime(intCheck) == False:
            # 연속수와 차감수가 동일한 경우 이후는 앞 비교와 동일하므로 반복문 중단함
            if i == intCheck:
                break
            else:
                continue
        else:
            if i == intCheck:
                resultVal.append((i, intCheck))
                break
            else:
                resultVal.append((i, intCheck))

    #연속수로 처리되므로 가장 마지막 처리된 값이 상호 차이가 가장 작음
    return resultVal[-1]

def checkPrime(inputData):
    for i in range(2,inputData):
        if inputData%i == 0:
            return False
    return True

inputData = 32
a = compPrime(inputData)
print(a)
