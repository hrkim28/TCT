def searchCap(makCnt, peopleCnt, makList):
    print("예제 출력")

    idx = makCnt-1
    tmp = peopleCnt // makCnt + peopleCnt % makCnt
    makList.sort()
    result = makList[idx] // tmp + 1
    sum = 0

    while sum != peopleCnt:
        sum = 0
        result -= 1

        for i in makList: sum += i//result
        if sum > peopleCnt :
            if tmp > peopleCnt // makCnt :
                result = makList[idx] // (tmp-1) + 1
            else:
                idx -= 1
                result = makList[idx] // tmp + 1
    print(result)



makCnt = 4
peopleCnt = 11
makList = [427, 541, 774, 822]

print("예제 입력")
print(makList)
searchCap(makCnt, peopleCnt, makList)



