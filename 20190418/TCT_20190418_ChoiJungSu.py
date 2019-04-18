inputval = int(input())
listval = list()
q1 = 0
q2 = 0
q3 = 0
q4 = 0
axis = 0

for i in range(0, inputval):
    listval.append(input())

for str in listval:
    x = int(str.split(" ")[0])
    y = int(str.split(" ")[1])

    if x == 0 or y == 0:
        axis = axis + 1
    if x > 0 and y > 0:
        q1 += 1
    if x < 0 and y > 0:
        q2 += 1
    if x < 0 and y < 0:
        q3 += 1
    if x > 0 and y < 0:
        q4 += 1

print("Q1: ", q1)
print("Q2: ", q2)
print("Q3: ", q3)
print("Q4: ", q4)
print("AXIS: ", axis)
