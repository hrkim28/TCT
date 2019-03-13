def getMaxDrink(drinkList,pNum) :
    totalDrink = sum(drinkList)
    baseDrink = totalDrink//pNum
    beforeDrink = 0

    while(True) :
        glassNum = 0
        remindNum=0
        for i in range(len(drinkList)) :
            glassNum = glassNum + drinkList[i]//baseDrink
            remindNum = remindNum + drinkList[i]%baseDrink

        if(glassNum<pNum) :
            beforeDrink = baseDrink
            baseDrink = baseDrink//2
        elif(glassNum>pNum):
            baseDrink = (beforeDrink+baseDrink)// 2
        elif(glassNum==pNum) :
            break

    while(True) :
        baseDrink = baseDrink+1
        glassNum=0
        remindNum=0

        for i in range(len(drinkList)):
            glassNum = glassNum + drinkList[i] // baseDrink
            remindNum = remindNum + drinkList[i] % baseDrink

        if (glassNum < pNum):
            baseDrink=baseDrink-1
            break

    return baseDrink


#예제1
drinkList = [702, 429]
pNum = 3
print(getMaxDrink(drinkList,pNum))
#예제2
drinkList = [427, 541, 774, 822]
pNum = 11
print(getMaxDrink(drinkList,pNum))