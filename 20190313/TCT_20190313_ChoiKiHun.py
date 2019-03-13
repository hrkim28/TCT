makGeolLi1 = [702, 429]
makGeolLi2 = [427, 541, 774, 822]

def devide(n,k,makGeolLi) :
	sum = 0
	cnt = 0
	maxVal = 0
	
	for i in makGeolLi : 
		sum += i
		
	maxVal = sum//k
	
	while cnt != k :
		cnt = 0
		for i in makGeolLi :  
			cnt += i//maxVal
		if cnt != k :
			maxVal -= 1
	print(maxVal)

devide(2,3,makGeolLi1)
devide(4,11,makGeolLi2)

