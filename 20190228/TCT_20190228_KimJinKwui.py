# TCT_20190228_KimJinKwui.py
def get_risk_size(input_memory_size, input_meeting_list):
    risk_size = 0

    for inx, val in enumerate(input_meeting_list):
        if val in input_meeting_list[-input_memory_size+inx:inx]:
            risk_size += 1
        else:
            risk_size += 5

    return risk_size


memory_size = int(input())
meeting_list = ["전지현", "손예진", "송혜교", "수지", "설현", "김하늘", "송혜교", "이나영", "한가인", "전지현", "수지", "이나영"]

print("위험도 : " + str(get_risk_size(memory_size, meeting_list)))
