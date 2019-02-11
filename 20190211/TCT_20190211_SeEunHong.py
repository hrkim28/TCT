#input
#testCase = input()
#testCase1 = 'BAPC'
#testCase2 = 'AABA'
#testCase3 = 'ABCABCBBAAACC'
testCase=['BAPC', 'AABA', 'ABCABCBBAAACC']

#판별 - 동일 문자가 3의 배수로 존재하면 FAKE
temp=[]
for i in range(len(testCase)) :
    temp.clear()
    rst = 'OK'
    for ch in testCase[i] :
        if(ch in temp) : continue
        else :
            temp.append(ch)
            cnt = testCase[i].count(ch)
            nam = cnt%3
            if nam == 0 :
                rst = 'FAKE'
                break
    #출력
    print(testCase[i],' : ', rst)