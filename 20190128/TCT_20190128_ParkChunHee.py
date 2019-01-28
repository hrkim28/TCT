

def findMaxUseAlphabet(str):
    resultList = []
    tmpMap = {}
    maxNum = 0
    str = str.lower()

    # 소문자로 변환한 inputStr을 문자 단위로 읽으며 알파벳만 골라 낸다
    for i in str:
        if (i.isalpha()):
            if i in tmpMap:
                tmpMap[i] = tmpMap[i] + 1
            else:
                tmpMap[i] = 1

    # 가장 많이 사용 된 횟수 찾기
    for j in tmpMap:
       if(tmpMap[j] > maxNum):
           maxNum = tmpMap[j]

    # 가장 많이 사용 된 횟수의 알파벳 찾기
    for k in tmpMap:
        if(tmpMap[k] == maxNum):
            resultList.append(k[0])

    # 오름차순 정렬
    resultList.sort(reverse=False)

    print("가장많이 쓰인 알파벳 : " + ",".join(resultList) + " = " + repr(maxNum) + "회");



#inputStr = "I think I'm lost."
inputStr = "I think I'm lost.I can't tell."
#inputStr = "I think I'm lost. I can't tell what's where."


findMaxUseAlphabet(inputStr)
