
def isPalindrome(param) :
    isPalindrome = False

    orgList = list(param)
    revList = orgList.copy()
    revList.reverse()

    if orgList == revList:
        return True
    else:
        return False



input = 'lalavla'
palinStr = input

result = ''

length = len(input)

for i in range(0, length-1):
    if (isPalindrome(palinStr)):
        break
    palinStr += input[length - i - 2]
    if result.find(input[length - i - 2]) < 0:
        result += input[length - i - 2]

print('Result=', len(result))
