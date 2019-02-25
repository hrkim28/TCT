
money = [2000, 3000]
#money  = [1000, 2000, 1000]
#money = [2000, 2000, 2000, 2000]
#money = [ 1000, 10000, 8000, 5000, 7000, 3000, 9000]

result = 0
len = len(money)
tmp = list(range(len))


for i in range(0, len-1):
    tmp[i] = money[i]

    if(i > 0) :
        tmp[i] = max(tmp[i], tmp[i-1])
    if(i > 1) :
        tmp[i] = max(tmp[i], tmp[i-2] + money[i])

    result = max(result, tmp[i])

for i in range(0, len-1):
    tmp[i] = money[i+1]

    if (i > 0):
        tmp[i] = max(tmp[i], tmp[i-1])
    if (i > 1):
        tmp[i] = max(tmp[i], tmp[i-2] + money[i+1])

    result = max(result, tmp[i])

print (result)


def max(a, b) :
    if a > b :
        return a
    else :
        return b