case1 = "I think I'm lost."
case2 = "I think I'm lost.I can't tell."
case3 = "I think I'm lost. I can't tell what's where."

case1 = case1.lower()
case2 = case2.lower()
case3 = case3.lower()

case = case3

charCount = 0
maxCount = 0
maxLetter = ""

for i in range(97, 123):
    charCount = case.count(chr(i))
    if maxCount < charCount:
        maxCount = charCount
        maxLetter = chr(i)
    elif maxCount == charCount:
        maxLetter +=  chr(i)

for i in maxLetter:
    print(i, " ",  end="")

print(" : " , maxCount)