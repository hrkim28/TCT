def chageType(inputValue):
    if validChageType(inputValue):
        listValue = []
        if ("_" in inputValue):
            for inx in range(len(inputValue)):
                if(inputValue[inx] != '_'):
                    if(inputValue[inx-1] == '_'):
                        listValue.append(inputValue[inx].upper())
                    else:
                        listValue.append(inputValue[inx])
        else:
            for inx in range(len(inputValue)):
                if(inputValue[inx].isupper()):
                    listValue.append('_')
                    listValue.append(inputValue[inx].lower())
                else:
                    listValue.append(inputValue[inx])

        return "".join(listValue)
    else:
        return 'ERROR'

def validChageType(inputValue):
    validFlag = True
    listValue = []

    for inx in inputValue:
        listValue.append(inx)
    if inputValue.find('_') > -1:
        for inx in range(len(listValue)):
            if (listValue[inx].isupper()) \
                    or ((inx == 0 or inx == len(listValue)-1) and listValue[inx] == '_') \
                    or (listValue[inx] == '_' and listValue[inx+1] == '_'):
                validFlag = False
    else:
        for inx in range(len(listValue)):
            if (inx == 0 and listValue[inx].isupper()) \
                    or (listValue[inx].isupper() and listValue[inx+1].isupper()):
                validFlag = False

    return validFlag

inputA = 'log_and_mnemonic_identifier'
inputB = 'jobLog'

print(chageType(inputA))
print(chageType(inputB))









