
def isJavaVar(str):
    for i in str:
        if i.isupper():
            return True

def changeCamelOrSnake(inputStr):
    outputStr = ""

    if isJavaVar(inputStr):
        for j in inputStr:

            if j.isupper():
                outputStr = outputStr+"_"+j
            else:
                outputStr += j

        print(outputStr)

    elif  inputStr.find("_") >-1:
        inx = 0
        for k in inputStr.split('_'):
            if inx !=0:
                outputStr = outputStr + k.capitalize()
            else:
                outputStr+=k
            inx += 1

        print(outputStr)

    else:
        print("wrong input")


changeCamelOrSnake("long_and_mnemonic_identifier")
changeCamelOrSnake("jobLog")
changeCamelOrSnake("abcdefg")