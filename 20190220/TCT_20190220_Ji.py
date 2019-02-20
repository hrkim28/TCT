

input_data = [10, -4, 3, 1, 5, 6, -35, 12, 21, -1]
max_num = 0

for n in input_data:
    idx = input_data.index(n)
    for n2 in input_data[idx+1:]:
        if n + n2 > max_num :
            max_num = n + n2

print (max_num)
