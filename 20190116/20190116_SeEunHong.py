print("작업량과 퇴근시간까지 남은 시간을 입력하시오")
print("작업량 work : ",end='')
works = input()
print("남은시간 n : ",end='')
n=input()

works = list(works.split(','))
number = int(n)
temp=list()

totalWork = 0
for k in range(len(works)) :
    temp.append(int(works[k]))
    totalWork = totalWork + int(works[k])

if(totalWork<=number) :
    print("작업지수 : ", 0)

else :
    for i in range(number) :
        temp.sort(reverse=True)
        temp[0]=int(temp[0])-1

    worksNumber = 0
    for j in range(len(temp)) :
        worksNumber = worksNumber + temp[j]*temp[j]

    print("작업지수 : ", worksNumber)

