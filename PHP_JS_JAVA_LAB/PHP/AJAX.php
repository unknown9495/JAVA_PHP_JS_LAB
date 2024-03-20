<html>
  <head>
    <title>Multiplication Table</title>
  </head>
  <body>
    <h1>Multiplication Table</h1>
     Enter a number: <input type="text" name="num" required />
    <p><input type="button" id="submit" value="Get Table" /></p>
    <div id="result"></div>
    <script>
      var submit = document.getElementById("submit");
      submit.onclick = function () {
        var num = document.getElementById("num").value;
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "table.php", true);
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhr.send("num=" + num);
        xhr.onreadystatechange = function () {
          if (xhr.readyState == 4 && xhr.status == 200) {
            var result = document.getElementById("result");
            result.innerHTML = xhr.responseText;
          }
        };
      };
    </script>
  </body>
</html>

<?php

$num = $_POST["num"];
if ($num) {
  echo "<table border='1'>";
  for ($i = 1; $i <= 10; $i++) {
    $mul = $num * $i;
    echo "<tr><td>$num x $i = $mul</td></tr>";
  }
  echo "</table>";
} else {
  echo "Invalid Entry!";
}
?>