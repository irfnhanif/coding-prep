function disemvowel(str) {
  const vowels = ["a", "A", "i", "I", "u", "U", "e", "E", "o", "O"];
  let new_str = "";

  for (let i = 0; i < str.length; i++) {
    if (vowels.includes(str[i])) {
      continue;
    }
    new_str += str[i];
  }

  return new_str;
}

console.log(disemvowel("This website is for losers LOL!"));
