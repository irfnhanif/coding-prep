def generate(numRows):
    res = []
    for i in range(numRows):
        if i == 0:
            res.append([1])
        elif i == 1:
            res.append([1,1])
        else:
            res.append([1,1])
            for j in range(1, len(res[i-1])):
                res[i].insert(len(res[i]) - 1, res[i-1][j-1] + res[i-1][j])

    return res

print(generate(99))
