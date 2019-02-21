inputDic = { 'station1': [0,32,0,3], 'station2': [3,13,1,0], 'station3': [28,25,1,5], 'station4': [39,0,6,0]}

shortPassenger = 0
transferPassenger = 0
resultArr = []

for i in inputDic.values():
    shortPassenger = shortPassenger + i[1]-i[0]
    transferPassenger = transferPassenger + i[3]-i[2]

    resultArr.append((shortPassenger*1000) + (transferPassenger*200))

print(str(resultArr.index(  max(resultArr)) + 1) + "번역 : " + str(max(resultArr)))
