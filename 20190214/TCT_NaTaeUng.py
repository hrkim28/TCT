import sys

print('•입력')
inf = sys.stdin
T = int(inf.readline())
parity = list()
row = list()
col = list()

for t in range(T):
    parity.append(inf.readline().strip("\n"))

for i in range(T):
    if parity[i].count('1')%2 !=0 :
        row.append((int(i)+1))

    colSum = 0
    for j in range(0, T):
        colSum = colSum + int(parity[j][i*2])
    if colSum%2 != 0 :
        col.append((int(i)+1))

print('•출력')
if len(row) == 0 and len(col) == 0 :
    print('OK')
elif len(row) == 1 and len(col) == 1:
    print('Change bit (%d,%d)' % (row[0], col[0]) )
else :
    print('Corrupt')



