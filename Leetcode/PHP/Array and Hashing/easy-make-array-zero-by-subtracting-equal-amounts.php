<?php

function minimumOperations($nums)
{
    $count = 0;
    while (array_sum($nums) !== 0) {
        $minVal = min(array_diff($nums, [0]));
        foreach ($nums as $key => $num) {
            if ($num !== 0) {
                $nums[$key] -= $minVal;
            }
        }
        $count += 1;
    }

    return $count;
}

echo minimumOperations([1,5,0,3,3]);