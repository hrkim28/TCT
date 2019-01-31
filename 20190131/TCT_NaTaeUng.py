print('•입력')
N = int(input())
inputDic = dict()

for i in range(N):
    inData = input()
    strList = list()
    if(inData.__len__() in inputDic):
        strList = inputDic.get(inData.__len__())
        if(not inData in strList):
            strList.append(inData)
            inputDic[inData.__len__()] = strList
    else:
        strList.append(inData)
        inputDic[inData.__len__()] = strList

keyList = list(inputDic.keys())
keyList.sort()
for i in keyList:
    tempList = inputDic[i]
    tempList.sort()
    for j in tempList:
        print(j)
