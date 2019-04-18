#Create by LeeDongGeun
#코드를 효율적인 코딩 아이디어가 생각나지 않아 막짜 봅니다.^^
#시간을 두고 효율적인 코딩 방법을 고민 좀 해봐야겠네요...

def axisCount(dotCount, inputLocation):

    q1Count = 0
    q2Count = 0
    q3Count = 0
    q4Count = 0
    axisCount = 0

    for loc in inputLocation:
        if loc[0] > 0 and loc[1] > 0:
            q1Count += 1
        elif loc[0] > 0 and loc[1] < 0:
            q4Count += 1
        elif loc[0] < 0 and loc[1] < 0:
            q3Count += 1
        elif loc[0] < 0 and loc[1] > 0:
            q2Count += 1

    if q1Count > 0: axisCount += 1
    if q2Count > 0: axisCount += 1
    if q3Count > 0: axisCount += 1
    if q4Count > 0: axisCount += 1

    print('Q1: ', q1Count)
    print('Q2: ', q2Count)
    print('Q3: ', q3Count)
    print('Q4: ', q4Count)
    print('AXIS: ', axisCount)

axisCount(5, [(0,0),(0,1),(1,1),(3,-3),(2,2)])
