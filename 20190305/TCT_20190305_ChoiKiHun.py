nDecimal = 30
share = 0
remainder = 0

for i in range(nDecimal-1, 1, -1) :
	cnt = 2
	check = 0
	
	while(check < nDecimal) :
		check = i * cnt
		cnt = cnt + 1
		
	share = int(check / nDecimal)
	remainder = check % nDecimal
		
	if (share + remainder) % i == 0 :
		print(i, end=',')