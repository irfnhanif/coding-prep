class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freq_s_char = {}
        freq_t_char = {}

        for char in s:
            freq_s_char[char] = freq_s_char.get(char, 0) + 1
        
        for char in t:
            freq_t_char[char] = freq_t_char.get(char, 0) + 1

        return freq_s_char == freq_t_char
    
s = Solution()

print(s.isAnagram("anagram", "nagaram"))
    