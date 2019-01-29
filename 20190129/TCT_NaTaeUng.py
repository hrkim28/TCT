
print('•입력')
inputStr = input()
inputList = list(inputStr)
cycleCnt = inputList.count('+') + inputList.count('-') + inputList.count('*') + inputList.count('/')

print('\n•출력')
for k in range(0, cycleCnt):
    chkList = list()
    if inputStr.find('*') >= 0 or inputStr.find('/') >= 0:
        if inputStr.find('*') > inputStr.find('/') and inputStr.find('/') > 0:
            calIdx = inputStr.find('/')
        else:
            if inputStr.find('*') > 0:
                calIdx = inputStr.find('*')
            else :
                calIdx = inputStr.find('/')
    else:
        if inputStr.find('+') > inputStr.find('-') and inputStr.find('-') > 0 :
            calIdx = inputStr.find('-')
        else:
            if inputStr.find('+') > 0:
                calIdx = inputStr.find('+')
            else :
                calIdx = inputStr.find('-')

    for i in range(0,inputStr.__len__()):
        if inputStr[i] == '+' or inputStr[i] == '-' or inputStr[i] == '*' or inputStr[i] == '/':
            chkList.append(i)

    nextStr =''

    if chkList.index(calIdx) == 0 or chkList.__len__() == 1:
        startIdx = calIdx
        a = float(inputStr[:calIdx])
    else :
        startIdx = chkList[chkList.index(calIdx)-1]
        a = float(inputStr[startIdx+1:calIdx])
        print(inputStr[0:startIdx + 1], end = '')
        nextStr = inputStr[:startIdx + 1]

    if chkList.index(calIdx) == chkList.__len__() or chkList.__len__() == 1:
        endIdx = calIdx
        b = float(inputStr[calIdx + 1:])
    else :
        endIdx = chkList[chkList.index(calIdx) + 1]
        b = float(inputStr[calIdx + 1:endIdx])


    if inputStr[calIdx] == '+':
        print( a+ b, end = '')
        nextStr = nextStr + str(a+ b)
    elif inputStr[calIdx] == '-':
        print(a-b, end = '')
        nextStr = nextStr + str(a - b)
    elif inputStr[calIdx] == '*':
        print(a*b, end = '')
        nextStr = nextStr + str(a * b)
    elif inputStr[calIdx] == '/':
        print(a/b, end = '')
        nextStr = nextStr + str(a / b)

    if endIdx != calIdx:
        print(inputStr[endIdx:])
        nextStr = nextStr + inputStr[endIdx:]

    inputStr = nextStr










