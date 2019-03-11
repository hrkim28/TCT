
def isClosed(inputStr):
    isClosed = False

    largeOpenCnt = 0
    mediumOpenCnt = 0
    smallOpenCnt = 0

    for i in inputStr:
        if i == "[":
            largeOpenCnt+=1
        elif i == "{":
            mediumOpenCnt+=1
        elif i == "(":
            smallOpenCnt+=1
        elif i == "]":
            largeOpenCnt -= 1
        elif i == "}":
            mediumOpenCnt -= 1
        elif i == ")":
            smallOpenCnt -= 1

    if largeOpenCnt == 0 and mediumOpenCnt == 0 and smallOpenCnt == 0:
        isClosed = True

    return isClosed


inputStr1 = "{[()]}[{}]"
inputStr2 = "{[()]}[{}["
inputStr3 = "{[()]}[{)]"
inputStr4 = "{[(]}[{}]"
inputStr5 = "}])]"

print(inputStr1 + " : " + str(isClosed(inputStr1)))
print(inputStr2 + " : " + str(isClosed(inputStr2)))
print(inputStr3 + " : " + str(isClosed(inputStr3)))
print(inputStr4 + " : " + str(isClosed(inputStr4)))
print(inputStr5 + " : " + str(isClosed(inputStr5)))