def isPalindrome(str):
    return str == str[::-1]

def makePalindrome(str):
    if isPalindrome(str):
        print(len(addCharList))
    else:
        char = ""
        tmp = str[:len(str)-1]
        tmp = tmp[::-1]
        for j in tmp:
            addCharList.append(j)
            char=char+j
            if isPalindrome(inputStr+j):
                break;
    return list(set(addCharList)), char, len(list(set(addCharList)))

#inputStr = "madam"
#inputStr = "abab"
inputStr = "lalavla"
addCharList = []

print(makePalindrome(inputStr))






