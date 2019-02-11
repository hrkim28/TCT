print('•입력')
N = int(input())
inputList = list()

for i in range(N):
    inData = input()
    inputList.append(inData)

print('•출력')
for i in inputList:
    charDic = dict()
    for j in range(len(i)):
        temp = i[j]
        if charDic.get(temp) == None :
            charDic[temp] = 1
        else :
            cnt = charDic[temp]
            charDic[temp] = cnt + 1
        if charDic.get(j) == 4:
            if temp != i[j-1] :
                charDic[temp] = 3
                break
            else :
                charDic[temp] = 1

    if 3 in charDic.values():
        print('FAKE')
    else :
        print('OK')





