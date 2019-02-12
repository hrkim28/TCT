def noDupNumber(num):
    intA = num
    intB = num
    addA = 0
    addB = 0

    intMap = {}
    isDup = False

    while intA:
        intMap = {}
        for inx in str(intA):
            if inx in intMap:
                isDup = True
                break
            else:
                isDup = False
                intMap[inx] = 1

        if isDup:
            intA = intA + 1
            addA = addA + 1
        else:
            break

    while intB:
        intMap = {}
        for inx in str(intB):
            if inx in intMap:
                isDup = True
                break
            else:
                isDup = False
                intMap[inx] = 1

        if isDup:
            intB = intB - 1
            addB = addB + 1
        else:
            break

    if addA < addB:
        print(intA)
    else:
        print(intB)

noDupNumber(222)
noDupNumber(5000)