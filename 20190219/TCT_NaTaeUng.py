

print('•입력')
inputData1 = ['img12.png', 'img10.png', 'img02.png', 'img1.png', 'IMG01.GIF', 'img2.JPG']
#inputData1 = ['F-5 Freedom Fighter', 'B-50 Superfortress', 'A-10 Thunderbolt II', 'F-14 Tomcat']
print(inputData1)
numList1 = list()
numList2 = list()
tempList = list()
resultList =list()

for i in range(0,10):
    numList1.append(str(i))
    numList2.append(str(i+1))

for str in inputData1:
    idx = 0
    for i in range(len(str)):
        if str[i] in numList2:
            idx = i
            break
    for i in range(idx,len(str)):
        if not str[i] in numList1 :
            tempList.append([str[:idx].lower().split('0')[0], int(str[idx:i]), str])
            break

sortList = sorted(tempList, key=lambda x: (x[0],x[1]))

print('•출력')
for i,j,k in sortList:
    resultList.append(k)

print(resultList)







