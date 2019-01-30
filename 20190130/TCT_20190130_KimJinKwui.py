#TCT_20190130_KimJinKwui.py
def getReward(tDic, grade):
    rtnReward = 0
    tmp = 0
    if grade == 0:
        return rtnReward

    for key in tDic.keys():
        tmp += tDic[key][1]
        if (grade <= tmp):
            rtnReward = tDic[key][0]
            break

    return rtnReward

reward_2018 = {1:[5000000, 1],2:[3000000, 2],3:[2000000, 3],4:[500000,4],5:[300000,5],6:[100000,6]}
reward_2019 = {1:[5120000, 1],2:[2560000, 2],3:[1280000, 4],4:[640000,8],5:[320000,16]}

a= input()
for i in range(int(a)):
    b = input()
    bList = b.split(' ')

    print(int(getReward(reward_2018, int(bList[0])) + int(getReward(reward_2019, int(bList[1])))))