def majorityElement(nums):
    counts = {}
    for i in nums:
        counts[i] = counts.get(i,0) + 1
    
    most_frequent_key = 0
    most_frequent_count = 0
    for key,count in counts.items():
        if count > most_frequent_count:
            most_frequent_count = count
            most_frequent_key = key
    
    return most_frequent_key

print(majorityElement([1, 2, 3, 2, 1, 4, 1]))