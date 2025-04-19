def twoSum(nums, target):
    nd = {}

    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in nd:
            return [nd[complement], i]
        nd[nums[i]] = i

    return []