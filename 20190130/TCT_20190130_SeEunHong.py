T = 6
list = [[8,4], [13,19],[8,10],[18,18],[8,25],[13,16]]


#input 값

monster1Dic = {1:500, 2:300, 3:200, 4:50, 5:30, 6:10 } # 코드1대회 상금 등수 금액



for k in range(T) :
    monster1 =int(list[k][0])
    monster2 = int(list[k][1])
    rank1 = 0
    rank2 = 0

    i=1
    while monster1 >0 :
        rank1 = rank1 + 1
        monster1 = monster1 - i
        i = i+1

    i=1
    while  monster2>0 :
        rank2 = rank2 + 1
        monster2=monster2-i
        i=i*2
    total =0
    if rank1 < 7 :total= total+ monster1Dic[rank1]
    if rank2 < 6 : total =total+ 2 ** (10 - rank2)
    total = total * 10000
    print(total)






