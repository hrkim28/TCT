def to_java_var(str):
    str = str.title().replace('_', '')
    str = str[0].lower() + str[1:]

    return str

def to_cpp_var(str):
    lst = list(str)
    for idx in range(0, len(lst)) :
        if ord(lst[idx]) >= 65 and ord(lst[idx]) <= 90:
            lst[idx] = '_' + lst[idx].lower()
    result = ''.join(lst)
    return result


#input = 'long_and_mnemonic_identifier'
input = 'name'
input = 'jobLog'

if input.find('_') > -1:
    result = to_java_var(input)
else :
    result = to_cpp_var(input)


print("Result=", result)