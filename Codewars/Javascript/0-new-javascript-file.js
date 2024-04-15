const readline = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});

readline.question("Difficulty: ", (difficulty) => {
  readline.question("Problem name: ", (problemName) => {
    let fileName = difficulty + " " + problemName;
    let convertedFileName = fileName.toLowerCase().replace(/ /g, "-");

    const fs = require("fs");
    fs.writeFile(
      convertedFileName + ".js",
      "New Codewars problem, Fight!",
      (err) => {
        if (err) {
          console.error(err);
          return;
        }
        readline.close();
      }
    );
  });
});
