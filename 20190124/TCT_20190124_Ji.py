

def is_prime(n):
    for i in range(2, n-1):
        if n%i == 0:
            return False
    return True

def main():
    num = int(input("input number: "))

    if num<4 or num>10000:
        return

    idx = int(num/2)
    print (idx)

    # 오늘은 여기까지.. 어렵네요 ^^
    

main()
