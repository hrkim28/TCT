first = {1:5000000, 2:3000000, 3:2000000, 4:500000, 5:300000, 6:100000}
second = {1:5120000, 2:2560000, 4:1280000, 8:640000, 16:320000}

imagine = input("a와 b를 공백 하나를 사이에 두고 입력하세요.\n")

accumlate = 0
prize = 0

grade = imagine.split(' ')

for i in first.keys() :
	accumlate += i
	if(accumlate >= int(grade[0])) :
		prize += first.get(i)
		accumlate = 0
		break

for j in second.keys() :
	accumlate += j
	if(accumlate >= int(grade[1])) :
		prize += second.get(j)
		break

print(prize)