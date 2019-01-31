#TCT_20190131_KimJinKwui.py

a = input()
inList = []
for i in range(int(a)):
    b = input()
    if (b,len(b)) not in inList:
        inList.append((b,len(b)))

for j in sorted(inList,key=lambda x:(x[1],x[0])):
    print(j[0])