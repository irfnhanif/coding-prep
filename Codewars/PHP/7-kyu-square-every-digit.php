<?php
function square_digits($num): int {
    $strNum = str_split(strval($num));

    $sqrNum = '';
    foreach ($strNum as $value) {
        $sqrNum .= strval(pow($value, 2));
    }

    return intval($sqrNum);
}

echo square_digits(123);
