inputArray = [10, -4, 3, 1, 5, 6, -35, 12, 21, -1]

maxVal = 0

for i in range(len(inputArray)-1):
    if inputArray[i] + inputArray[i+1] > maxVal:
        maxVal = inputArray[i] + inputArray[i+1]

print(maxVal)