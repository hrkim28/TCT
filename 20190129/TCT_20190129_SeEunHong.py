#입력
#print('입력 : ', end ='')
#number = list(input())

number = list('5+6*3-6/2+5')
calnum =0

numList = list()
#
startnum = 0
for i in range(len(number)) :

    if number[i].isnumeric() : continue
    else :
        numList.append(''.join(number[startnum:i]))
        numList.append(number[i])
        startnum=i+1

numList.append(''.join(number[startnum:]))

#계산

result =''.join(number)
while len(numList)>2 :
    #식에 *와 /가 동시에 있는 경우 앞에 있는 연산자 부터 계산
    if result.find('/') > 0 and result.find('*') > 0 :
        if(numList.index('/')<numList.index('*')) :
            i = numList.index('/')
            calnum = int(numList[i-1])/int(numList[i+1])

        else:
            i = numList.index('*')
            calnum = int(numList[i - 1]) * int(numList[i + 1])
    #나누기만 있는 경우
    elif result.find('/') > 0 :
        i = numList.index('/')
        calnum = int(numList[i - 1]) / int(numList[i + 1])
    #곱하기만 있는 경우
    elif result.find('*') > 0 :
        i = numList.index('*')
        calnum = int(numList[i - 1]) * int(numList[i + 1])
    #더하기 뺴기 연산자는 순서대로 연산
    else :
        calStr = numList[1]
        i=1
        if calStr == '+':
            calnum = int(numList[i - 1]) + int(numList[i + 1])
        else:
             calnum = int(numList[i - 1]) - int(numList[i + 1])
    #연산된 부분 삭제
    del(numList[i-1:i+2])
    #연산된 값 추가
    numList.insert(i-1,str(int(calnum)))
    #결과값 출력
    result = ''.join(numList)
    print(result)

