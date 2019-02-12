def isUniqueNum(str):
    temp = []
    rtn ="Y"
    for i in str:
        if i in temp:
            rtn = "N"
            break
        else:
            temp.append(i)

    return rtn

inputNum = 222
#inputNum = 5000

findCnt = 0
inx = 1

while findCnt <= 0:
    testNumPlus = inputNum+inx
    testNumMinus = inputNum-inx
    resultPlus = isUniqueNum(repr(testNumPlus))
    resultMinus = isUniqueNum(repr(testNumMinus))

    inx += 1

    if resultPlus == "Y" or resultMinus == "Y":
        findCnt+=1
        if resultMinus == "Y":
            print(testNumMinus)
        else:
            print(testNumPlus)













