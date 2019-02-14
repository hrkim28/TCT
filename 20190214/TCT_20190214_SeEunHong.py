
#input

# num = input()
# num = int(num)
num=4
# inputList = []
#
# for i in range (num) :
#     temp = input()
#     temp = temp.split()
#     inputList.append(temp)
#
# print(inputList)

inputList = [[1,1,1,1,], [1,1,0,0], [0,0,0,0], [1,0,1,1]]
temp=[]

reverseList = []

# for i in range(num):
#     reverseList.append(temp)
#     temp.clear()
#     for j in range(num):
#         temp.append( inputList[j][i] )
#
#         #reverselist[i].append( inputList[j][i] )
#     temp2 = temp
#     reverseList[i] = temp
#     print(reverseList[i])
#
# print(reverseList)

isOk=True

for i in range(len(inputList)) :

    for j in range(num):
        temp.append(inputList[j][i])
    inputStr = ''.join(str(inputList[i]))
    inputStr2 = ''.join(str(temp))
    cnt = inputStr.count('1')
    cnt2 = inputStr.count('1')


    if cnt%2!=0 or cnt2%2!=0 :
        isOk = False



if isOk:
    print('OK')
else:
    print('Corrupt')