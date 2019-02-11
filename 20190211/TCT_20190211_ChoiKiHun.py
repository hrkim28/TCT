
compare = ''
index = 0
skip = False

crypt = input()
AABA

for i in crypt :
	if skip == False :
		compare += i
		
	skip = False
	cnt = compare.count(i)
	if cnt == 3 :
		if len(crypt) > index + 1 :
			if i != crypt[index+1] :
				print('FAKE')
				break
			else :
				compare = compare.replace(i,'')
				skip = True
		else :
			print('FAKE')
			break

	index += 1
	
if len(crypt) == index :
	print('OK')
	
