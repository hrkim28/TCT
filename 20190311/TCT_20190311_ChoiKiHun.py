parenList = ['(',')','{','}','[',']']

def parenValidation(parens) :
	cnt = 0
	for i in range(len(parenList)) :
		cnt = cnt + parens.count(parenList[i])
		if i>0 and i%2 == 0 :
			if cnt%2 == 1 :
				print("false")
				return
			cnt = 0
	print("true")

parenValidation("{[()]}[{}]")
parenValidation("{[()]}[{}[")
parenValidation("{[()]}[{)]")
parenValidation("{[(]}[{}]")
parenValidation("}])]")
