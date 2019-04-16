# Create by LeeDongGeun

def charCompression(inputData):

    for c in inputData:
        #chkData = sorted(list(set(c)))
        resultVal = ''
        resultVal = ''.join([reData + str(c.count(reData)) for reData in sorted(list(set(c)))])
        print(resultVal)

charCompression(['aaaaabbbccccccddddddddd','blahblah','dd222AAAAbdd11BBBB12dddd'])
