#마지막 문제 이해도가 낮아 타인 프로그램을 참고하여 코딩 마무리 합니다.
#답이 잘못 출력되는 부분은 이후 보정 예정 입니다.

def findMax(n,k,alcoholVol):

    check = True
    cnt = 0
    maxVol = 0
    
    sumVol = sum(alcoholVol)
    maxVol = sumVol//k

    while check:

        maxCnt = 0

        for i in alcoholVol:

            cnt = i//maxVol
            maxCnt += cnt

            if maxCnt == k:
                check = False
                break
            else:
                maxVol -= 1

    print(maxVol)


findMax(2,3,[702,429])
findMax(4,11,[427,541,774,822])
