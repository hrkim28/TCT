

str1 = str(input("input text : "))
str1 = str1.lower()

#print (str1.count("i"))
dict = {}

for c in str1[0:] :
    if c not in dict and c != ' ':
        dict[c] = str1.count(c)

max_cnt = 0
max_ch = []
for k in dict.keys():
    if max_cnt < dict[k] :
        max_cnt = dict[k]
        max_ch = []
        max_ch.append(k)
    elif max_cnt == dict[k]:
        max_ch.append(k)

print ("가장많이쓰인 알파벳:", max_ch, " = ", max_cnt)         
        
