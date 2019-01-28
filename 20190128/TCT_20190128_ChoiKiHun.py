maxCount = 0
maxChar = ''

sentence = input()
I think I'm lost.I can't tell.

sentence = sentence.replace(' ','').lower()

for i in sentence :
	if i < 'a' or i > 'z' :
		sentence = sentence.replace(i, '')
		
		
for i in sentence :
	cnt = sentence.count(i)
	if cnt > maxCount :
		maxCount = cnt
		maxChar = i
	elif cnt == maxCount :
		if maxChar.count(i) < 1 :
			maxChar = maxChar + ',' + i

maxChar
maxCount

	
		
		