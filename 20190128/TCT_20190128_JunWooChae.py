'''
strA= "I think I'm lost.I can't tell.";
'''
strB= "I think I'm lost. I can't tell what's where.";
strA = strB.lower();
inputList = {};
maxNum = 0;
maxChar = "";

for i in strA:
    if i.isalpha():
       if i in inputList:
           inputList[i] = inputList[i] + 1
       else:
           inputList[i] = 1

print(inputList)

for i in inputList.keys():
    if inputList[i] > maxNum:
        maxNum = inputList[i]
print(maxNum)

for i in inputList.keys():
    if inputList[i] == maxNum:
        if maxChar == "":
            maxChar = i
        else:
            maxChar = maxChar + "," + i

print("가장 많이 쓰인 알파벳은 : ", maxChar, " = " , maxNum)