import re

inputListA = ['img12.png', 'img10.png', 'img02.png', 'img1.png', 'IMG01.GIF', 'img2.JPG']
inputListB = ['F-5 Freedom Fighter', 'B-50 Superfortress', 'A-10 Thunderbolt II', 'F-14 Tomcat']

def inputSorting(inputList):
    for inx in range(len(inputList)):
        for jnx in range(len(inputList) -inx -1):
            numListA = re.findall("[0-9]+", inputList[jnx])
            indexA = int(numListA[0])
            compA = inputList[jnx][:inputList[jnx].find(numListA[0])].lower()
            numListB = re.findall("[0-9]+", inputList[jnx+1])
            indexB = int(numListB[0])
            compB= inputList[jnx+1][:inputList[jnx+1].find(numListB[0])].lower()
            if(compA > compB):
               inputList[jnx],inputList[jnx+1] = inputList[jnx+1],inputList[jnx]
            elif(compA == compB):
                if(indexA > indexB):
                    inputList[jnx], inputList[jnx +1] = inputList[jnx+1], inputList[jnx]
    return inputList

print(inputSorting(inputListA))
print(inputSorting(inputListB))

