from collections import Counter

def topKFrequent(nums, k):
    return [n for n, _ in Counter(nums).most_common(k)]
