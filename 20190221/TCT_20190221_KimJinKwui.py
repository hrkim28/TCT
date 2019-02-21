# TCT_20190221_KimJinKwui.py
passenger_list = [[0,32,0,3],[3,13,1,0],[28,25,1,5],[39,0,6,0]]

cur_passenger_cnt = 0
cur_transfer_passenger_cnt = 0
max_price = 0
for inx, val in enumerate(passenger_list):
    cur_section_price = (cur_passenger_cnt-val[0]+val[1])*1000+(cur_transfer_passenger_cnt-val[2]+val[3])*200
    if cur_section_price > max_price:
        max_price = cur_section_price
    cur_passenger_cnt = cur_passenger_cnt - val[0] + val[1]
    cur_transfer_passenger_cnt = cur_transfer_passenger_cnt - val[2] + val[3]

print(max_price)
