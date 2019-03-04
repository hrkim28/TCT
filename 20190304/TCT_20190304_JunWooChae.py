def addPalindrome(inputValue):
    n = len(inputValue) // 2
    addList = ""
    isValid = True

    while True:
        isValid = True
        splitA = inputValue[:n][::-1]
        splitB = inputValue[n + 1:]
        for inx in range(len(splitB)):
            if splitB[inx] != splitA[inx]:
                isValid = False
                break
        if isValid:
            addList = splitA[len(splitB):]
            break
        n = n+1

    inputList = {};
    for i in addList:
        if i in inputList:
            inputList[i] = inputList[i] + 1
        else:
            inputList[i] = 1

    addNum = len(inputList.keys())
    return addNum

inputA = "madam"
inputB = "abab"
inputC = "lalavla"

print(addPalindrome(inputA))
print(addPalindrome(inputB))
print(addPalindrome(inputC))