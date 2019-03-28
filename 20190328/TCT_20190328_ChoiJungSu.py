def is_crypto(input):
    input_list = list(input)
    result = "OK"
    for ch in input_list:
        cnt = input.count(ch)
        if cnt%3 == 0 :
            result = "FAKE"
            break

    print("================")
    print(result)

is_crypto("BAPC")
is_crypto("AABA")
is_crypto("ABCABCBBAAACC")