#TCT_20190220_KimJinKwui.py
def get_max_combination(input_list):
    max_sum = 0
    for inx, val in enumerate(input_list):
        cal_sum = int(val)
        for jnx in range(inx + 1, len(input_list)):
            cal_sum += int(input_list[jnx])
            if max_sum < cal_sum:
                max_sum = cal_sum

    return max_sum


number_count = int(input())
numbers = input()

print(get_max_combination(numbers.split(" ")))
