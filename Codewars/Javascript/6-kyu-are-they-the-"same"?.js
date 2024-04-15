function comp(array1, array2) {
  if (!array1 || !array2) {
    return false;
  }

  let status = true;

  array1.forEach((num) => {
    const result = array2.includes(Math.pow(num));
    if (!result) {
      status = false;
    }
  });

  return status;
}
