# 첫번째 점의 개수 확인
num = int(input())
Q1 = 0
Q2 = 0
Q3 = 0
Q4 = 0
AXIS = 0
# 점의 개수 범위 확인
if num < 1 or num > 1000:
    print('점의 개수는 1부터 1000까지 입력 가능합니다.')
else:
    # 점의 개수만큼 반복문으로 입력 좌표 확인 및 사분면 개수 할당
    for inx in range(num):
        X, Y = map(int, input().split())
        if X > 0 and Y > 0:
            Q1 += 1
        elif X > 0 and Y < 0:
            Q4 += 1
        elif X < 0 and Y > 0:
            Q2 += 1
        elif X < 0 and Y < 0:
            Q3 += 1
        else:
            AXIS += 1

# 결과 출력
print("Q1:", Q1)
print("Q2:", Q2)
print("Q3:", Q3)
print("Q4:", Q4)
print("AXIS:", AXIS)

