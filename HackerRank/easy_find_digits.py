def findDigits(n):
    c = 0
    for i in str(n):
        if int(i) != 0 and n % int(i) == 0:
            c += 1
    return c

print(findDigits(123)) 