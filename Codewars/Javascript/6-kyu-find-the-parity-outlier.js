function findOutlier(integers) {
  return integers.filter((i) => i % 2 === 0).length >
    integers.filter((i) => i % 2 !== 0).length
    ? integers.filter((i) => i % 2 !== 0)[0]
    : integers.filter((i) => i % 2 === 0)[0];
}

console.log(findOutlier([0, 0, 3, 0, 0]));
