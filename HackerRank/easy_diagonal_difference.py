def diagonalDifference(arr):
    ld = []
    rd = []
    for i in range(len(arr)):
        ld.append(arr[i][i])
        rd.append(arr[i][len(arr)-1-i])
    return abs(sum(ld) - sum(rd))

print(diagonalDifference([[1, 2, 3], [4, 5, 6], [9, 8, 9]]))