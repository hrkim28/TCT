# TCT_20190312_KimJinKwui.py
import math


def conv(number, base):
    T = "0123456789ABCDEF"
    i, j = divmod(number, base)

    if i == 0:
        return T[j]
    else:
        return conv(i, base) + T[j]


def make_combination(input_n, input_k):
    result_list = []

    max_cnt = int(math.pow(input_n, input_k))

    for i in range(max_cnt):
        result_list.append(conv(i, input_n).zfill(input_k))

    return result_list


result = make_combination(4, 4)
for val in result:
    print(val)
