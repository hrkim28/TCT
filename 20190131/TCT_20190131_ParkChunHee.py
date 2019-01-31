
def printSortedString():

    inputStringArray = ["but","i","wont","hesitate","no","more","no","more","it","cannot","wait","im","yours"]
    # 중복제거
    inputStringArray = list(set(inputStringArray))
    # 오름차순 정렬
    inputStringArray.sort()

    # 문자열 길이순으로 정렬
    for i in range(len(inputStringArray)-1):
        for j in range(len(inputStringArray)-1):
            if len(inputStringArray[j]) > len(inputStringArray[j+1]):
                inputStringArray[j],inputStringArray[j+1] = inputStringArray[j+1],inputStringArray[j]

    # 출력
    for k in inputStringArray:
        print(k)

printSortedString()

