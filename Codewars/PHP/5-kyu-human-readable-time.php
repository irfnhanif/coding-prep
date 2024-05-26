<?php

function human_readable($seconds) {
    $hour = floor($seconds / 3600);
    $minute = floor(($seconds % 3600) / 60);
    $second = ($seconds % 3600) % 60;

    return sprintf("%02d:%02d:%02d", $hour, $minute, $second);
}
