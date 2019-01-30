
lastYear = {1:500, 2:300, 3:200, 4:50, 5:30, 6:10}
thisYear = {1:512, 2:256, 4:128, 8:64, 16:32}

imagine = input()
13 16

stdGrade = 0
lastYearMoney = 0
thisYearMoney = 0

grade = imagine.split(' ')

for i in lastYear.keys() :
	stdGrade += i
	if(stdGrade >= int(grade[0])) :
		lastYearMoney = lastYear.get(i)
		stdGrade = 0
		break

for j in thisYear.keys() :
	stdGrade += j
	if(stdGrade >= int(grade[1])) :
		thisYearMoney = thisYear.get(j)
		break

print(lastYearMoney + thisYearMoney)
