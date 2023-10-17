def getMoneySpent(keyboards, drives, b):
    combinations = []
    for k in keyboards:
        for d in drives:
            if (k + d) <= b:
                combinations.append(k + d)
    
    if len(combinations) == 0:
        return -1
    else:
        return max(combinations)