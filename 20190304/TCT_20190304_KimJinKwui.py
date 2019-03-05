# TCT_20190304_KimJinKwui.py
def get_min_count_char(input_word):
    add_char_list = []

    for inx in range(len(input_word)):
        if is_palindrome(input_word[inx:]):
            add_char_list = list(input_word[:inx])
            break

    return len(set(add_char_list)), set(add_char_list)


def is_palindrome(target_word):
    if target_word.lower().replace(' ', '') == target_word.lower().replace(' ', '')[::-1]:
        return True
    else:
        return False


word = input()
output_set = get_min_count_char(word)
output_result = word + ' 자체가 회문' if output_set[0] == 0 else '= ' + ', '.join(output_set[1])
print(str(output_set[0]) + ' ( ' + output_result + ')')

