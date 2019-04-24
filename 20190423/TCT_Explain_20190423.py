def retrunMaxCosst(inputData) :
    costList = []
    getOnSum = 0
    transferSum=0


    for getOff, getOn, transferOff, transferOn in inputData:

        getOnSum = getOnSum + getOn - getOff
        transferSum = transferSum +transferOn - transferOff

        cost = (getOnSum)*1000+(transferSum)*200
        costList.append(cost)

    return max(costList)

subwayRateList = [[0, 32, 0, 3],
                  [3, 13, 1, 0],
                  [28, 25, 1, 5],
                  [39, 0, 6, 0]]


print(retrunMaxCosst(subwayRateList))