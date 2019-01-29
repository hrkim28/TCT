

def printCalculateProcedure(str):
    strList = []

    # 문자열을 배열에 담기
    for i in range(len(str)):
        strList.append(str[i])

    calc(strList)

def calc(strList):
    tmp = 0;
    # * / 부터 연산
    if '*' in strList or '/' in strList:
        for j in range(len(strList)):
            if strList[j] == "*" or strList[j] == "/":
                if  strList[j] == "*":
                    tmp =   int(strList[j-1]) * int(strList[j+1])
                    del strList[j - 1:j + 1:1]
                    strList[j - 1] = tmp
                    break
                else:
                    tmp = int(strList[j-1]) / int(strList[j+1])
                    del strList[j - 1:j + 1:1]
                    strList[j - 1] = tmp
                    break
    else:
        for j in range(len(strList)):
            if strList[j] == "+" or strList[j] == "-":
                if  strList[j] == "+":
                    tmp =   int(strList[j-1]) + int(strList[j+1])
                    del strList[j - 1:j + 1:1]
                    strList[j - 1] = tmp
                    break
                else:
                    tmp = int(strList[j-1]) - int(strList[j+1])
                    del strList[j - 1:j + 1:1]
                    strList[j - 1] = tmp
                    break
    print(strList)

    # 연산자가 하나도 없을때 까지 호출
    if '*' in strList or '/' in strList or '+' in strList or '-' in strList:
        calc(strList)

#inputStr = "9+5-4+8"
inputStr = "5+6*3-6/2+5"


printCalculateProcedure(inputStr)
