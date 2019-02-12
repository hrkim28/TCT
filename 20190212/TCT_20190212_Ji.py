# Ji
'''
[문제]
0부터 9까지의 숫자를 한 번만 사용하여 만든 숫자 중에 입력숫자(1≤ N ≤10,000,000,000)와 가장 차이가 적은 숫자를 출력한다.
답이 여러 개일 경우, 더 작은 숫자를 출력한다.

---------- 예 시 ----------
[입력1]
222
[출력1]
219

[입력2]
5000
[출력2]
5012

'''

def is_ok (num):
    str_num = str(num)

    for c in str_num[0:]:
        if str_num.count(c) > 1:
            return False
    print (num)
    return True


input_num = int(input())
num1 = input_num - 1
num2 = input_num + 1

while ((not is_ok(num1)) and (not is_ok(num2))):
    num1 = num1 - 1
    num2 = num2 + 1


