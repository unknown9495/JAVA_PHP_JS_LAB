<html>
<head>
  <title>File Upload</title>
</head>
<body>
  <h1>File Upload</h1>
  <?php
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $file = $_FILES["file"];
    $file_name = $file["name"];
    $file_size = $file["size"];
    $file_tmp = $file["tmp_name"];
    $target_dir = "c:\Users\anini";
    $target_file = $target_dir . $file_name;
    if (file_exists($target_file)) {
      echo "Sorry, the file already exists.";
      exit;
    }
    if ($file_size > 10000000) {
      echo "Sorry, the file is too large.";
      exit;
    }
    if (move_uploaded_file($file_tmp, $target_file)) {
      echo "The file has been uploaded successfully.";
    } else {
      echo "Sorry, there was an error uploading the file.";
    }
  } else {
  ?>
  <form method="post" enctype="multipart/form-data">
    <p>Select a file to upload:</p>
    <p><input type="file" name="file" required></p>
    <p><input type="submit" value="Upload"></p>
  </form>
  <?php
  }
  ?>
</body>
</html>