# TCT_20190227_KimJinKwui.py
def get_max_set(input_n, input_s):
    output_list = []
    if input_s < input_n:
        output_list.append(-1)
    else:
        div_int = int(input_s / input_n)

        for inx in range(input_n):
            if inx + 1 == input_n:
                output_list.append(div_int + (input_s % input_n))
            else:
                output_list.append(div_int)

    return output_list


print(get_max_set(2, 9))
print(get_max_set(2, 1))
print(get_max_set(3, 13))
