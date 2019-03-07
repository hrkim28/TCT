
treeArr = [20,15,10,17]
targetSize = 7
maxSize = 0

for i in reversed(range(max(treeArr))):
    tmpSize = 0
    for j in treeArr:
        if j >= i+1:
            tmpSize = tmpSize + j-(i+1)
    if(tmpSize == targetSize):
        maxSize = i+1
        break


print(maxSize)