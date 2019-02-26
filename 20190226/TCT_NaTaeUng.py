def message(inputData):
    for str in inputData:
        print('•출력')
        chgKeyBoard = list()
        chgNum = inputData[str].split(' ')

        for num in range(9):
            chgKeyBoard.append(keyboard[int(chgNum[num])-1])
        chk = -1
        for chr in str :
            for key in chgKeyBoard :
                printStr = (chgKeyBoard.index(key)+1)
                printRe = (key.find(chr) + 1)
                if chr in key :
                    if printStr == chk: print('#', end='')
                    chk = printStr
                    print("%s" %printStr*printRe, end='')

        print()

keyboard = ['', 'abc', 'def', 'ghi', 'jkl', 'mno', 'pqrs', 'tuv', 'wxyz']
inputData = {'klor':'2 3 4 5 6 7 8 9 1', 'djevojka':'7 8 9 1 2 3 6 5 4', 'skakavac':'9 8 7 6 5 4 3 2 1'}
for i in inputData:
    print('•입력')
    print(inputData[i])
    print(i)

message(inputData)
