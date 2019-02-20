
def getMaxNum(inputList):
    maxNum = 0
    for inx in range(len(inputList)):
        if inx < len(inputList)-1:
            tempNum = inputList[inx] + inputList[inx +1]
            if maxNum < tempNum:
                maxNum = tempNum
    return maxNum

inputListA = [10, -4, 3, 1, 5, 6, -35, 12, 21, -1]

print(inputListA)
print(getMaxNum(inputListA))


