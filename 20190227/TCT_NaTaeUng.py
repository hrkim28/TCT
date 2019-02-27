
def funMaxMulti(inputData):
    for i in inputData :
        result = list()
        mid = i[1]//i[0]
        if mid < 1 :
            result.append(-1)
        else :
            for j in range(1,i[0]+1):
                if j == i[0] : result.append(mid+i[1]%i[0])
                else : result.append(mid)
        print("%d\t%d\t" %(i[0], i[1]), end='')
        print(result)

inputData = [[2,9],[2,1],[3,13]]
print("N\tS\tRESULT")
funMaxMulti(inputData)
