import re

strA = "5+16*3*6/2+5"
print(strA)
numList = re.findall("[0-9]+", strA)
codeList = re.findall("[^0-9a-zA-Z]", strA)


def listToString(list1, list2):
    tStr = ""
    for i in range(len(list1)):
        if i+1 == len(list1):
            tStr+=str(list1[i])
        else:
            tStr += str(list1[i]) + list2[i]
    return tStr


while len(codeList) > 0:
    if("*" in codeList):
        a = codeList.index("*")
        b = int(numList[a]) * int(numList[a + 1])
        codeList.pop(a)
        numList[a] = b
        numList.pop(a + 1)
        c = listToString(numList, codeList)
        print(c)
    elif("/" in codeList):
        a = codeList.index("/")
        b = int(int(numList[a]) / int(numList[a + 1]))
        codeList.pop(a)
        numList[a] = b
        numList.pop(a + 1)
        c = listToString(numList, codeList)
        print(c)
    else :
        break

while len(codeList) > 0:
    if codeList[0] == "+":
        b = int(numList[0]) + int(numList[1])
    else:
        b = int(int(numList[0]) - int(numList[1]))
    codeList.pop(0)
    numList[0] = b
    numList.pop(1)
    c = listToString(numList, codeList)
    print(c)
