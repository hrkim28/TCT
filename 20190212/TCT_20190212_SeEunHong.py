#입력
#num=input()

num=5000
stop=True
itr=0
while True:

    itr = (abs(itr) + 1)
    if itr % 2 == 0: itr = itr * (-1)

    num = num + itr
    result = str(num)

    #중복 숫자 판별
    for i in result  :
        if result.count(i)>1 :
            stop = False
            break

    if stop: break
    else : stop = True

#output
print(result)
