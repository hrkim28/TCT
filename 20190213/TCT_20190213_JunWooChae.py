def minCount(num):
    count = 0

    while num > 1:
        if num%3 == 0:
            num = num / 3
        elif num%3 == 2:
            if num%2 == 0:
                num = num / 2
            else:
                num = num - 1
        else:
            num = num - 1
        count = count + 1
    print(count)

minCount(10)
minCount(30)