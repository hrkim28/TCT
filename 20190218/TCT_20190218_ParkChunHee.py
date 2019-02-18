cntZero = 0
cntOne = 0

def fibonacci(inputNum):
    global cntZero
    global cntOne

    if inputNum == 0:
        print("0")
        cntZero+=1
        return 0
    elif inputNum == 1:
        print("1")
        cntOne += 1
        return 1
    else:
        return fibonacci(inputNum-1)+fibonacci(inputNum-2)


inputNum = 3


fibonacci(inputNum)

print(str(cntZero) + " " + str(cntOne))

















