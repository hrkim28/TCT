def chgStr(inList, chkList, target):
    result = ''
    for i in range(len(inList)):
        str = inList[i]
        for j in range(len(str)):
            if ord(str[j]) in chkList:
                if target == 'c' and ord(str[j]) in range(65, 91): result = result +"_"+chr(ord(str[j])+32)
                elif target == 'java' and j == 0 and i != 0: result += chr(ord(str[j])-32)
                else : result += str[j]
            else:
                result = "error"
                break
    print(" 출력 : ", result)
    print()

def chgData(inputData):
    chkStrList = [i for i in range(97, 123)]
    chkStrList.extend([i for i in range(65, 91)])
    chkStrList.append(ord('_'))
    for inData in inputData:
        print(" 입력 : ", inData)
        tmp = inData.split('_')
        if len(tmp) == 1 :
            chgStr(tmp, chkStrList, 'c')
        else :
            chgStr(tmp, chkStrList, 'java' )

# 입력값으로 숫자, 특수문자가 있을 경우 error 처리
inputData = ['long_and_mnemonic_identifier', 'jobLog']
chgData(inputData)




