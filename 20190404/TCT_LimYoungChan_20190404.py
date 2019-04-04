def repeat_char(param_str):
    result = ""
    alphanumeric = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./:"

    rpt_num = param_str[0:param_str.find(" ")]
    wrk_str = param_str[param_str.find(" ")+1:]

    if(rpt_num.isdigit() == False):
        return "첫자리 반복 횟수 입력 부분에 숫자를 입력하세요"
    else:
        rpt_num = int(rpt_num)

    for char in wrk_str:
        if alphanumeric.find(char) > -1:
            result += char * rpt_num

    return result


num  = input('number : ')
if num.isdigit() == False:
    print("첫번째 줄에는 숫자를 입력하세요.")
    exit(0)

num = int(num)
input_list = list()

for i in range (0, num):
    input_list.append(input())

for str in input_list:
    result = repeat_char(str)
    print(result)


