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

        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        .container h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
        }

        .form-group input[type="text"],
        .form-group input[type="password"],
        .form-group input[type="email"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .form-group input[type="radio"] {
            display: inline-block;
            margin-right: 5px;
        }

        .form-group .radio-label {
            display: inline-block;
            margin-right: 15px;
        }

        .form-group button {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #4e73df;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .form-group button[type="reset"] {
            background-color: #ccc;
        }

        .form-group button:hover {
            background-color: #3756a4;
        }
</style>
<link href="css/login.css" rel="stylesheet" type="text/css" >
<title>회원가입</title>
</head>
<body>
<div class="container">
        <h1>회원가입</h1>
        <form action="insertUser.do" method="post">
            <div class="form-group">
                <label for="id">아이디:</label>
                <input type="text" name="user_id" id="id">
            </div>
            <div class="form-group">
                <label for="password">비밀번호:</label>
                <input type="password" name="password" id="password">
            </div>
            <div class="form-group">
                <label for="password2">비밀번호 확인:</label>
                <input type="password"  id="password2">
            </div>
            <div class="form-group">
                <label for="name">이름:</label>
                <input type="text" name="user_name" id="name">
            </div>
            <div class="form-group">
                <label for="number">전화번호:</label>
                <input type="text" name="user_number" id="number">
            </div>
            <div class="form-group">
                <label for="email">이메일:</label>
                <input type="email" name="email" id="email">
            </div>
            <div class="form-group">
                <label for="birthdate">생년월일:</label>
                <input type="text" name="user_birthdate" id="birthdate">
            </div>
            <div class="form-group">
                <label>성별:</label>
                <input type="radio" name="user_gender" value="male" id="gender-male">
                <label class="radio-label" for="gender-male">남</label>
                <input type="radio" name="user_gender" value="female" id="gender-female">
                <label class="radio-label" for="gender-female">여</label>
            </div>
            <div class="form-group">
                <button type="submit">가입하기</button>
                <button type="reset">다시입력</button>
            </div>
        </form>
    </div>
</body>
<script type="text/javascript">
// 	function memberJoin() {
// 		var id = document.memberJoinForm.id.value;
// 		var password = document.memberJoinForm.password.value;
// 		var password2 = document.memberJoinForm.password2.value;
// 		var name = document.memberJoinForm.name.value;
// 		var number = document.memberJoinForm.number.value;
// 		var email = document.memberJoinForm.email.value;
// 		var birthdate = document.memberJoinForm.birthdate.value;
// 		var gender = document.memberJoinForm.gender.value;
				
		
// 		if(id==" " || id.length==0){
// 			alert("아이디를 입력해주세요");
// 		}else if(password==" " || password.length==0){
// 			alert("비밀번호를 입력해주세요");
// 		}else if(password2==" " || password2.length==0){
// 			alert("이름을 입력해주세요");
// 		}else if(number==" " || number.length==0){
// 			alert("나이를 입력해주세요");
// 		}else if(email==" " || email.length==0){
// 			alert("성별을 입력해주세요");
// 		}else if(birthdate==" " || birthdate.length==0){
// 			alert("이메일을 입력해주세요");
// 		}else if(gender==" " || gender.length==0){
// 			alert("이메일을 입력해주세요");
// 		}else{
// 			document.memberJoinForm.method="POST";
// 	        document.memberJoinForm.action='insertUser.do';
// 	        document.memberJoinForm.submit();
// 		}
		
// 	}
	
	
	
	
</script>


</html>