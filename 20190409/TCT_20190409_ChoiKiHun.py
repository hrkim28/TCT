def primeDevide(e) :
	for i in range(e//2, 2, -1) :
		if isPrime(i) and isPrime(e-i) :
			print('Result : ', i, e-i)
			break

def isPrime(d) :
	for i in range(2, d-1):
		if d%i == 0 :
			return False
	return True

primeDevide(16)
primeDevide(50)