#입력
print('입력 : ', end ='')
number = list(input())
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


while len(numList)>2 :

    if numList.count('/') > 0 and numList.count('*') > 0:
        if(numList.index('/')<numList.index('*')) :
            i = numList.index('/')
            calnum = int(numList[i-1])/int(numList[i+1])

        else:
            i = numList.index('*')
            calnum = int(numList[i - 1]) * int(numList[i + 1])
    else :
        if(numList.count('/')>0):
            i = numList.index('/')
            calnum = int(numList[i - 1]) / int(numList[i + 1])
        elif (numList.count('*') > 0):
            i = numList.index('*')
            calnum = int(numList[i - 1]) * int(numList[i + 1])
        #if (numList.index('+') < numList.index('-')):
        elif (numList.count('+') > 0):
            i = numList.index('+')
            calnum = int(numList[i - 1]) +int(numList[i + 1])


        elif (numList.count('-') > 0):
        #else:
            i = numList.index('-')
            calnum = int(numList[i - 1])-int(numList[i + 1])


    del(numList[i-1:i+2])
    numList.insert(i-1,str(int(calnum)))
    result = ''.join(numList)
    print(result)


# 출력
