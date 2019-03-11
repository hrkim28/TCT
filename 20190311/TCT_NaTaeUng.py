def chkbar(input):
    barList = list()
    for inData in input:
        print("입력")
        print(inData)
        flg = True
        compBar = ''
        for i in range(len(inData)):
            if len(barList) > 0 and ( ')' == inData[i] or '}' == inData[i] or ']' == inData[i]) :
                compBar = barList.pop(len(barList)-1)
            if inData[i] == '(' or inData[i] == '[' or inData[i] == '{': barList.append(inData[i])
            elif inData[i] == ')' and compBar == "(": continue
            elif inData[i] == '}' and compBar == "{": continue
            elif inData[i] == ']' and compBar == "[" : continue
            else:
                flg = False
                break
        print('출력')
        print(flg)
        print()

input = ['{[()]}[{}]', '{[()]}[{}[', '{[()]}[{)]', '{[(]}[{}]', '}])]' ]
chkbar(input)
