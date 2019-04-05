# Create By LeeDongGeun

def repeatChar(inputCount, inputData):

    repeatVal = ''

    resultVal = ''.join([c * inputCount for c in inputData])
   
    return resultVal

#inputCount = 3
#inputData = 'CAT'
inputCount = 5
inputData = '/HTTP'

print(repeatChar(inputCount, inputData))
