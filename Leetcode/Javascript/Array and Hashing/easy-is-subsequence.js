/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function (s, t) {
  if (!s || s === t) return true;
  if (s.length > t.length) return false;

  let j = 0;
  for (let i = 0; i < t.length && j < s.length; i++) {
    if (t[i] === s[j]) {
      j++;
    }
  }

  return j === s.length;
};

console.log(isSubsequence("acb", "axxvdvbc"));
