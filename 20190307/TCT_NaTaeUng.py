print('입력')
treeN = 4
needLen = 7
inputData = [20, 15, 10, 17]
gapH = [0]
print(inputData)
result = max(inputData)
inputData.sort()
inputData.reverse()

print('출력')

for i in range(treeN-1) :
    gapH.append(inputData[i]-inputData[i+1])

for i in range(len(gapH)) :
    if needLen - (gapH[i]*i) <= 0 :
        for j in range(1,1000000001):
            if needLen - (j *i) <= 0 :
                print(result-j)
                break
        break
    else :
        needLen -= gapH[i]*i
        result -= gapH[i]