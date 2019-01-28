number = int(input("input : "))

#n보다 작은 수 중에 소수 추출
prime_list=[]
for i in range(1,number+1):
    prime_count = 0
    for j in range(1, i + 1):
        if (i % j == 0):
            prime_count += 1
    if (prime_count == 2):
        prime_list.append(i)

#차이가 가장 적은 소수 조합 찾기
#j가 적을 수로 두 조합의 차이가 적음
for j in range(i//2):
    small=i//2 -j
    big=i//2+j
    if prime_list.count(small)!=0 and prime_list.count(big)!=0: #small, big이 소수 리스트에 둘다 존재하면 출력
        print ("output : ",small," ", big)
        break
