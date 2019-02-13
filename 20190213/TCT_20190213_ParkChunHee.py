
def calc(inputNum,calcCnt):

    if inputNum > 1:

        if inputNum%3 == 0:
            inputNum = inputNum / 3
        elif inputNum%2 == 0:
            inputNum = inputNum / 2
        else:
            inputNum = inputNum - 1

        calcCnt += 1
        calc(inputNum, calcCnt)
    else:
        print(calcCnt)


inputNum = 10
calcCnt = 0

calc(inputNum,calcCnt)















