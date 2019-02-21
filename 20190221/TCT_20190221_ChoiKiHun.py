
maxCost = 0
onePass = 0
transfer = 0

costMatrix = [(0,32,0,3),(3,13,1,0),(28,25,1,5),(39,0,6,0)]

for (a, b, c, d) in costMatrix :
	cost = 0
	onePass = onePass + (b-a)
	transfer = transfer + (d-c)
	
	cost = cost + (onePass*1000)
	cost = cost + (transfer*200)
	
	if cost >= maxCost :
		maxCost = cost

print(maxCost)