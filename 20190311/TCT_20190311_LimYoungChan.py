input = '{[()]}[{}]'  #true
#input = '{[()]}[{}['  #false
#input = '{[()]}[{)]'  #false
#input = '{[(]}[{}]'   #false
#input = '}])]'        #false

for i in range(0, len(input)):
    input = input.replace('()', '')
    input = input.replace('{}', '')
    input = input.replace('[]', '')

if len(input) == 0 :
    print("Result=true")
else :
    print("Result=false")

