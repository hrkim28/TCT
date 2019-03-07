# TCT_20190307_KimJinKwui.py
def get_max_height(input_n, input_m, input_list):
    max_height = 0

    if sum(input_list) < input_m:
        return "나무의 최대 높이를 초과했습니다."

    while max_height < max(input_list):
        if sum(map(lambda a: max(a-max_height, 0), input_list)) == input_m:
            break
        max_height += 1

    if max_height == max(input_list):
        return "해당 높이는 구할 수 없습니다."

    return max_height


[n, m] = list(map(int, input().split(' ')))
n_list = list(map(int, input().split(' ')))

print(get_max_height(n, m, n_list))
