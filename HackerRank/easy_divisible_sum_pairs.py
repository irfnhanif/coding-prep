def divisibleSumPairs(n, k, ar):
    count = 0
    for j in range(n):
        for i in range(j):
            if (ar[i] + ar[j]) % k == 0:
                count += 1
    return count