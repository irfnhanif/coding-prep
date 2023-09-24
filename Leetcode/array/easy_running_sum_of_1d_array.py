class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        sum_list = []
        for i in range(len(nums)):
            sum_list.append(sum(nums[:i + 1]))
        return sum_list