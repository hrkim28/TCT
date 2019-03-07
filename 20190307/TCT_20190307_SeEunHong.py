def getH(inputList, inputM) :
    treeH = max(inputList)
    sumT=0
    i=0
    tempList=[]
    while(sumT<inputM) :
        treeH = treeH-1
        for num in inputList :
            if(num-treeH<0) : tempList.append(0)
            else : tempList.append((num-treeH))
        sumT = sum(tempList)

        tempList.clear()

    return  treeH

#예시
treeList = [20,15,10,17]
M = 7
print(getH(treeList, M))