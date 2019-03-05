def getMultiNum(base) :
    numList = []

    for i in range(2,base//2+1,1) :
        if (base-1)//i == (base-1)/i :
            numList.append(i)

    numList.append(base - 1)

    return numList

#input
#print("진수 = ", end='')
#base = input()

#예시
base = 10
print("진수 = ", base)
print(getMultiNum(base), "\n")

base = 3
print("진수 = ", base)
print(getMultiNum(base), "\n")

base = 26
print("진수 = ", base)
print(getMultiNum(base), "\n")

base = 30
print("진수 = ", base)
print(getMultiNum(base), "\n")