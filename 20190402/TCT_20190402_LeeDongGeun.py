# Creat by LeeDongGeun

def findCompletion(inputParticipant,inputCompletion):

    check = list(set(inputParticipant) - set(inputCompletion))

    if len(check) > 0:
        result = check
    else:
        result = findMultiple(inputParticipant)

    return result



#중복인원이 있는지 체크 함수
def findMultiple(inputData):

    for c in inputData:
        findCnt = inputData.count(c)
        if findCnt > 1:
            #한명만 중복이 될수 있으므로 중복이 발생되면 바로 중단함
           resultData = c
           break
        else:
            continue
    return resultData

#inputParticipant = ['leo', 'kiki', 'eden']
#inputCompletion = ['eden', 'kiki']
#inputParticipant = ['marina', 'josipa', 'nikola', 'vinko', 'filipa']
#inputCompletion = ['josipa', 'filipa', 'marina', 'nikola']
inputParticipant = ['mislav', 'stanko', 'mislav', 'ana']
inputCompletion = ['stanko', 'ana', 'mislav']

print(findCompletion(inputParticipant,inputCompletion))