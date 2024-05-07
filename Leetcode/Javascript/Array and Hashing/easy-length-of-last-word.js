/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function (s) {
    return s.trim().split(/[ ]+/).pop().length
};

console.log(lengthOfLastWord("   fly me   to   the moon  "));