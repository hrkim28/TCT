# 아직 서툴고 미완성이지만 좀더 열심히..
def trnsVar(input_data):

    pcheck = ''
    cj_var = input_data[0]

    for i, char in enumerate(input_data[1:]):

        if input_data[i].islower() and char.isupper():
            cj_var += '_'
            pcheck = 'C'

        elif input_data[i] == '_':
             cj_var = (cj_var + input_data[i]).replace('_',' ')
             pcheck = 'JAVA'

        cj_var += char

    if pcheck == 'JAVA':
        cj_var = cj_var.title()
        cj_var = cj_var.replace('  ','')

    elif pcheck == 'C':
           cj_var = cj_var.lower()
           
    else:
           print('예외처리 로직은 좀더 보강이 필요합니다')

    return cj_var
          
input_data1 = 'long_and_mnemonic_identifier'
#input_data2 ='jobLog'

print(trnsVar(input_data1))
#print(trnsVar(input_data2))
