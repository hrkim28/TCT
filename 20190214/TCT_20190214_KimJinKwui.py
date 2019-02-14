#TCT_20190214_KimJinKwui.py
def validate_parity(in_parity_matrix):
    sum = 0
    fail_count = 0
    fail_row_list = []
    fail_col_list = []

    for inx, row_matrix in enumerate(in_parity_matrix):
        sum = 0
        for value in row_matrix:
            sum += int(value)
        if sum % 2 != 0:
            fail_row_list.append(inx)
            fail_count += 1

    for inx, row_matrix in enumerate(in_parity_matrix):
        sum = 0
        for jnx, row_matrix_second in enumerate(in_parity_matrix):
            sum += int(row_matrix_second[inx])
        if sum % 2 != 0:
            fail_col_list.append(inx)
            fail_count += 1

    if fail_count == 0:
        return "OK"
    elif len(fail_row_list) == 1 and len(fail_col_list) == 1:
        return "Change bit (" + str(fail_row_list[0]+1) + "," + str(fail_col_list[0]+1) + ")"
    else:
        return "Corrupt"


input_matrix_num = int(input())
input_matrix = []
for i in range(input_matrix_num):
    input_matrix.append(list(input().split(" ")))

print(validate_parity(input_matrix))