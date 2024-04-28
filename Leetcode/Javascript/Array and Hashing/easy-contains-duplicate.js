/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  const numSets = new Set()
  for (let index = 0; index < nums.length; index++) {
    if(numSets.has(nums[i])) {
        return true
    }
    numSets.add(nums[i])
  }

  return false;
};



// const containsDuplicate = (arr) => {
//   const unq = {}

//   for (let index = 0; index < arr.length; index++) {
//     if (unq[arr[index]]){
//         return true
//     }
    
//     unq[arr[index]] = "Exists"
//   }

//   return false
// };
