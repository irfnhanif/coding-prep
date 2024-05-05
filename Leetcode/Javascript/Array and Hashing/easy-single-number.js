/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
  let count = {};
  for (n of nums) {
    if (count[n]) {
      count[n] += 1;
    } else {
      count[n] = 1;
    }
  }

  return Object.keys(count).find((key) => count[key] === 1);
};

console.log(singleNumber([2,2,1]));
