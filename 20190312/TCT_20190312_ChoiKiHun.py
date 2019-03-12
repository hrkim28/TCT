combi1 = []
combination = []

def main() :
	makeCombination(4,4)
	for a in combination[0] :
		for b in combination[1] :
			print(a+b)

def makeCombination(n,k) :
	for i in range(0,n) :
		for j in range(0,n) :
			combi1.append(str(i)+str(j))
	combination.append(combi1)
	combination.append(combi1)

main()
