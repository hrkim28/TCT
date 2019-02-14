#import random
#rVal = random.randint(0,1)

rowCheck = 0
colCheck = 0
row = 0
col = 0
cnt = 0

colList = [0,0,0,0]
#matrix = [(1,0,1,0),(0,0,0,0),(1,1,1,1),(0,1,0,1)]
matrix = [(1,0,1,0),(0,0,1,0),(1,1,1,1),(0,1,0,1)]
#matrix = [(1,0,1,0),(0,1,1,0),(1,1,1,1),(0,1,0,1)]

for (a, b, c, d) in matrix:
	cnt = cnt + 1
	rowSum = a + b + c + d
	if rowSum%2 != 0 :
		rowCheck = rowCheck + 1
		row = cnt
		
	colList[0] = colList[0] + a
	colList[1] = colList[1] + b
	colList[2] = colList[2] + c
	colList[3] = colList[3] + d
	
for i in range(len(colList)):
	if colList[i]%2 != 0 :
		colCheck = colCheck + 1
		col = i+1
	
if rowCheck > 1 or colCheck > 1 :
	print("Corrupt")
elif rowCheck == 1 and colCheck == 1 :
	print("Change bit(%d,%d)" %(row,col))
else :
	print("OK")
		
		
	



