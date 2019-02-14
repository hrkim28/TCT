import numpy as np

#data = [[1,0,1,0],[0,0,0,0],[1,1,1,1],[0,1,0,1]]
data = [[1,0,1,0],[0,0,1,0],[1,1,1,1],[0,1,0,1]]
data = np.array(data)

hSum = np.sum(data,1)
vSum = np.sum(data,0)

cnt = 0
for i in hSum:
    if i%2 != 0:
        cnt+=1
for j in vSum:
    if j%2 != 0:
        cnt+=1

# 시간이 없어 Change bit 까진 못해보겠네요
if cnt == 0:
    print("OK")
else:
    print("Corrupt")

















