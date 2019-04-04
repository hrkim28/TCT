# Create By LeeDongGeun

def repeatChar(inputCount, inputData):

    repeatVal = ''

    resultVal = ''.join([repeatVal + c for c in inputData for i in range(inputCount)])
   
    return resultVal

#inputCount = 3
#inputData = 'CAT'
inputCount = 5
inputData = '/HTTP'

print(repeatChar(inputCount, inputData))
