volumeArr1 = [702,429]
volumeArr2 = [427,541,774,822]

def findMaxVolume(personCnt, volumeArr):
    for i in reversed(range(min(volumeArr))):
        tmpCnt = 0
        for j in volumeArr:
            tmpCnt += j//(i+1)

            if personCnt == tmpCnt:
                return i+1

print(findMaxVolume(3, volumeArr1))
print(findMaxVolume(11, volumeArr2))