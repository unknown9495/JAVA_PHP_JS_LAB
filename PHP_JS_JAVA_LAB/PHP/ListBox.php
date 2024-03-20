<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <select name="fruit">
            <option value="default">----DEFAULT---</option>
            <option value="mango">Mango</option>
            <option value="apple">Apple</option>
            <option value="kiwi">Kiwi</option>
            <option value="strawerry">strawberry</option>
        </select>
        <input type="submit" value = "submit">
    </form>
</body>
</html>

<?php
if($_POST){
    $fruit = $_POST['fruit'];
    echo "you choose ".$fruit;
}

?>