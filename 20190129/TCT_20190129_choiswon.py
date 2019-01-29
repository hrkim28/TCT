# TCT_20190129_choiswon

inputData = "5+6*3-6/2+5"
inputList = inputData.replace("+", " + ").replace("-", " - ").replace("*", " * ").replace("/", " / ").split()

while len(inputList) > 1:
    multipleIndex = inputList.index("*") if inputList.count("*") > 0 else len(inputList)
    devideIndex = inputList.index("/") if inputList.count("/") > 0 else len(inputList)
    plusIndex = inputList.index("+") if inputList.count("+") > 0 else len(inputList)
    minusIndex = inputList.index("-") if inputList.count("-") > 0 else len(inputList)

    if multipleIndex < len(inputList) or devideIndex < len(inputList):
        if multipleIndex < devideIndex:
            calValue = int(inputList[multipleIndex - 1]) * int(inputList[multipleIndex + 1])
            del inputList[multipleIndex - 1:multipleIndex + 2]
            inputList.insert(multipleIndex - 1, str(calValue))
        else:
            calValue = int(inputList[devideIndex - 1]) // int(inputList[devideIndex + 1])
            del inputList[devideIndex - 1:devideIndex + 2]
            inputList.insert(devideIndex - 1, str(calValue))
    elif plusIndex < len(inputList) or minusIndex < len(inputList):
        if plusIndex < minusIndex:
            calValue = int(inputList[plusIndex - 1]) + int(inputList[plusIndex + 1])
            del inputList[plusIndex - 1:plusIndex + 2]
            inputList.insert(plusIndex - 1, str(calValue))
        else:
            calValue = int(inputList[minusIndex - 1]) - int(inputList[minusIndex + 1])
            del inputList[minusIndex - 1:minusIndex + 2]
            inputList.insert(minusIndex - 1, str(calValue))
    else:
        break

    print("".join(inputList))
