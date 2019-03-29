#TCT_20190328_explain.py

def validSMTP(inputParam):
    # set 함수를 이용하여 inputParam의 중복 제거한 문자를 추출
    for findChar in set(inputParam):  
        # 4의 나머지가 3개만 있을 경우엔 FAKE 처리
        # (3개마다 하나씩 추가 되므로 4개를 한 세트로 생각하여 나눠서 3개가 남았을 경우 정상 처리가 되지 않았으므로 FAKE)
        if inputParam.count(findChar) % 4 == 3:  
            return "FAKE"
        # 3개 이상일 경우 제대로 3개마다 하나씩 추가가 잘 되었는지 판별
        elif inputParam.count(findChar) > 3:  
            # 이전 index 를 저장하기 위해 변수 선언
            preIndex = 0  
            # 찾는 문자 만큼 for 문 수행. 이때, index 로 찾기 편하기 위해 start 를 1로 선언하고 갯수를 +1 해줌
            for i in range(1, inputParam.count(findChar)+1):  
                # index 함수를 사용하여 이전 index 부터 탐색하여 문자열 위치를 curIndex 에 담기
                curIndex = inputParam[preIndex:].find(findChar)  
                # 3번째마다 하나씩 추가하기 때문에 4번째가 제대로 들어가 있는지 체크
                if i % 4  == 0:  
                    # 이전 index 와 현재 index 를 비교하여 다를 경우 FAKE
                    if preIndex != (curIndex + preIndex):  
                        return "FAKE"
                # preIndex 를 탐색할 때 index 위치 변경을 위해 +1 처리
                preIndex = curIndex + preIndex + 1  

    return "OK"


print(validSMTP("BAPC"))
print(validSMTP("AABABA"))
print(validSMTP("ABCABCBBAAACC"))
print(validSMTP("HELLOTHEREEWELLLBEFINEE"))
