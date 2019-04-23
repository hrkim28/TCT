# Create by LeeDongGeun
# 전체 역을 계산하여 가장 많은 금액으로 집계되는 역의 금액 산출

def subwayFee(inputData):

    sumFee = []
    var1 = 0; var2 = 0; var3 = 0; var4 = 0;

    for sta in inputData:
        #구간별 위치별 누적합을 구하는 더 좋은 방안은 뭘까? numpy : cumsum?
        var1 += sta[0]; var2 += sta[1]; var3 += sta[2]; var4 += sta[3]
        sumVal = (var2-var1)*1000 + (var4-var3)*200
        # 단기승차가 100 보다 크면 메세지 처리하고 종료
        if var2 > 100:
                return print('승차인원 100명이 초과되었습니다')
        else:
            sumFee.append(sumVal)
    maxVal = max(sumFee)
    print(maxVal)

inputData = [[0,32,0,3],[3,13,1,0],[28,25,1,5],[39,0,6,0]]
subwayFee(inputData)