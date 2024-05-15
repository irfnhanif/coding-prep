<?php

function nbDig($n, $d)
{
    $count = 0;
    for ($i=0; $i <= $n; $i++) { 
        if (str_contains(strval(pow($i, 2)), strval($d))) {
            $count += substr_count(strval(pow($i, 2)), strval($d));
        }
    }
    return $count;
}

echo nbDig(25, 1);
