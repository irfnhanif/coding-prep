class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        return [candies[i] + extraCandies >= max(candies) for i in range(len(candies))]
