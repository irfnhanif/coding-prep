/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  if (s.length !== t.length) {
    return false;
  }

  let sCount = {};
  let tCount = {};
  for (let i = 0; i < s.length; i++) {
    let ch1 = s.charAt(i);
    let ch2 = t.charAt(i);
    if (!sCount[ch1]) {
      sCount[ch1] = 1;
    } else {
      sCount[ch1] += 1;
    }
    if (!tCount[ch2]) {
      tCount[ch2] = 1;
    } else {
      tCount[ch2] += 1;
    }
  }

  for (let key in sCount) {
    if (sCount[key] !== tCount[key]) {
      return false;
    }
  }
  for (let key in tCount) {
    if (tCount[key] !== sCount[key]) {
      return false;
    }
  }
  return true;
};
