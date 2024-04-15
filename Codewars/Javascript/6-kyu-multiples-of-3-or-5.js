function solution(number) {
  let result = 0;
  if (number < 0) {
    return result;
  }
  for (let i = 0; i < number; i++) {
    if (i % 3 === 0 || i % 5 === 0) {
      result += i;
    }
  }
  return result;
}
