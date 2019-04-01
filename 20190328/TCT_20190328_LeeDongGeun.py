def checkPassword(inputData):

    alpha = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    for c in alpha:
        
        if inputData.count(c) != 0:
            if inputData.count(c)%3 != 0:
                checkVal = True
            else:
                checkVal = False
                break
        else:
            continue

    print(checkVal)


#inputData = 'BAPC'
#inputData = 'AABA'
inputData = 'ABCABCBBAAACC'

checkPassword(inputData)

