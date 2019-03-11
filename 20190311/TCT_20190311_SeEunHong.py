startList = ['(', '[', '{']
endList = [')', ']', '}']

def checkPair(inputString) :
    checkList = []
    inputList = list(inputString)


    for inputWord in inputString :
        if(inputWord in startList) :
            num = startList.index(inputWord)
            checkList.append(num)
        else :
            if (len(checkList) == 0): return False
            num = checkList.pop()
            if(inputWord!=endList[num]) :return False


    return True


#입력 : {[()]}[{}]
print("{[()]}[{}] : ", checkPair("{[()]}[{}]"))

#입력 : {[()]}[{}
print("{[()]}[{} : ", checkPair(" {[()]}[{}"))

#입력 : }])]
print("}])] : ", checkPair("  }])]"))