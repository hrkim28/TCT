sum = 0
gap = 0
stdDigit = 0
bestSet = []

#n = 2
#s = 9
#n = 2
#s = 1
n = 3
s = 13

stdDigit = int(s/n)

if stdDigit < 1 :
	print("[-1]")
else :
	for i in range(n) :
		bestSet.append(stdDigit)
	for j in bestSet :
		sum = sum + j
	gap = s - sum
	del bestSet[n-1]
	bestSet.append(stdDigit + gap)
	print(bestSet)

