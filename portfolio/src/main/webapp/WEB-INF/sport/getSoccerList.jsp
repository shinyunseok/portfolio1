<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

        /* 검색창 스타일 */
        .search-form {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }

        .search-form select,
        .search-form input[type="text"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .search-form select {
            margin-right: 10px;
        }

        .search-form button[type="submit"] {
            padding: 10px 20px;
            background-color: #4e73df;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .search-form button[type="submit"]:hover {
            background-color: #3756a4;
        }

        /* 테이블 스타일 */
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }

        th {
            background-color: #f1f1f1;
            text-align: center;
        }

        td {
            text-align: left;
        }

        /* selectEvent 스타일 */
        .selectEvent {
            margin-bottom: 20px;
            text-align: center;
        }

        .selectEvent a {
            display: inline-block;
            margin: 5px;
            padding: 10px 20px;
            text-decoration: none;
            color: #333;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: background-color 0.3s;
            font-size: 14px;
            cursor: pointer;
        }

        .selectEvent a:hover {
            background-color: #f1f1f1;
        }
    </style>


<title>체육시설현황</title>
</head>
<body>
	<h1>축구시설현황</h1>
	<div class="navigation">
    <h3>${user_name}님 환영합니다</h3>
    <c:if test="${empty user_id}">
        <a href="login.do">로그인</a>
    </c:if>
    <a href="logout.do">로그아웃</a>
    <!-- <a href="insertUser.do">회원가입</a> -->
    <a href="getSportList.do">체육시설</a>
    <a href="#">게시판</a>
    <a href="#">이용안내</a>
</div>
<div class="selectEvent">
	<a href="getSportList.do">전체</a>
	<a href="getSoccerList.do">축구장</a>
	<a href="">농구장</a>
	<a href="">풋살장</a>
	<a href="">탁구장</a>
	<a href="">족구장</a>
	<a href="">배구장</a>
	<a href="">헬스장</a>
	<a href="">야구장</a>
	<a href="">테니스장</a>
	<a href="">배드민턴장</a>
	<a href="">게이트볼장</a>
	<a href="">다목적경기장</a>
	<a href="">기타</a>
</div>
<form action="">
	<select>
		<option>전체</option>
		<option>지역</option>
		<option>#</option>
		<option>전체</option>
	</select>
	<input type="text" required="검색어를 입력하세요"> <button type="submit">검색</button>
	</form>
	<table>
		<tr>
			<th>번호</th>
			<th>시설명</th>
			<th>종목</th>
			<th>소재지도로명주소</th>
			<th>소재지지번주소</th>
			<th>관리기관</th>
			<th>운영주체</th>
			<th>연락처</th>
			<th>사용료</th>
		</tr>
		
		
		
		<c:forEach items="${soccerList}" var="soccer">
		<tr>
			<td>${soccer.seq } </td>
			<td>${soccer.facility_name } </td>
			<td>${soccer.event } </td>
			<td>${soccer.road_address } </td>
			<td>${soccer.landlot_address } </td>
			<td>${soccer.management_agency } </td>
			<td>${soccer.operating_entity } </td>
			<td>${soccer.contact_number } </td>
			<td>${soccer.usage_free } </td>
		</tr>
		</c:forEach>
			
		
	</table>
	
</body>
</html>
