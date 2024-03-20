<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method = "POST">
        Name: <input type="text" name = "name"><br>
        Address: <textarea name="address" id="" cols="30" rows="10"></textarea><br><br>
        age: <input type = "text" name = "age"><br>
        phone: <input type=" text" name = "phone"><br>
        Email: <input type="text" name = "email"><br>
        Educational Qualification: <input type="text" name = "Qualification"><br>
        <input type="submit" value="submit">

    </form>
</body>
</html>
<?php
if($_POST){
    echo "<h1>Bio Data</h1>";
    echo "Name:".$_POST['name']."<br>";
    echo "Adderss:".$_POST['address']."<br>";
    echo "age:".$_POST['age']."<br>";
    echo "phone:".$_POST['phone']."<br>";
    echo "email:".$_POST['email']."<br>";
    echo " Educational Qualification:".$_POST['Qualification']."<br>";

}


?>
