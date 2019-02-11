
#inputVal = "BAPC"
#inputVal = "AABA"
inputVal = "ABCABCBBAAACC"
result = ""
temp = []
for i in inputVal:

    if i in temp:
        continue
    else:
        temp.append(i)
        if inputVal.count(i)%3 == 0:
            result = "FAKE"
            break
        else :
            result = "OK"

print(result);




