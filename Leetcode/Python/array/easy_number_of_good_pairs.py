class Solution:
    def numIdenticalPairs(self, nums: list[int]) -> int:
        identicalPair = 0
        for j in range(len(nums)):
            for i in range(j):
                identicalPair += 1 if nums[i] == nums[j] else identicalPair
        return identicalPair
    