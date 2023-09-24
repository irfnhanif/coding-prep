class Solution:
    def buildArray(self, nums: list[int]) -> list[int]:
        return [nums[i] for i in nums]

s = Solution()
print(s.buildArray([0,2,1,5,3,4]))
