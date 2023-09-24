class Solution:
    def leftRightDifference(self, nums: list[int]) -> list[int]:
        answer = list()
        for i in range(len(nums)):
            answer.append(abs(sum(nums[:i]) - (sum(nums[i:]) - nums[i])))
        return answer
    
s = Solution()
print(s.leftRightDifference([1]))

