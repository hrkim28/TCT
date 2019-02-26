def findNumberKey(keyDic, targetText):
    prevKey = ""
    resultStr = ""
    for j in targetText:
        for num, val in keyDic.items():
            if j in val:
                if prevKey == num:
                    resultStr+="#"
                for k in val:
                    resultStr+=str(num)
                    if k == j:
                        prevKey = num
                        break

    print(resultStr)

normalKey = {
    '1': [], '2': ["a","b","c"], '3': ["d","e","f"]
  , '4': ["g","h","i"], '5': ["j","k","l"], '6': ["m","n","o"]
  , '7': ["p","q","r","s"], '8': ["t","u","v"], '9': ["w","x","y","z"]
  , "#" : ["#"]
}

#inputArr = ["2","3","4","5","6","7","8","9","1"]
#targetText = "klor"

#inputArr = ["7","8","9","1","2","3","6","5","4"]
#targetText = "djevojka"

inputArr = ["9","8","7","6","5","4","3","2","1"]
targetText = "skakavac"

newKey ={}

for i in range(len(inputArr)):
    newKey[i+1] = normalKey[inputArr[i]]

findNumberKey(newKey,targetText)





