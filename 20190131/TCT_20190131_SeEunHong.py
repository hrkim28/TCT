# input
import operator
T=13
strList = ['but','i','wont','hesitate','hesitate','no','more','no','more','it','cannot','wait','im','yours']

tmpList = list()

for i in range(T) :
    if [strList[i],len(strList[i])]not in tmpList:
        tmpList.append([strList[i],len(strList[i])])

sortList = sorted(tmpList,key=lambda x:(x[1],x[0]))

for item in sortList :
    print(item[0])

