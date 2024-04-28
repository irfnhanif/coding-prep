class Solution:
    def shuffle(self, nums: list[int], n: int) -> list[int]:
        new_nums = list()
        for i in range(n):
            new_nums.append(nums[:n][i])
            new_nums.append(nums[n:][i])
        return new_nums

s = Solution()
print(s.shuffle([2,5,1,3,4,7], 3))
