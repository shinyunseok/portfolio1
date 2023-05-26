<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
/* 전체 페이지 스타일 */
body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
  margin: 0;
  padding: 0;
}

/* 컨테이너 스타일 */
.container {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

/* 제목 스타일 */
h1 {
  text-align: center;
  margin: 30px 0;
  color: #333;
}

/* 내비게이션 스타일 */
.navigation {
  margin-bottom: 20px;
  text-align: center;
}

.navigation h3 {
  margin-top: 0;
  font-size: 18px;
}

.navigation a {
  display: inline-block;
  margin: 5px;
  padding: 10px 20px;
  text-decoration: none;
  color: #fff;
  background-color: #4e73df;
  border-radius: 5px;
  transition: background-color 0.3s;
  font-size: 14px;
  border: none;
  cursor: pointer;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.navigation a:hover {
  background-color: #3756a4;
}

/* write-button 스타일 */
.write-button {
  display: inline-block;
  margin: 5px;
  padding: 10px 20px;
  text-decoration: none;
  color: #fff;
  background-color: #4e73df;
  border: none;
  border-radius: 5px;
  transition: background-color 0.3s;
  font-size: 14px;
  cursor: pointer;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.write-button:hover {
  background-color: #3756a4;
}

/* insertBoard 스타일 */
.insertBoard {
  margin-bottom: 20px;
}

.insertBoard form {
  text-align: center;
}

.insertBoard label {
  display: block;
  margin-bottom: 10px;
  font-weight: bold;
  color: #333;
}

.insertBoard input[type="text"],
.insertBoard textarea {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

.insertBoard textarea {
  height: 200px;
  resize: vertical;
}

.insertBoard button[type="submit"],
.insertBoard button[type="button"] {
  padding: 10px 20px;
  background-color: #4e73df;
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.insertBoard button[type="submit"]:hover,
.insertBoard button[type="button"]:hover {
  background-color: #3756a4;
}

</style>

<title>게시판글쓰기</title>
</head>
<body>
  <h1>게시판글쓰기</h1>
  <div class="navigation">
    <h3>${user_name}님 환영합니다</h3>
    <c:if test="${empty user_id}">
      <a href="login.do">로그인</a>
    </c:if>
    <a href="logout.do">로그아웃</a>
    <a href="getSportList.do">체육시설</a>
    <a href="getBoardList.do">게시판</a>
    <a href="#">이용안내</a>
  </div>

  <div class="container">
    <div class="insertBoard">
      <form action="insertBoard.do" method="post">
        <label for="title">제목</label>
        <input type="text" id="title" name="title" required placeholder="제목을 입력해주세요">
        <br>
        <label for="author">작성자</label>
        <input type="text" id="author" value="${user_id }" disabled>
        <br>
        <label for="content">내용</label>
        <textarea id="content" name="content" rows="10" required placeholder="내용을 입력해주세요"></textarea>
        <br>
        <button type="submit">글쓰기</button>
        <button type="button" onclick="location.href='getBoardList.do'">목록</button>
      </form>
    </div>
  </div>
</body>
</html>
