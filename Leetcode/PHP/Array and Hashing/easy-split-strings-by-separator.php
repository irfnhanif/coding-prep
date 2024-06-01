<?php

function splitWordsBySeparator($words, $separator){
    $strWords = join($separator, $words);
    return array_filter(explode($separator, $strWords));
}
