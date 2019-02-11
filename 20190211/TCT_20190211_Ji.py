# Ji

num_str = int(input())
str_list = []

for idx in range(0, num_str):
    str1 = str(input()).upper()
    str_list.append(str1)

for str1 in str_list:
    result = "OK"
    for c in str1[0:]:
        cnt = str1.count(c)
        if cnt >= 3 and cnt % 3 == 0:
            result = "FAKE" 
            break

    print (result)
