case1 = '''I think I'm lost.'''
case2 = '''I think I'm lost.I can't tell.'''
case3 = '''I think I'm lost. I can't tell what's where'''
print('입력')
print('[case1]')
print(case1)
print('[case2]')
print(case2)
print('[case3]')
print(case3)

print('\n\n출력')
alpa = {'a':0,'b':0,'c':0,'d':0,'e':0,'f':0,'g':0,'h':0,'i':0,'j':0,'k':0,'l':0,'m':0,
        'n':0,'o':0,'p':0,'q':0,'r':0,'s':0,'t':0,'u':0,'v':0,'w':0,'x':0,'y':0,'z':0}
testCase = {'case1':case1, 'case2':case2, 'case3':case3}
for i in testCase:
    maxCnt = 0
    maxAlpa = list()
    temp = testCase[i].lower()
    print('['+i+']')
    for j in alpa:
        alpa[j]=temp.count(j)
        if(maxCnt < alpa[j]) :
            maxCnt = alpa[j]
    for k in alpa :
        if (maxCnt == alpa[k]):
            maxAlpa.append(k)
    print("가장 많이 쓰인 알파벳 : %s", maxAlpa, " = ", maxCnt, " 회")





