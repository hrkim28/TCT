def is_pal(p_char):
    return p_char == p_char[::-1]

p_input = input("문자 입력하세요 :")

if is_pal(p_input):
    print('예제결과 :',0)
else:
#    회문체크 및 만들기
    print('추가로직은 좀더 학습 후 도전해도록 하겠습니다.^^........')
