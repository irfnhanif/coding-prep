function order(words) {
  const splittedWords = words.split(" ");
  let orderedWords = [];
  splittedWords.forEach((word) => {
    index = word.match(/\d+/);
    orderedWords[parseInt(index[0]) - 1] = word;
  });

  return orderedWords.join(" ")
}
