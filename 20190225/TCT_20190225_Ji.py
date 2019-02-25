
#input_data = [2000, 3000]
input_data = [1000, 10000, 8000, 5000, 7000, 3000, 9000]
total_num = 0

while len(input_data) > 0:
    max_idx = 0
    max_n = input_data[0]
    for idx in range(0,len(input_data)):
        if max_n < input_data[idx] :
            max_idx = idx
            max_n = input_data[idx]
    total_num = total_num + max_n
    if len(input_data) <= 3:
        break
    if max_idx == len(input_data)-1:
        input_data.pop(max_idx)
        input_data.pop(max_idx - 1)
        input_data.pop(0)
    elif max_idx == 0:
        input_data.pop(len(input_data)-1)
        input_data.pop(1)
        input_data.pop(0)
    else:
        input_data.pop(max_idx + 1)
        input_data.pop(max_idx)
        input_data.pop(max_idx - 1)

print (total_num)
