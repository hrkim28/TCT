
def printCalculateProcedure(str):
    strList = []

    # 문자열을 배열에 담기
    for i in range(len(str)):
        strList.append(str[i])

    calc(strList)

def calc(strList):
    tmp = 0;
    printStr = ""
    # * / 부터 연산
    if '*' in strList or '/' in strList:
        for j in range(len(strList)):
            if strList[j] == "*" or strList[j] == "/":
                if  strList[j] == "*":
                    tmp = int(strList[j-1]) * int(strList[j+1])
                    break
                else:
                    tmp = int(strList[j-1]) / int(strList[j+1])
                    break
    else:
        for j in range(len(strList)):
            if strList[j] == "+" or strList[j] == "-":
                if  strList[j] == "+":
                    tmp = int(strList[j-1]) + int(strList[j+1])
                    break
                else:
                    tmp = int(strList[j-1]) - int(strList[j+1])
                    break
    # 계산 끝낸 값 제거
    del strList[j-1:j+1:1]
    # 계산 값 삽입
    strList[j-1] = tmp

    #출력용 문자열 변수에 담는다
    for i in range(len(strList)):
        printStr+=str(strList[i])

    #출력
    print(printStr)

    # 연산자가 하나도 없을때 까지 호출
    if '*' in strList or '/' in strList or '+' in strList or '-' in strList:
        calc(strList)

#inputStr = "9+5-4+8"
inputStr = "5+6*3-6/2+5"


printCalculateProcedure(inputStr)
