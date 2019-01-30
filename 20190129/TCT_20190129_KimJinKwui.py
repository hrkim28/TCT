#TCT_20190129_KimJinKwui.py

def printArithmeticOper(inputStr):
    calcNum = inputStr.replace(" ","")

    while ( isExistsArithmetic(calcNum, '/') or isExistsArithmetic(calcNum, '*') or isExistsArithmetic(calcNum, '+') or isExistsArithmetic(calcNum, '-') ):
        if ( isExistsArithmetic(calcNum, '/') or isExistsArithmetic(calcNum, '*') ):
            divInx = len(calcNum) if calcNum.find('/') == -1 else calcNum.find('/')
            multiInx = len(calcNum) if calcNum.find('*') == -1 else calcNum.find('*')

            if divInx < multiInx:
                calcNum = calcArithmetic(calcNum,divInx,'/')
            else:
                calcNum = calcArithmetic(calcNum,multiInx,'*')
        elif ( isExistsArithmetic(calcNum, '+') or isExistsArithmetic(calcNum, '-') ):
            plusInx = len(calcNum) if calcNum.find('+') == -1 else calcNum.find('+')
            minusInx = len(calcNum) if calcNum.find('-') == -1 else calcNum.find('-')

            if plusInx < minusInx:
                calcNum = calcArithmetic(calcNum,plusInx,'+')
            else:
                calcNum = calcArithmetic(calcNum,minusInx,'-')
        print(calcNum)

def isExistsArithmetic(inputStr, findSymbol):
    if ( inputStr.find(findSymbol) > -1 ):
        return True
    else:
        return False

def getArithmeticIndex(inputStr, isReverse):
    rtnInx = -1 if isReverse else len(inputStr)
    if ( isReverse ):
        if ( inputStr.rfind('+') > rtnInx ):
            rtnInx = inputStr.rfind('+')
        if ( inputStr.rfind('-') > rtnInx ):
            rtnInx = inputStr.rfind('-')
        if (inputStr.rfind('*') > rtnInx):
            rtnInx = inputStr.rfind('*')
        if (inputStr.rfind('/') > rtnInx):
            rtnInx = inputStr.rfind('/')
    else:
        if ( isExistsArithmetic(inputStr, '+') and inputStr.find('+') < rtnInx ):
            rtnInx = inputStr.find('+')
        if ( isExistsArithmetic(inputStr, '-') and inputStr.find('-') < rtnInx ):
            rtnInx = inputStr.find('-')
        if ( isExistsArithmetic(inputStr, '*') and inputStr.find('*') < rtnInx):
            rtnInx = inputStr.find('*')
        if ( isExistsArithmetic(inputStr, '/') and inputStr.find('/') < rtnInx):
            rtnInx = inputStr.find('/')
    return rtnInx

def calcArithmetic(inputNum, inx, targetSymbol):
    leftExp = inputNum[:inx]
    rightExp = inputNum[inx + 1:]

    return leftExp[:getArithmeticIndex(leftExp, True)+1] + str(eval(leftExp[getArithmeticIndex(leftExp, True)+1:] + targetSymbol + rightExp[:getArithmeticIndex(rightExp, False)])) + rightExp[getArithmeticIndex(rightExp, False):]

testCase1 = "9+5-4+8"
testCase2 = "5+6*3-6/2+5"

print("========================")
print("입력 : " + testCase1)
printArithmeticOper(testCase1)
print("========================")
print("입력 : " + testCase2)
printArithmeticOper(testCase2)
print("========================")