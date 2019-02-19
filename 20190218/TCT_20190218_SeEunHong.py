ouputList={0:0, 1:0}

def fibo(num) :
    if num == 0 :
        ouputList[0]=ouputList[0]+1
        return True
    elif num == 1 :
        ouputList[1] = ouputList[1] + 1
        return True

    else :
        return fibo(num-1)+fibo(num-2)

#input
T=3
numList = [0,1,3]
#ouput
for i in range(T) :
    fibo(numList[i])
    print(ouputList[0], ouputList[1])
    ouputList[0]=0
    ouputList[1]=0





