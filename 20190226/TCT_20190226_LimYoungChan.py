keyNum = [1, 2, 3, 4, 5, 6, 7, 8, 9];

keyChar = ((),
           ('a','b','c'),
           ('d','e','f'),
           ('g','h','i'),
           ('j','k','l'),
           ('m','n','o'),
           ('p','q','r','s'),
           ('t','u','v'),
           ('w','x','y','z'))

#newNum = [2, 3, 4, 5, 6, 7, 8, 9, 1]
#input = "klor"          # 출력: 44#444555666
#newNum = [7, 8, 9, 1, 2, 3, 6, 5, 4]
#input = "djevojka"    # 출력: 68662227778#885
newNum = [9, 8, 7, 6, 5, 4, 3, 2, 1];
input = "skakavac"    # 출력: 33335585582228#888

chars = list(input)

isMatched = False
prevIndex = 0
result = ''

for c in range(len(chars)) :
    for i in range(len(keyChar)) :
        for j in range(len(keyChar[i])) :

            if chars[c] == keyChar[i][j] :             #입력문자에 대응하는 원래의 key i, j index값 찾기

                for k in range(len(newNum)) :          #newNum의 index값 구하기

                    if newNum[k] == i+1 :              #newNum의 값이 문자에 대응하는 keyPad의 값과 같다면
                        if i == prevIndex :
                            result += '#'              #이전 문자의 i index값과 동일하면 #을 붙임.

                        for n in range(j+1) :
                            result += str(keyNum[k])

                        isMatched = True
                        break

                prevIndex = i
                if isMatched :
                    break


        if isMatched :
            break
    isMatched = False

print( input , " : Result = ", result)