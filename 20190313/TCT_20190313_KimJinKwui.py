# TCT_20190313_KimJinKwui.py
def get_max_liter(input_n, input_k, input_list):
    if input_n > input_k:
        return False

    max_liter = sum(input_list) // input_k

    cnt = 0
    while True:
        for inx, val in enumerate(input_list):
            cnt += (val // max_liter)

        if cnt == input_k:
            break
        else:
            cnt = 0
            max_liter -= 1

    return max_liter


print(get_max_liter(2, 3, [702, 429]))
print(get_max_liter(4, 11, [427, 541, 774, 822]))
