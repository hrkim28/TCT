def decrypt_map(mapSize, map1, map2) :
    #1. 2진수 변환 시 지도의 한변의 크기를 맞춰지기 위한 format 설정
    strFormat = "%" + str(mapSize) + "s"
    #2. arr1과 arr2의 비밀지도 해독(arr1과 arr2를 2진수 변환 하여 각각 or 연산 진행)
    resultMap = list((strFormat %str(bin(i | v ))[2:].replace('1','#').replace('0',' ')) for i,v in zip(map1, map2))
    return resultMap

n =  6
arr1 = [46, 33, 33 ,22, 31, 50]
arr2 = [27 ,56, 19, 14, 14, 10]

print('n : ', n)
print('arr1 : ', arr1)
print('arr2 : ', arr2)
print('출력 : ', decrypt_map(n, arr1, arr2))