input_num =30
result_count = 0

while input_num > 1 :
    if input_num%3 == 0 :
        input_num = input_num / 3
        result_count = result_count + 1
    elif input_num%3 == 1 :
        input_num = input_num - 1
        result_count = result_count + 1
    elif input_num%2 == 0 :
        input_num = input_num / 2
        result_count = result_count + 1
    elif input_num%3 == 2 :
        input_num = input_num - 1
        result_count = result_count + 1

    print("input_num : ", input_num, ", result_count : ",  result_count)

print("Calculate Count : ", result_count)

