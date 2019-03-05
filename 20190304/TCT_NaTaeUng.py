
def palindrome(inputData):
    for inData in inputData:

        reverseStr = ''
        cnt = 0
        reverseStrList = list()
        tmpList = list()

        for i in range(len(inData)):
            reverseStr = reverseStr + inData[len(inData)-(i+1)]

        for i in range(len(reverseStr)+1) :
            if inData[i:] == reverseStr[:len(inData)-(i)] :
                resultStrList = ','.join(inData[:i]).split(",")
                break

        for i in resultStrList:
            if i != '' and i not in tmpList:
                cnt += 1
                tmpList.append(i)

        print(cnt)

inputData = ['madam','abab','lalavla']
print("입력")
print(inputData)
print("출력")
palindrome(inputData)


