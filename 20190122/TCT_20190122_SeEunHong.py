#input
print("계단수를 입력하세요")
n=input()
steps=list()
n=int(n)
print("계단의 점수를 입력하세요")
for i in range(n):
    temp=input()
    steps.append(int(temp))


#마지막값은 필수로 추가

#첫번째 값은 필수 마지막값 필수
rst = steps[0]+steps[n-1]
temp1 =0
i=0
while(i<n-3):

    i=i+1
    #선택된 이후의 값 두개를 비교
    if(steps[i]<steps[i+1]) :
        rst = rst+steps[i+1]
        temp2 = i+1

    else :
        rst = rst+steps[i]
        temp2=i
    #연속으로 두개를 선택하면 그 이후값 제거

    i=temp2
    if (temp2 - temp1 == 1):
        i = i + 1

    temp1= i

print("총 점수의 최대값 : ", rst)






