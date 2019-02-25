#input
# 예시1 = { 2000, 3000 }
# 예시2 = { 1000, 3000, 1000 }
# 예시3 = { 2000, 2000, 2000, 2000 }
# 예시4 = { 1000, 10000, 8000, 5000, 7000, 3000, 9000 }

moneyList = [1000, 10000, 8000, 5000, 7000, 3000, 9000 ]
total=0
i=0
containSecond = True
while i < len(moneyList)-1:
         if moneyList[i] >= moneyList[i + 1]:
             if i==0:
                 containSecond = False
             total = total + moneyList[i]
             i = i + 2
         else:
             total = total + moneyList[i + 1]
             i = i + 3
             if len(moneyList)%2==1 & len(moneyList) == i&containSecond:
                 total = total + moneyList[len(moneyList)-1]

print(containSecond)





print(total)