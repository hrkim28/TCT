import random

digitList = []
#digitList = [10, -4, 3, 1, 5, 6, -35, 12, 21, -1]

sum = 0
maxSum = 0

n = input()
10

n = int(n)
for i in range(1, n): 
	rVal = random.randint(-1000,1000)
	digitList.append(rVal) 

for i in digitList :
	if i < 0 :
		if sum >= maxSum :
			maxSum = sum
			sum = 0
	else :
		sum = sum + i

print(maxSum)
		
