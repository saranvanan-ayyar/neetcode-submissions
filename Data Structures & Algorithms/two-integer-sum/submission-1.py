class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sum: dict[int,int] = {}
        for i, num in enumerate(nums):
            if target - num in sum:
                return [sum[target-num], i]
            else:
                sum[num]=i
        return []


        