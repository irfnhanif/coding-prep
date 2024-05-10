/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const pair = {}

  for (let i = 0; i < nums.length; i++) {
    if (target - nums[i] in pair) {
        return [i, pair[target - nums[i]]]
    }
    pair[nums[i]] = i
  }
};

console.log(twoSum([3, 3], 6));
