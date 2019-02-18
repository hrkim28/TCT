#TCT_20190218_KimJinKwui.py
def fibo_count(n):
    zero_count, one_count = 1, 0
    for jnx in range(n):
        zero_count, one_count = one_count, zero_count + one_count
    return str(zero_count) + " " + str(one_count)


test_count = int(input())
test_list = []
for inx in range(test_count):
    test_list.append(int(input()))
for inx, val in enumerate(test_list):
    print(fibo_count(val))
