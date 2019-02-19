#TCT_20190219_KimJinKwui.py
import re

def sort_files(input_list):
    p = re.compile('[0-9]+')

    number_location_list = list(map(lambda x : p.search(x).span(), input_list))
    split_word_list = []
    output_list = []

    for inx, val in enumerate(input_list) :
        start_pos = number_location_list[inx][0]
        end_pos = number_location_list[inx][1]
        split_word_list.append([val[:start_pos], val[start_pos:end_pos], val[end_pos:]])

    split_word_list.sort(key=lambda x: (x[0].lower(), int(x[1])), reverse=False)

    for x, y, z in split_word_list:
        output_list.append(x + y + z)

    return output_list

input_files = ["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]
output_files = sort_files(input_files)
print("입력 : " + str(input_files))
print("출력 : " + str(output_files))

input_files = ["F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"]
output_files = sort_files(input_files)
print("입력 : " + str(input_files))
print("출력 : " + str(output_files))
