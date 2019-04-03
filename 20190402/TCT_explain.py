def findCompletion(inputParticipant,inputCompletion):
    #참가자 list Copy
    result = inputParticipant.copy()

    #참가자 list에서 참가자 명단에 완주자가 있을 경우, 완주자를 1명씩 제거
    [result.remove(i) for i in inputCompletion if i in inputParticipant]

    return result

print(findCompletion(['leo', 'kiki', 'eden'], ['eden', 'kiki']))
print(findCompletion(['marina', 'josipa', 'nikola', 'vinko', 'filipa'], ['josipa', 'filipa', 'marina', 'nikola']))
print(findCompletion(['mislav', 'stanko', 'mislav', 'ana'], ['stanko', 'ana', 'mislav']))