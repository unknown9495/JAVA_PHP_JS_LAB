



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Last Visited on :</h1>

</body>
</html>


<?php

$now = 60 * 60* 24 *60 +time();
// echo $now;
date_default_timezone_set("asia/kolkata");
setCookie("lastvisit" , date("y-m-d h:m:s") , $now);
if(isset($_COOKIE['lastvisit'])){
    $visit = $_COOKIE["lastvisit"];
    echo "<br> your last visit was :".$visit;
}
else{
    echo "Your first visit"
}
?>



