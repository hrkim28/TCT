zeroCnt = 0
oneCnt = 0

def fibonacci(n) :
	global zeroCnt
	global oneCnt
	if n==0 :
		zeroCnt = zeroCnt + 1
		return 0
	elif n==1 :
		oneCnt = oneCnt + 1
		return 1
	else :
		return fibonacci(n-1) + fibonacci(n-2)

def printFibonacci(n) :
	global zeroCnt
	global oneCnt
	fibonacci(n)
	print("%d %d" %(zeroCnt,oneCnt))
	zeroCnt = 0
	oneCnt = 0

printFibonacci(0)
printFibonacci(1)
printFibonacci(3)

