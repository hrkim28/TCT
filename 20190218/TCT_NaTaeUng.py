import sys

def fibonacci(n):
    if n == 0:
        global zeroCnt
        zeroCnt = zeroCnt + 1
        return 0
    elif n == 1:
        global oneCnt
        oneCnt = oneCnt + 1
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)

print('•입력')
inf = sys.stdin
T = int(inf.readline())
inputData = list()

for t in range(T):
    inputData.append(inf.readline().strip("\n"))

print('•출력')
for i in range(T):
    zeroCnt = 0
    oneCnt = 0
    fibonacci(int(inputData[i]))

    print("%d %d" %(zeroCnt,oneCnt))





