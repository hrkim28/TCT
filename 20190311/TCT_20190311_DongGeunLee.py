def comParentheses(inputData):

    checkVal = True

    for checkData in inputData:

        if checkData.count('{') == checkData.count('}') and checkData.count('[') == checkData.count(']') and checkData.count('(') == checkData.count(')'):

           checkVal = True

        else:

            checkVal = False

        print('입력 :', checkData)
        print('출력 :', checkVal)

    return print('--- 작업완료 ---')


testData = ['{[()]}[{}]','{[()]}[{}[','{[(]}[{}]','}])]']
print(comParentheses(testData))
    
