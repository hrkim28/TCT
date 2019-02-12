def checkOneTime(inParam):
    for numChar in set(str(inParam)):
        if str(inParam).count(numChar) > 1:
            return False
    return True

inputNumber = int(input())
printNumber = inputNumber
for desNum in range(inputNumber,0,-1):
    if checkOneTime(desNum) :
        printNumber = desNum
        break

for incNum in range(inputNumber, 10000000000):
    if checkOneTime(incNum):
        if abs(inputNumber - printNumber) > abs(inputNumber - incNum):
            printNumber = incNum
        break

print(printNumber)
