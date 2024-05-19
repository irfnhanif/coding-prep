<?php

function alphabet_position(string $s): string
{
    $result = '';
    $alphabetList = range('a', 'z');
    foreach (str_split(strtolower($s)) as $c) {
        if (in_array($c, $alphabetList)) {
            $result .= array_search($c, $alphabetList) + 1;
            $result .= ' ';
        }       
    }

    return rtrim($result);
}

var_dump(alphabet_position('hanif'));
