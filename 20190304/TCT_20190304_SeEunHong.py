def isPalindrome (inputString) :
    listString = list(inputString)
    listString.reverse()
    reverseString = "".join(listString)

    num = 0
    idx=0
    addString = []
    if inputString!= reverseString :

        listString = list(inputString)
        while(len(listString)//2!=idx):

            if listString[idx] !=listString[len(listString)-1-idx] :
                addString.append(listString[idx])
                listString.insert(len(listString)-idx-1, listString[idx] )
            idx += 1

    Palindrome = ''.join(listString)
    addString=list(set(addString))
    num=len(addString)

    return  num, addString , Palindrome



print(isPalindrome ("MDM"))
print(isPalindrome ("abab"))
print(isPalindrome ("lalavla"))
