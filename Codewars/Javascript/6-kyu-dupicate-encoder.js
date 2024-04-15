function duplicateEncode(word) {
  let newWord = "";

  for (let i = 0; i < word.length; i++) {
    if (!charSet.has(word[i].toLowerCase())) {
      charSet.add(word[i].toLowerCase());
      newWord += "(";
    } else {
      newWord += ")";
    }
  }

  return newWord;
}

console.log(duplicateEncode("hanif"));
