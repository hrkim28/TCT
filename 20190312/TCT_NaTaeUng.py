def makecombination(n, k):
    result = list()
    comlist = [0 for _ in range(k)]
    result.append([0,0,0,0])
    while sum(comlist) != ((n-1)*k) :
        for i in range(k-1,-1,-1):
            if comlist[i] + 1 == k :
                comlist[i] = 0
                continue
            else :
                comlist[i] = comlist[i] + 1
                break
        tmp = comlist.copy()
        result.append(tmp)
    return result

result = makecombination(4,4)

for i in range(len(result)):
    for j in range(len(result[i])):
        print(result[i][j], end = '')
    print()