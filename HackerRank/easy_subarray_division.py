def birthday(s, d, m):
    count = 0
    for i in range(len(s)):
        if sum(s[i:i+m]) == d and i+m <= len(s):
            count += 1
    return count

print(birthday([1, 2, 1, 3, 2], 3, 2))