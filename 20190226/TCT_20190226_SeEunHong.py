strList = [[],
           ['a', 'b', 'c' ],
           ['d', 'e', 'f'],
           ['g', 'h', 'i'],
           ['j', 'k', 'l' ],
           ['m', 'n', 'o'],
           ['p', 'q', 'r', 's'],
           ['t', 'u', 'v'],
           ['w', 'x', 'y', 'z'],
           ]

errorList = []

#input
#numList =[2, 3, 4, 5, 6, 7, 8, 9, 1]
#word='klor'
#numList =[7, 8, 9, 1, 2, 3, 6, 5, 4]
#word='djevojka'
numList =[9, 8, 7, 6, 5, 4, 3, 2, 1]
word='skakavac'

#번호바뀜
for i in range(len(numList)):
    #errorList.insert(numList[i]-1, strList[i])
    errorList.append(strList[numList[i]-1])
preindex=0
result = ''
for j in word :
    for k in range(len(errorList)):
        if(j in errorList[k]):
            for x in range(errorList[k].index(j)+1) :
                result=result +str(k+1)

            #if (preindex == k + 1):
            #    result = result + '#'

            break


print(result)