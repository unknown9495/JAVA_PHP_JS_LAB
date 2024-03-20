<html>
    <body>
        <form action="" method="post">
            <h1>REVERSE A STRING</h1>
            ENTER A STRING:
            <input type="text" name = "str">
            <input type="submit">
        </form>
    </body>
</html>

<?php

function reverse_string()
{
    if($_POST){
        $string = $_POST["str"];
        $len = strlen($string);
        for($i = ($len - 1 ); $i>=0 ; $i--){
             echo $string[$i];
        }
    }
}

reverse_string();

?>