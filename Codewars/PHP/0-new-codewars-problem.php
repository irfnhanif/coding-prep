<?php
$difficulty = readline("Difficulty: ");
$problemName = readline("Problem name: ");

$fileName = $difficulty . " " . $problemName;
$convertedFileName = strtolower(str_replace(' ', '-', $fileName));

$file = fopen($convertedFileName . ".php", "w");
if ($file == false) {
    echo ("Error in opening new file");
    exit();
}
fwrite($file, "<?php\n //New codewars kata, Fight!");
fclose($file);
