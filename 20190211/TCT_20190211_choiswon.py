# TCT_201902211_choiswon

def decision(data) :
    returnValue = "OK"
    for i in range(0, len(data)):
        if data.count(data[i])%4 == 3:
            returnValue = "FAKE"
            break
    print(data + " -> " + returnValue)

decision("BAPC")
decision("AABA")
decision("ABCABCBBAAACC")



