#TCT_20190128_KimJinKwui.py
import re
def getManyAlphabat(inputA):
    rstMap = {'str':[],'maxCnt':0}
    dicA = {}
    m = re.findall('[a-z]',inputA.lower())

    # dictionary 로 알파벳 카운트 변경
    for k in m:
        if k in dicA:
            dicA[k] = dicA[k] + 1
        else:
            dicA[k] = 1

    # max 값
    maxCnt = 0
    for v in dicA.values():
        if maxCnt < v:
            maxCnt = v
            
    rstMap['maxCnt'] = maxCnt
    
    # max 인 알파벳 추출
    for k in dicA.keys():
        if dicA[k] == maxCnt:
            rstMap['str'].append(k) 
    
    return rstMap

test1 = "I think I'm lost."
test2 = "I think I'm lost.I can't tell."
test3 = "I think I'm lost. I can't tell what's where."


rst1 = getManyAlphabat(test1)
print("가장많이 쓰인 알파벳 : " + ",".join(rst1['str']) + " = " + str(rst1['maxCnt']) + "회");
rst1 = getManyAlphabat(test2)
print("가장많이 쓰인 알파벳 : " + ",".join(rst1['str']) + " = " + str(rst1['maxCnt']) + "회");
rst1 = getManyAlphabat(test3)
print("가장많이 쓰인 알파벳 : " + ",".join(rst1['str']) + " = " + str(rst1['maxCnt']) + "회");
