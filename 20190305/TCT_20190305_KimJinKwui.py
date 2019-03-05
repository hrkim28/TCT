# TCT_20190305_KimJinKwui.py
import math


def get_multiple_numbers(input_param):
    rtn_list = [input_param - 1]

    while rtn_list[-1] > 0:
        if math.sqrt(rtn_list[-1]) % 1 == 0:
            rtn_list.append(int(math.sqrt(rtn_list[-1])))
        else:
            break

    rtn_list.sort(reverse=False)
    yield str(rtn_list)


input_number = int(input("진수 = "))
print(', '.join(get_multiple_numbers(input_number)))
