inputval = int(input())
listval = list()
for i in range(0, inputval):
    listval.append(input())

for str in listval:
    num = int(str.split(" ")[0])
    strval = str.split(" ")[1]
    result = ""
    for ch in strval:
        result += ch * num
    print(result)