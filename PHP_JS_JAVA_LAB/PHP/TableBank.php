<html>
<head>
  <title>Bank Transaction</title>
</head>
<body>
  <h1>Bank Transaction</h1>
  <form method="post">
    <p>Account Number: <input type="text" name="accno" required></p>
    <p>Amount: <input type="number" name="amount" required></p>
    <p>Type of Transaction:
      <input type="radio" name="type" value="deposit" checked> Deposit
      <input type="radio" name="type" value="withdrawal"> Withdrawal
    </p>
    <p><input type="submit" value="Process Transaction"></p>
  </form>
  <?php
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $conn = pg_connect("host=localhost dbname=postgres user=postgres password=post") or die("Connection failed");
    $accno = $_POST["accno"];
    $amount = $_POST["amount"];
    $type = $_POST["type"];
    $sql = "SELECT balance FROM bank WHERE accno = '$accno'";
    $result = pg_query($conn, $sql) or die("Query failed");
    $row = pg_fetch_assoc($result);
    if ($row) {
      $balance = $row['balance'];
      if ($type == 'deposit') {
        $balance += $amount;
      } elseif ($type == 'withdrawal') {
        $balance -= $amount;
      }
      $sql = "UPDATE bank SET balance = $balance WHERE accno = '$accno'";
      $result = pg_query($conn, $sql) or die("Query failed");
      echo "<p>Transaction successful.</p>";
      echo "<p>New balance: $balance</p>";
    } else {
      echo "<p>Invalid account number.</p>";
    }
    pg_close($conn);
  }
  ?>
</body>
</html>







#################Sql#################





CREATE TABLE bank (
  accno VARCHAR(10) PRIMARY KEY,
  cust_name VARCHAR(50) NOT NULL,
  balance NUMERIC(10,2) NOT NULL
);

INSERT INTO bank (accno, cust_name, balance) VALUES
  ('A001', 'Alice', 10000.00),
  ('A002', 'Bob', 5000.00),
  ('A003', 'Charlie', 2000.00),
  ('A004', 'David', 3000.00),
  ('A005', 'Eve', 4000.00);