import sys

inf = sys.stdin

print('•입력')
T = int(inf.readline())
tmpList = list()
inputData=(inf.readline().split('\n')[0].split(' '))

for i in range(T*2+1):
    if i < T : tmpList.append(int(inputData[i]))
    else : tmpList.append(0)

inputData = tmpList.copy()

print('•출력')
for i in range(1,T):
    maxVal = max(tmpList)
    for j in range(T+1):
        tmpList[j+i] = tmpList[j+i]+inputData[j]
    if maxVal > max(tmpList) :
        print(maxVal)
        break
    elif i == T-1 :
        print(max(tmpList))