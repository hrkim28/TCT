import sys
import operator

num = int(sys.stdin.readline())

inputMap = {};
if num < 1 or num > 20000:
    print('단어의 개수는 1부터 20000까지 입력 가능합니다.')
else:
    for inx in range(num):
        inputStr = str(sys.stdin.readline())
        inputStr = inputStr[:-1]
        inputMap[inputStr] = len(inputStr)

    inputMap = sorted(inputMap.items(), key=operator.itemgetter(1))

    tmp = 0
    listMap = {}
    list =[]
    for inx in inputMap:
        if tmp == 0 :
            tmp = inx[1]
        if inx[1] == tmp :
            list.append(inx[0])
            listMap[inx[1]] = list
        else :
            list = []
            list.append(inx[0])
            listMap[inx[1]] = list
            tmp = inx[1]

    for inx in listMap.keys():
        tmpList = listMap[inx]
        tmpList.sort()
        for jnx in tmpList:
            print(jnx)