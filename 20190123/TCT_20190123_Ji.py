
num = int(input ("N = "))
i = 0
num_list = []
while i < num:
    num_list.append( int(input()))
    i=i+1

xor_list = []
for n in num_list:
    if xor_list.count(n) > 0:
        xor_list.remove(n)
    else:
        xor_list.append(n)

xor_result = 0
for x in xor_list:
    xor_result = xor_result ^ x

print (xor_result)
