#TCT_20190213_KimJinKwui.py
import math
def getCalcCount(inParam):
    rtnCnt = 0

    while inParam > 1 :
        if inParam % 3 == 0:
            inParam = int(inParam / 3)
        else:
            if inParam == int(math.pow(2, round(math.log(inParam) / math.log(2)))):
                inParam = int(inParam / 2)
            elif inParam % 3 == 2 and inParam % 2 == 0:
                inParam = int(inParam / 2)
            else:
                inParam -= 1
        rtnCnt += 1
        print("계산과정 : " + str(rtnCnt) + "번째 값 > " + str(inParam))

    return rtnCnt

inputNum = int(input())
print(getCalcCount(inputNum))
