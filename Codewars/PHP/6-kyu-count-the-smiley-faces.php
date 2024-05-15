<?php

function count_smileys($arr): int
{
    $count = 0;
    foreach ($arr as $emoji) {
        $result = preg_match('/^(:|;)(-|~)?(\)|D)$/', $emoji) ? 1 : 0;
        $count += $result;
    }

    return $count;
}

echo count_smileys([';]', ':[', ';*', ':$', ';-D']);