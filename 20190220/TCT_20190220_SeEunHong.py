#input
# print("수열 갯수를 입력하세요")
# T=input()
# print("수열 갯수를 입력하세요")
# numList = []
# for i in range(T)  :
#     num=input()
#     numList.append(num)

T=10
numList = [10, -4, 3, 1, 5, 6, -35, 12, 21, -1]

sumNum= 0
maxNum =0
for i in range(T):
    if(numList[i]>0) :
        sumNum = sumNum + numList[i]
    else :
        if(sumNum>maxNum) :
            maxNum=sumNum
            sumNum=0

print(maxNum)
