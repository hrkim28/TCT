#input
n=3
s=13

resultList =[]

if n>s :
    resultList.append(-1)
else :
    remaind = s%n
    resultNum = s//n

    for i in range(n-1):
        resultList.append(resultNum)

    resultList.append(resultNum+remaind)


print(resultList)