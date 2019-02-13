#input
#num = input()
num = 30
cnt =0



while num != 1 :
    rmd = num % 3
    if rmd == 0 :
        num = num//3
    elif rmd == 1 :
        num = num-rmd
    elif rmd == 2 :
        num = num//2

    cnt = cnt + 1

print(cnt)
