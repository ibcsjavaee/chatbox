
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Form</title>
</head>
<body>
Please enter your name:

${person}

<form action="index" method="POST">
  <h3>First Name:</h3> <input type="text" name="first_name">
  <br />
  Last Name: <input type="text" name="last_name" />
  <br />
  <input type="radio" name="sex" value="male" checked />Male
  <br>
  <input type="radio" name="sex" value="female" />Female

  <input type="submit" value="Submit" />
</form>

</form>
</body>
</html>
