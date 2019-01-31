import operator

sentence = {}

sentence['but'] = (3)
sentence['i'] = (1)
sentence['wont'] = (4)
sentence['hesitate'] = (8)
sentence['no'] = (2)
sentence['more'] = (4)
sentence['no'] = (2)
sentence['more'] = (4)
sentence['it'] = (2)
sentence['cannot'] = (6)
sentence['wait'] = (4)
sentence['im'] = (2)
sentence['yours'] = (5)

array = sorted(sentence.items(), key=operator.itemgetter(1))

tempDic = {}
for i in range(0, len(array)) :
	checkCnt = 1
	while array[i][1] == array[i+checkCnt][1] :
		tempDic[array[i][0]] = array[i][1]
		checkCnt++

		
# 나중에 이어서 작성해 보겠습니다.