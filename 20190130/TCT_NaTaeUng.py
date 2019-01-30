firstCon = [0,500,300,300,200,200,200,50,50,50,50,30,30,30,30,30,60,60,60,60,60,60]
secondCon = [0,512,256,256,128,128,128,128]

for i in range(0,79):
    firstCon.append(0)
for i in range(0,8):
    secondCon.append(64)
for i in range(0,16):
    secondCon.append(32)
for i in range(0,33):
    secondCon.append(0)

print('•입력')
inputN = int(input())
firstList = list()
secondList = list()
for i in range(0,inputN):
    inData = input()
    a = inData.split(" ")
    print(a[0])
    print(a[1])
    firstList.append(a[0])
    secondList.append(a[1])

for i in range(0,inputN):
    idxF = int(firstList[i])
    idxS = int(secondList[i])
    print((int(firstCon[idxF])+int(secondCon[idxS])) * 10000)