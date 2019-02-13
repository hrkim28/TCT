#input
#num = input()
num = 30
cnt =0



while num != 1 :
    rmd = num % 3
    if rmd == 0 :
        cnt = cnt +1
        num = num//3
    else :
        cnt = cnt +rmd
        num = num-rmd

print(cnt)
