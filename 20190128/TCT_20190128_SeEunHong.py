#input

print("문장 입력")
sentence  =input()
sentence  = sentence.replace(' ','').lower()

inputList = list(sentence)
strList = list()
maxList = list()
max = 0


for i in inputList :
    #이전에 count 한 문자는 pass
    if i in strList : continue

    #문자 count
    cnt =  sentence.count(i)
    strList.append(i)

    if(cnt>max) :
        max = cnt
        maxList.clear()
        maxList.append(i)
    elif(cnt==max) :
        maxList.append(i)


#출력
print("가장 많이 쓰인 알파벳 : ", maxList," = ", max , " 회")
