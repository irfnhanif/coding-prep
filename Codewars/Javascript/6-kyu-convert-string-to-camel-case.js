function toCamelCase(str) {
  if (!str) {
    return "";
  }
  const str2 = str
    .replace(/[-_]/g, " ")
    .split(" ")
    .map((word, i) =>
      i === 0 ? word : word.charAt(0).toUpperCase() + word.substring(1)
    );

  return str2.join("");
}

console.log(toCamelCase("the_stealth_warrior"));
