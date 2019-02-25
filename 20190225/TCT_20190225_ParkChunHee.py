maxMoney = 0

def findMaxVal(inputArr):

    global maxMoney
    if len(inputArr) < 3:
        maxMoney = max(inputArr)
    else:
        maxMoney+=max(inputArr)
        maxIndex = inputArr.index(max(inputArr))
        inputArr[maxIndex] = 0
        if maxIndex == 0:
            inputArr[maxIndex+1] = 0
            inputArr[len(inputArr)-1] = 0
        elif maxIndex == len(inputArr)-1:
            inputArr[maxIndex-1] = 0
            inputArr[0] = 0
        else:
            inputArr[maxIndex+1] = 0
            inputArr[maxIndex-1] = 0

#inputArr = [2000, 3000]
inputArr = [1000, 10000, 8000, 5000, 7000, 3000, 9000]

while max(inputArr) > 0:
    findMaxVal(inputArr)

print(maxMoney)