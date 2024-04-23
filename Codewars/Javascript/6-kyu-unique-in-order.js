var uniqueInOrder = function (iterable) {
  let lastChar = "";
  let newArr = [];
  for (let i = 0; i < iterable.length; i++) {
    if (iterable[i] !== lastChar) {
      lastChar = iterable[i];
      newArr.push(iterable[i]);
    }
  }
  return newArr;
};

