class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: list[int], target: int) -> int:
        expected_worker = 0
        for hour in hours:
            if hour >= target:
                expected_worker += 1
        return expected_worker
    
s = Solution()
print(s.numberOfEmployeesWhoMetTarget([5,1,4,2,2], 6))