def removeElement(nums, val):
    i = 0
    idx = 0
    while (i < len(nums)):
        if nums[i] != val:
            nums[idx] = nums[i]
            idx += 1
            i += 1
        else:
            i += 1

    return idx

print(removeElement([2], 3))