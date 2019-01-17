print("9보다 크고 3000보다 작은 수를 입력하시오 : ",end = '' )

n= input()
n=int(n)

result = n/3
result = int(result)

cnt = 1

cnt = (result-1)*(result-2)
cnt = cnt/2

cnt = int(cnt)

print("총 : ", cnt, "개 ")




