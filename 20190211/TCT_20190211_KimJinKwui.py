#TCT_20190211_KimJinKwui.py
def iter_find(haystack, needle):
    return [i for i in range(0, len(haystack)) if haystack[i:].startswith(needle)]

def validSMTP(inputParam):
    for findChar in set(inputParam):
        if inputParam.count(findChar) % 3 == 0:
            return "FAKE"
        elif inputParam.count(findChar) >= 4:
            divCnt = int(inputParam.count(findChar)/4)
            indexList = iter_find(inputParam,findChar)

            while divCnt > 0:
                if indexList[divCnt*4-2] != indexList[divCnt*4-1]-1:
                    return "FAKE"
                divCnt -= 1
    return "OK"

testCnt = int(input())

while testCnt > 0 :
    inStr = input()
    print(validSMTP(inStr))
    testCnt -= 1