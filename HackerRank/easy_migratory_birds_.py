def migratoryBirds(arr):
    count = {}
    max_small_k = arr[0]
    max_small_val = 0
    for i in arr:
        count[i] = count.get(i, 0) + 1
    for k, v in count.items():
        if v > max_small_val:
            max_small_val = v
            max_small_k = k
        elif v == max_small_val and k < max_small_k:
            max_small_k = k
    return max_small_k
        