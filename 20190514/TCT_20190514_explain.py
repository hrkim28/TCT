num = int(input())

inputMap = {};
if num < 1 or num > 20000:
    print('단어의 개수는 1부터 20000까지 입력 가능합니다.')
else:
    for inx in range(num):
        inputStr = str(input())
        inputMap[inputStr] = len(inputStr)

    for inx in sorted(inputMap.items(), key=lambda x: (x[1], x[0])):
        print(inx[0])

