class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            return False
        for i in t:
            if i not in list(s):
                t = t.replace(i, "")
        return False if t != s else True
        

s = Solution()
print(s.isSubsequence("ab", "baab"))

