#input
print("n : ", end = "")
n=input()
print("r : ", end = "")
r=input()
print("p : ", end = "")
p=input()

n = int(n)
r = list(r.split(' '))
p = list(p.split(' '))


for i in range(n) :
    p[i]=(int(p[i]))
    r[i] =(int(r[i]))


# 최대공약수 구하기
tmp1 = p[0]
for j in range(n-1):
    tmp2 = p[j+1]

    while (tmp2!= 0) :
        rst = tmp2 % tmp1
        if(rst == 0) : break
        tmp1 = tmp2
        tmp2 = rst

gcd = tmp1
#P와 r 비교

gcdList=r[:n]
for j in range(n):
#     print(j)
     gcdList[j]=int(gcdList[j]/gcd)




num = 1
t=1
while(t>0) :
    for j in range(n):
        r[j] = gcdList[j] * num

    for j in range(n):
        if(r[j] < p[j]) : break
        t=-1

    num=num+1

#추가 분

for j in range(n):
    r[j]=r[j]-p[j]
    if(r[j]<0) : r[j]=0


print(r)


