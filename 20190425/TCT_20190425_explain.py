import re

def is_anagram(input_list):
    rtn_flag = False

    p = re.compile('[A-Z]+')

    first_str = "".join(p.findall(input_list[0].upper()))
    second_str = "".join(p.findall(input_list[1].upper()))

    if len(first_str) == len(second_str):
        if "".join(sorted(first_str)) == "".join(sorted(second_str)):
            rtn_flag = True

    return rtn_flag


p = re.compile('\'.*?\'')

find_list = p.findall("'The morse Code' , 'Here come dots'")
print(is_anagram(find_list))
find_list = p.findall("'TOM MARVOLO RIDDLE', 'I AM LORD VOLDEMORT'")
print(is_anagram(find_list))
find_list = p.findall("'Elvis', 'Liesv'")
print(is_anagram(find_list))
find_list = p.findall("'Done!', 'O, end!'")
print(is_anagram(find_list))
