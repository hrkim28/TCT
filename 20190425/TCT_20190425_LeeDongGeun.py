# Create by LeeDongGeun
import re

def checkAnagram(inputData):

    for firstAna, secondAna in inputData:

        # 영문자만 추출하여 Sorting 후 동일한지 비교
        firstVal = ''.join(re.findall('[a-z]', firstAna.lower()))
        secondVal = ''.join(re.findall('[a-z]', secondAna.lower()))

        if ''.join(sorted(firstVal)) == ''.join(sorted(secondVal)):
            print(True)
        else:
            print(False)

#inputData = [['The morse Code', 'Here come dots'],
#             ['TOM MARVOLO RIDDLE', 'I AM LORD VOLDEMORT'],
#             ['Elvis', 'Liesv'], ['Done!', 'O, end!']]
inputData = [["rail safety", "fairy talesE"],
             ["roast beef", "eat for BSE "],
             ["customerse", "store scum"], [" William Shakespeare ", "I am a weakish speller"],
             ["eleven plus two", "twelve plus one"],[" placebo ", " obecalp "]]

checkAnagram(inputData)