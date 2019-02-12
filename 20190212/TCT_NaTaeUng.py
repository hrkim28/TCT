def chkNum(number) :
    tempNum = str(number)
    for i in tempNum:
        if tempNum.count(i) > 1 :
            return False
    print(number)
    return True

print('•입력')
N = input()
number1 = int(N)
number2 = int(N)
print('•출력')
while True :
    if chkNum(number1) or chkNum(number2) :
        break
    number1 = number1 - 1
    number2 = number2 + 1




