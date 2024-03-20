<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <input type="radio" name = "choice" value = "dis">Display Array <br>
        <input type="radio" name = "choice" value="sort"> Sort Array <br>
        <input type="radio" name = "choice" value = "duplic">Array without duplicate <br>
        <input type="radio" name = "choice" value= "remove">Remove last element <br>
        <input type="radio" name = "choice" value="rev">Reverse order <br>
        <input type="radio" name = "choice" value = "search">Search an element <br>
        <input type="submit" value = "submit">

    </form>
    <?php
    if($_POST){
        $a = array("Alice" , "Bob" , "eve" ,"Charle" , "David" , "eve" , "Frank" , "Charle" , );
        $c = $_POST['choice'];
        switch($c){
            case "dis":
                echo "Array is :<br>";
                foreach($a as $x)
                echo "\t".$x;
            break;

            case "sort":
                echo "The Sorted Array is <br>";
                sort($a);
                foreach($a as $x)
                echo "\t".$x;
            break;
            case "duplic":
                echo "Array without duplicate is :<br>";
                $a = array_unique($a);
                foreach($a as $x)
                echo "\t".$x;
            break;
            case "remove":
                echo "the names after removing last elements are :<br>";
                $a = array_pop($a);
                foreach($a as $x)
                echo "\t".$x;
            break;
            case "rev":
                echo "the names after removing last elements are :<br>";
                $a = array_rev($a);
                foreach($a as $x)
                echo "\t".$x;
            break;
            case "search":
                $element = "eve";
                if(in_array($element , $a)){
                    echo "<br><br> $element is found in array";
                }else{
                    echo "not found";
                }
                
            break;   

        }
        }
    

    ?>
</body>
</html>