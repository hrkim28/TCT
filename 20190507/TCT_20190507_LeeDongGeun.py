# Create By LeeDongGeun

def codeMonster(input_cnt, input_data):
    # 가정 횟수에 대한 범위 정의 및 가정 횟수와 가정등수의 건수는 같아야 함
    if input_cnt < 1 or input_cnt > 1000:
        print('입력된 가정 횟수가 잘못되었습니다. 재입력 바랍니다.')
        return
    else:
        if input_cnt != len(input_data):
            print('가정 횟수와 입력된 가정등수의 건수가 일치 하지 않습니다. 재입력 바랍니다.')
            return

    # 입력된 가정 등수의 범위 체크
    for rank_a, rank_b in input_data:
        if rank_a < 0 or rank_a > 100:
            print('입력된 a 등수의 범위가 잘못되었습니다. 재입력 바랍니다.')
            return

        if rank_b < 0 or rank_b > 64:
            print('입력된 b 등수의 범위가 잘못되었습니다. 재입력 바랍니다.')
            return

        sum_mony = calculationPrizeMony(rank_a, rank_b)
        print(sum_mony)


def calculationPrizeMony(rank_a, rank_b):
    # 등수별 상금 및 인원 설정
    reward_a = [(5000000, 1), (3000000, 2), (2000000, 3), (500000, 4), (300000, 5), (100000, 6)]
    reward_b = [(5120000, 1), (2560000, 2), (1280000, 4), (640000, 8), (320000, 16)]

    sum_cnt =  0
    # 누적인원 수를 가정등수와 비교하여 금액을 추출함(a)
    for i in range(len(reward_a)):
        sum_cnt += reward_a[i][1]
        if sum_cnt == rank_a:
            mony_a = reward_a[i][0]
            break
        elif sum_cnt > rank_a:
            mony_a = reward_a[i][0]
            break

    sum_cnt =  0
    # 누적인원 수를 가정등수와 비교하여 금액을 추출함(b)
    for i in range(len(reward_b)):
        sum_cnt += reward_b[i][1]
        if sum_cnt == rank_b:
            mony_b = reward_b[i][0]
            break
        elif sum_cnt > rank_b:
            mony_b = reward_b[i][0]
            break

    return mony_a + mony_b


a = 6
b = [(8, 4), (13, 19), (8, 10), (18, 18), (8, 25), (13, 16)]
codeMonster(a, b)