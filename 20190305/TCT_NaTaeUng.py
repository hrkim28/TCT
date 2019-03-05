
def chkNum(inputData):

    for inData in inputData:
        print("입력 : 진수 = ", end='')
        print(inData)
        tmp = inData - 1
        resultList = list()
        while tmp in range(inData):
            #print("sfsfs", tmp not in range(inData))
            resultList.append(int(tmp))
            tmp=tmp**(1.0/2.0)

        resultList.sort()

        print("출력 :", end='')
        print(resultList)

inputData = [10, 3, 26, 30]
chkNum(inputData)


