
def printExpectedWinMoney(num1, num2):

    print(str(findWinMoney(num1,2018) + findWinMoney(num2,2019)))

def findWinMoney(rate, year):

    rtnVal = 0
    tmpRate = 0
    winMoneyMap = {1:5000000,2:3000000,3:3000000,4:500000,5:300000,6:100000}
    winMoneyMap2019 = {1:5120000,2:2560000,4:1280000,8:640000,16:320000}

    if year == 2019:
        winMoneyMap = winMoneyMap2019

    for i in winMoneyMap:

        tmpRate += i
        if tmpRate >= rate:
            rtnVal = winMoneyMap[i]
            break

    return rtnVal

printExpectedWinMoney(8, 4)
printExpectedWinMoney(13, 19)
printExpectedWinMoney(8, 10)
printExpectedWinMoney(18, 18)
printExpectedWinMoney(8, 25)
printExpectedWinMoney(13, 16)

