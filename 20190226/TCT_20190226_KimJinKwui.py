# TCT_20190226_KimJinKwui.py
def get_change_pad_numbers(input_list):
    old_pad_numbers = {1: [], 2: ['a', 'b', 'c'], 3: ['d', 'e', 'f'], 4: ['g', 'h', 'i'], 5: ['j', 'k', 'l'],
                       6: ['m', 'n', 'o'], 7: ['p', 'q', 'r', 's'], 8: ['t', 'u', 'v'], 9: ['x', 'y', 'z']}
    new_pad_numbers = {}

    for inx, val in enumerate(input_list):
        new_pad_numbers[inx+1] = old_pad_numbers.pop(int(val))

    return new_pad_numbers

def get_str_numbers(pad_dic, input_str):
    output_number = ""
    pad_keys = pad_dic.keys()

    for char in input_str:
        for inx, key in enumerate(pad_keys):
            if char in pad_dic.get(key):
                if output_number[-1:] == str(key):
                    output_number += "#"
                output_number += (str(key)*(pad_dic.get(key).index(char)+1))

    return output_number


input_str = "2 3 4 5 6 7 8 9 1"
input_sentence = "klor"
str_list = input_str.split(" ")
change_pad_numbers = get_change_pad_numbers(str_list)
print(get_str_numbers(change_pad_numbers, input_sentence))

input_str = "7 8 9 1 2 3 6 5 4"
input_sentence = "djevojka"
str_list = input_str.split(" ")
change_pad_numbers = get_change_pad_numbers(str_list)
print(get_str_numbers(change_pad_numbers, input_sentence))

input_str = "9 8 7 6 5 4 3 2 1"
input_sentence = "skakavac"
str_list = input_str.split(" ")
change_pad_numbers = get_change_pad_numbers(str_list)
print(get_str_numbers(change_pad_numbers, input_sentence))
