def countApplesAndOranges(s, t, a, b, apples, oranges):
    ct_a = 0
    ct_b = 0
    for apple in apples:
        if a + apple in range(s, t+1):
            ct_a += 1
    print(ct_a)
    for orange in oranges:
        if b + orange in range(s, t+1):
            ct_b += 1
    print(ct_b)


