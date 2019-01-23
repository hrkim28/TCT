#n개의 정수
print("입력할 정수의 갯수를 입력 : ",end="")
n=input()
n=int(n)
print("숫자를 입력하시오 : ",end="")
numbers=input()
numbers = list(numbers.split(','))

for i in range(n) :
    numbers[i]=(int(numbers[i]))

cnt_dic={}
#입력이 홀수 인 것만 추출
for number in numbers :

    if number in cnt_dic.keys() :
        cnt_dic[number]=cnt_dic[number]+1
    else :
        cnt_dic[number] = 1

#추출된 수를 XOR 연산
result=0

for i in cnt_dic:

    if (cnt_dic[i] %2== 1 ):
        tmp=bin(i)
        tmp = tmp[2:]
        result = result^int(tmp)


#결과값 출력
result = str(result)

print("XOR 연산 결과 : ",int(result,2))
