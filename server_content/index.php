<?php
/**
 * Created by PhpStorm.
 * User: Maps_red
 * Date: 16/06/2016
 * Time: 10:03
 */

if (isset($_GET['story'])) {
    if ($_GET['story'] == 1) {
        echo file_get_contents("story1.json");
    }elseif ($_GET['story'] == 2) {
        echo file_get_contents("story2.json");
    }elseif ($_GET['story'] == "old_1") {
        echo file_get_contents("story1_old.json");
    }
}

