import random

def iNeedTrees(n, m) :
	treeList = []
	totalHeight = 0
	for i in range(1, n+1) : 
		treeHeight = random.randint(1,1000000)
		treeList.append(treeHeight)
	
	treeList = [20,15,10,17]
	print(treeList)
		
	treeList.sort()
	maxHeight = treeList[-1]
	
	while totalHeight!=m and maxHeight>=0 :
		totalHeight = 0
		maxHeight = maxHeight - 1
		for t in treeList :
			if t - maxHeight > 0 :
				totalHeight =  totalHeight + int(t - maxHeight)
				
	if maxHeight >= 0 :
		print(maxHeight)
	else :
		print("I cannot find trees.")

iNeedTrees(4,7)
