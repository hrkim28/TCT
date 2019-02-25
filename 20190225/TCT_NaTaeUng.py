def calCash(inputData):
    resultData = [0 for _ in range(len(inputData))]
    dfs(inputData,resultData, 0)
    print(maxVal)
    return

def dfs(inputData, resultData, cnt):
    global maxVal
    if cnt == len(inputData)-1:
        maxVal = max(maxVal, sum(resultData))
        return
    cnt = cnt + 1
    for i in range(len(inputData)):
        temp = inputData.copy()
        tempR = resultData.copy()
        if inputData[i] != -1 :
            temp[i-1] = -1
            if i != len(inputData)-1 : temp[i+1] = -1
            else : temp[0] = -1
            tempR[i] = inputData[i]
            dfs(temp, tempR, cnt)

maxVal = 0
print('•입력')
inputData1 = [2000,3000]
inputData2 = [1000,3000,1000]
inputData3 = [2000,2000,2000,2000]
inputData4 = [1000,10000,8000,5000,7000,3000,9000]
print(inputData1)
print(inputData2)
print(inputData3)
print(inputData4)

print('•출력')
calCash(inputData1)
calCash(inputData2)
calCash(inputData3)
calCash(inputData4)
