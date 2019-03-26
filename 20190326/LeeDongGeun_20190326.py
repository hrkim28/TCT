def calFibonacci(inputData):

    iniData = [0,1]

    while True:

          sumData = iniData[-1] + iniData[-2]

          if sumData <= inputData:

              iniData.append(sumData)

          else:

              break 


    print(iniData)

#iniData = 1
#iniData = 100
iniData = 500000

calFibonacci(iniData)
    
