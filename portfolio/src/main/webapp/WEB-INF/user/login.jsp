<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
}

.login-container {
  max-width: 400px;
  margin: 0 auto;
  padding: 20px;
  background-color: #fff;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.login-container h1 {
  text-align: center;
  margin-bottom: 20px;
}

.login-container form {
  margin-bottom: 20px;
}

.login-container input[type="text"],
.login-container input[type="password"],
.login-container input[type="email"] {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-bottom: 10px;
}

.login-container button {
  display: block;
  width: 100%;
  padding: 10px;
  background-color: #4e73df;
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.login-container button:hover {
  background-color: #3756a4;
}


</style>
<title>로그인</title>
</head>
<body>
	<div class="login-container">
    <h1>로그인</h1>
    <form id="login-form" action="login.do" method="POST">
      <input type="text" name="user_id" placeholder="아이디를 입력하세요" required value="test">
      <input type="password" name="password" placeholder="비밀번호를 입력하세요" required value="1234">
      <button type="submit">로그인</button>
    </form>
  </div>
</body>
</html>