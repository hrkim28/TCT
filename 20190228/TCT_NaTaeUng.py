
def getRisk(inputData,memorySize):
    riskInMemory = 1
    riskOutMemory = 5
    risk = 0
    memoryList = list()
    for i in inputData:

        if i in memoryList :
           risk = risk +  riskInMemory
        else :
            risk = risk + riskOutMemory
            if memorySize == len(memoryList) : memoryList.pop(0)
            memoryList.append(i)
    print(risk)


memorySize = 5
inputData =  ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]
print("입력")
print(inputData)
print("출력")
getRisk(inputData,memorySize)
