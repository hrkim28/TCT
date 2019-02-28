def getRisK(memory, userList) :
    totalRisk = 0

    for inx in range(len(userList)):
        num = inx - memory
        if inx < memory : num = 0
        memoryList = userList[num:inx]
        if userList[inx] in memoryList : totalRisk=totalRisk+1
        else : totalRisk=totalRisk+5


    return totalRisk

memory = 3
userList =  ["전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"]
print(getRisK(memory, userList))
memory = 3
userList =   ["전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"]
print(getRisK(memory, userList))
memory = 2
userList =    ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]
print(getRisK(memory, userList))
memory = 5
userList = ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]
print(getRisK(memory, userList))