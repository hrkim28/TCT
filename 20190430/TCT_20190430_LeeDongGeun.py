# Create By LeeDongGeun
# 주어진 숫자를 2진수로 변환 (bin) + 두 이진수 합집합 처리 (|) -->
# 결과 자릿수가 2진수 표현 보다 큰 경우 왼쪽부터 0 추가 (.zfill()) -->
# 1 --> '#' 처리, 0 --> 공백 처리 (replace)

def secretMap(inputArr, inputNumber):

    if inputArr < 1 or inputArr > 16:
        # 메세지 처리
        print("변의 길이를 확인하시기 바랍니다.")
        return
    elif inputArr != len(inputNumber[0]) or inputArr != len(inputNumber[1]):
        # 메세지 처리
        print("변의 길이와 배열의 길이가 다름니다.")
        return

    resultBinary = []
    for i in range(len(inputNumber)):
        for j in range(len(inputNumber[i])):
            if i == 0:
                binaryArr = str(bin(inputNumber[0][j] | inputNumber[1][j])[2:].zfill(inputArr)).replace('1', '#')
                binaryArr = binaryArr.replace('0', ' ')
                resultBinary.append(binaryArr)
            else:
                break

    return resultBinary


inputArr = 5
#inputArr = 6
inputNumber = [[9, 20, 28, 18, 11], [30, 1, 21, 17, 28]]
#inputNumber = [[46, 33, 33 ,22, 31, 50], [27 ,56, 19, 14, 14, 10]]
print(secretMap(inputArr, inputNumber))