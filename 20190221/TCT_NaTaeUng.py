def calCash(station):
    stCashList = list()
    nowPeople = 0;
    nowTransfer = 0;
    for st in station :
        if nowPeople + nowTransfer + st[1] - st[0] + st[3] - st[2] > 100 :
            if nowPeople + nowTransfer + st[1] - st[0] - st[2] > 100 :
                cash = (100 - nowTransfer - st[2]) * 1000 + (nowTransfer - st[2]) * 200
                nowPeople = 100 - nowTransfer - st[2]
                nowTransfer = nowTransfer - st[2]
            else :
                cash = (nowPeople + st[1] - st[0] > 100 ) * 1000 + (100 - nowPeople + st[1] - st[0]) * 200
                nowPeople = nowPeople + st[1] - st[0] > 100
                nowTransfer = 100 - nowPeople + st[1] - st[0]
        else :
            cash = (nowPeople + st[1] - st[0])*1000 + (nowTransfer + st[3]-st[2])*200
            nowPeople = st[1] - st[0]
            nowTransfer = st[3] - st[2]
        stCashList.append(cash)
    print(max(stCashList))

print('•입력')
station = [[0, 32, 0, 3], [3, 13, 1, 0], [28, 25, 1, 5], [39, 0, 6, 0]]
for i in station :
    print(i)

print('•출력')
calCash(station)
