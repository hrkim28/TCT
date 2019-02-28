memory = 5
#appointment = ['전지현', '손예진', '송혜교', '수지', '설현', '전지현', '손예진', '송혜교', '수진', '설현']
appointment = ['전지현', '손예진', '송혜교', '수지', '설현', '김하늘', '송혜교', '이나영', '한가인', '전지현', '수지', '이나영']

latest = []
risk = 0

for name in appointment :
	if len(latest) < memory :
		risk = risk + 5
		latest.append(name)
	else :
		if latest.count(name) < 1 :
			risk = risk + 5
			del latest[0]
		else :
			risk = risk + 1
			latest.remove(name)
		latest.append(name)

print(risk)