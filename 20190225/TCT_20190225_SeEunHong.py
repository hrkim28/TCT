#input
# 예시1 = { 2000, 3000 }
# 예시2 = { 1000, 3000, 1000 }
# 예시3 = { 2000, 2000, 2000, 2000 }
# 예시4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 }

moneyList = [1000, 3000, 1000 ]

i=0
#리스트가 홀수개이면서 두번째 포함
def case1 (myList) :
    total = myList[0]
    i=2
    while i < len(myList) - 1:
        if myList[i] >= myList[i + 1]:
            total = total + myList[i]
            i = i + 2
        else:
            total = total + myList[i + 1]
            i = i + 3
    return total
#리스트가 홀수개이면서 첫번째 포함
def case2 (myList) :
    total = myList[1]
    i=3
    while i < len(myList) - 1:
        if myList[i] >= myList[i + 1]:
            total = total + myList[i]
            i = i + 2
        else:
            total = total + myList[i + 1]
            i = i + 3
            if (len(myList)-1) == i :
                total = total + myList[len(myList) - 1]
    return total
#리스트가짝수개인경우
def case3 (myList) :
    total =0
    i=0
    while i < len(myList)-1:
        if moneyList[i] >= myList[i + 1]:
            total = total + myList[i]
            i = i + 2
        else:
            total = total + myList[i + 1]
            i = i + 3
    if len(myList)-1==i:
        total = total + myList[i]

    return  total


if len(moneyList)%2==0 :
    print(case3(moneyList))
else :
    total1 = case1(moneyList)
    total2 = case2(moneyList)
    if total1>total2 :
        print(total1)
    else:
        print(total2)




