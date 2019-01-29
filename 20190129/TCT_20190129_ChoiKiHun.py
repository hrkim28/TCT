
operator = []
question = input()
9+5-4+8

digit = question.replace('+',':').replace('-',':').replace('*',':').replace('/',':').split(':')

for i in range(0, len(digit)-1) :
	operator.append(question[question.find(digit[i]) + len(digit[i])])

operCombi = "".join(operator)

while operCombi.find('*') > 0 or operCombi.find('*') > 0 :
	if operCombi.find('*') > 0 and operCombi.find('/') > 0 :
		if operCombi.find('*') < operCombi.find('/') :
			current = operCombi.find('*')
		else :
			current = operCombi.find('/')
	else :
		if operCombi.find('*') > 0 :
			current = operCombi.find('*')
		else :
			current = operCombi.find('/')
	
	rVal = int(digit[current]) * int(digit[current+1])
	digit.pop(current)
	digit.pop(current)
	digit.insert(current, rVal)
	
	operCombi = operCombi[:current] + operCombi[current+1:]

operator = "|".join(operCombi).split("|")	
	
for i in operator :
	if i == '+' :
		digit.insert(0, int(digit.pop(0)) + int(digit.pop(0)))
	elif i == '-' :
		digit.insert(0, int(digit.pop(0)) - int(digit.pop(0)))
	elif i == '*' :
		digit.insert(0, int(digit.pop(0)) * int(digit.pop(0)))
	elif i == '/' :
		digit.insert(0, int(digit.pop(0)) / int(digit.pop(0)))	

# 처음에 컨셉을 잘못잡아서....중간결과식 과정 출력은 못하였습니다...ㅠ
	
	

