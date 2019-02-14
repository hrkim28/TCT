
print('•입력')
N = input()
result = int(N)
print('•출력')
cnt = 0

while result != 1:
    if (result-1) % 3 == 0 :
        result = (result-1) / 3
        cnt = cnt + 1
    elif result % 3 == 0 :
        result = result / 3
    elif result % 2 == 0 :
        result = result / 2
    else :
        result = result - 1
    cnt = cnt+1

print(cnt)