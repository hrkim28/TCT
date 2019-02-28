#availableMemory = 3
#dateTarget =  ["전지현", "손예진", "송혜교", "수지", "설현", "전지현", "손예진", "송혜교", "수진", "설현"]

availableMemory = 3
dateTarget =  ["전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교", "전지현", "손예진", "송혜교"]

#availableMemory = 2
#dateTarget =  ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]

#availableMemory = 5
#dateTarget =  ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]

myMemory = []
riskPoint = 0


for i in dateTarget:

    if i in myMemory:
        riskPoint += 1
    else:
        riskPoint += 5

    if len(myMemory) >= availableMemory:
        del myMemory[0]

    myMemory.append(i)

print("위험도 : " + str(riskPoint))

