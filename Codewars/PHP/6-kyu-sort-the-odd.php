<?php

function sortArray(array $arr): array
{
    $evenArr = [];
    foreach ($arr as $i => $n) {
        if ($n % 2 == 0) {
            $evenArr[$i] = $n;
            unset($arr[$i]);
        }
    }
    
    sort($arr);
    foreach ($evenArr as $i => $n) {
        array_splice($arr, $i, 0, $n);
    }

    return $arr;
}

print_r(sortArray([5, 8, 6, 3, 4]));