# TCT_20190227_KimJinKwui.py
def get_max_set(input_n, input_s):
    output_list = []
    if input_s < input_n:
        output_list.append(-1)
    else:
        div_int = int(input_s / input_n)
        remain_int = input_s % input_n
        for inx in range(input_n):
            if remain_int > 0:
                output_list.append(div_int + 1)
            else:
                output_list.append(div_int)
            remain_int -= 1
    return sorted(output_list)


print(get_max_set(2, 9))
print(get_max_set(2, 1))
print(get_max_set(3, 13))
