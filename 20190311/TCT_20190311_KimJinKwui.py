# TCT_20190311_KimJinKwui.py
def check_valid_str(input_str):
    check_dic = {"{": "}", "[": "]", "(": ")"}
    if len(input_str) % 2 != 0:
        return False

    for inx, val in enumerate(input_str):
        if val in check_dic.keys():
            if input_str[inx:].find(check_dic.get(val)) == -1:
                return False

    return True


input_list = ["{[()]}[{}]", "{[()]}[{}[", "{[()]}[{)]", "{[(]}[{}]"]
print("입력 : " + str(input_list))
print("결과 : " + str(list((check_valid_str(val) for inx, val in enumerate(input_list)))))

