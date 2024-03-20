<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
    <form method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>
		<?php
				if($_POST) {
					$db = pg_connect("host=localhost dbname=postgres user=postgres password=post");
					
					if($db) {
						$username = $_POST['username'];
						$password = $_POST['password'];
	
						$q = "SELECT * FROM users WHERE username='$username' AND password='$password'";
						$result = pg_query($db, $q);
	
						if (pg_num_rows($result) == 1) {
						    echo "Login succesful";
						} else {
						    echo "Login failed.";
						}
						pg_close($db);
					} else {
						echo "unable to connect db";
					}
				}
		?>
</body>
</html>

##########SQL#########



CREATE DATABASE userdb;
\c userdb

CREATE TABLE users (
    id serial PRIMARY KEY,
    username VARCHAR (50) UNIQUE NOT NULL,
    password VARCHAR (255) NOT NULL
);
INSERT INTO users VALUES (1, 'savand', 'hehe');