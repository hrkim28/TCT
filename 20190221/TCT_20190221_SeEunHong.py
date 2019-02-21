subwayRateList = [[0, 32, 0, 3],
                  [3, 13, 1, 0],
                  [28, 25, 1, 5],
                  [39, 0, 6, 0]]

totalRateList = []

onNum1=0
onNum2=0
offNum1=0
offNum2=0
for i in range(len(subwayRateList)) :
    totalRate=0

    offNum1 = offNum1+subwayRateList[i][0]
    offNum2 = offNum2+subwayRateList[i][2]
    onNum1 = onNum1+subwayRateList[i][1]
    onNum2 = onNum2+subwayRateList[i][3]

    totalRate= (onNum1-offNum1)*1000 + (onNum2-offNum2)*200

    totalRateList.append(totalRate)

totalRateList.sort(reverse=True)
print(totalRateList[0])