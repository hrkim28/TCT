#money = [2000, 3000]
#money  = [1000, 2000, 1000]
#money = [2000, 2000, 2000, 2000]
#money = [ 1000, 10000, 8000, 5000, 7000, 3000, 9000]
money = [0, 2, 4, 1, 3, 5]

len = len(money)

maxval = 0
prev = 0
prevprev = 0
last = 0


for i in range(0, len-1): #첫번째 값과 마지막 값은 더하면 안되므로 마지막 값은 제외
    maxval = money[i]

    if(i > 0) :
        maxval = max(maxval, prev)  # 현재 값과 이전까지의 누적값중 큰값
    if(i > 1) :
        maxval = max(maxval, prevprev + money[i])  # 위에서 취한값과 [현재값+이전이전누적값] 값중 큰값(이전값은 연속된 값이므로 더하면 안됨)

    last = max(last, maxval)
    prevprev = prev
    prev = maxval
    #여기까지는 0+4+3 = 7로 last=7
    

for i in range(1, len): #첫번째 값과 마지막 값은 더하면 안되므로 첫번째 값은 제외
    maxval = money[i]

    if (i > 1):
        maxval = max(maxval, prev)
    if (i > 2):
        maxval = max(maxval, prevprev + money[i])

    # 2, 4, 1, 3 까지 4가 최대값. 5가 더해지면 9가 최대값.
    #위에서 얻은 0+4+3=7 last=7 보다 4+5=9가 크므로 last=9가 최대값
    last = max(last, maxval)
    prevprev = prev
    prev = maxval

print(last)
