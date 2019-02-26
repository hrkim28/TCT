cnt = 0
output = 0
before = 0
phone = {'1':'', '2':'abc', '3':'def', '4':'ghi', '5':'jkl', '6':'mno', '7':'pqrs', '8':'tuv', '9':'wxyz'}

#234567891
#789123654
digit = input()
987654321

#klor
#djevojka
message = input()
skakavac

for i in range(len(message)) :
	cnt = 0
	for j in phone.keys():
		cnt = phone[j].find(message[i])+1
		if cnt > 0 :
			output = digit.find(j)+1
			break
	if output == before :
			print('#', end='')
	for k in range(cnt) :
		print(str(output), end='')
		before = output