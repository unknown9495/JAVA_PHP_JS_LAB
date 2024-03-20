<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Perfect , Abudant or Deficient</h1>
    <form action="" method="post">
    Enter a Number :
    <input type="text" name="num" >
    <input type="submit">
    </form>
</body>
</html>

<?php
if($_POST){
    $no = $_POST['num'];
    $sum = 0;
     if($i=1;$i<$no;$i++){

        if($sum%$i == 0){
            $sum = $sum +$i;
        }
    }
    if($sum == $no){
        echo "Perfect No";
    }
    else if($sum > $no){
        echo "Abudant no";
    else
    echo "Deficient Number";
    }
}
?>