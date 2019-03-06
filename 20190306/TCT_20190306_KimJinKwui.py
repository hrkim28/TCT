# TCT_20190306_KimJinKwui.py
def check_identifier(input_param):
    language_type = ""

    is_uppercase_word = True in map(lambda l: l.isupper(), input_param)
    is_under_word = True in map(lambda l: l == '_', input_param)

    if (is_uppercase_word and is_under_word) or is_uppercase_word and input_param[0].isupper():
        raise ValueError("입력값이 잘못 되었습니다.")
    elif is_uppercase_word and input_param[0].islower():
        language_type = 'java'
    elif is_under_word:
        language_type = 'c++'

    return language_type


def transfer_identifier(input_lang_type, input_param):
    output_param = ""

    if input_lang_type == 'java':
        output_list = []
        pre_inx = 0
        for inx, ch in enumerate(input_param):
            if ch.isupper():
                output_list.append(input_param[pre_inx:inx].lower())
                pre_inx = inx

        if pre_inx != len(input_param):
            output_list.append(input_param[pre_inx:].lower())

        output_param = '_'.join(output_list)

    elif input_lang_type == 'c++':
        output_param = input_param.replace('_', ' ').title().replace(' ', '')[0].lower() + input_param.replace('_', ' ').title().replace(' ', '')[1:]

    return output_param


input_words = input()
lang_type = check_identifier(input_words)
print(transfer_identifier(lang_type, input_words))
