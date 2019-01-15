def fibo(num):
    if num==1 or num==2 :
        return 1
    elif num==0:
        return 0
    else :
        return fibo(num-1)+fibo(num-2)

print("n = ", end='')
inputStr = input()
inputNum = int(inputStr)

print(fibo(0), end='')
i=1
while(True):
    if(fibo(i)>inputNum) : break
    else   : print(', ',  end='')
    print(fibo(i), end='')
    i=i+1



