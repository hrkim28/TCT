
digit = 30
count = 0

while digit > 1 :
	if digit % 3 != 0 :
		if (digit - 1) % 3 == 0 :
			digit = digit - 1
			count = count + 1
			digit = digit / 3
			count = count + 1
			continue
			
	if digit % 3 == 0 :
		digit = digit / 3
	elif digit % 2 == 0 :
		digit = digit / 2
	else :
		digit = digit - 1
		
	count = count + 1
		
print(count)
