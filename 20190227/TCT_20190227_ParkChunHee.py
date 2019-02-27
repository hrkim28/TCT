#n = 2
#s = 9

#n = 2
#s = 1

n = 3
s = 13
resultList = []

if n > s:
    resultList = [-1]
else:
    for i in range(1,n):
        cnt = s // n
        resultList.append(cnt)
        n = n - 1
        if n == 1:
            resultList.append(s - cnt)
        s=s-cnt

resultList.sort(reverse=False)

print(resultList)







