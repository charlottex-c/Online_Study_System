<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<base href="<%=basePath%>">
	<title>登录 在线课程学习平台</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description"	content="ForFuture Group、ForFuturn News,ForFuture Share,ForFuture Shopping" />
	<meta name="keywords" content="教学辅助平台，知识共享!共祝教育事业！  " />
	<meta name="author" content="" />
	<link rel="shortcut icon"	href="https://8.url.cn/edu/edu_modules/edu-ui/img/nohash/favicon.ico">

	<base href="<%=basePath%>">
	<link rel="stylesheet" type="text/css"	href="resource/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css"	href="resource/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css"	href="resource/fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="resource/css/util.css">
	<link rel="stylesheet" type="text/css" href="resource/css/login.css">
	<link rel="stylesheet" type="text/css" href="resource/css/style.css" media="all">
</head>


<body>
<div class="limiter" id="loginContainer">
	<div class="container-login100"
		 style="background-image: url('resource/images/b2.jpg');">
		<div class="w3layoutscontaineragileits p-l-55 p-r-55 p-t-65 p-b-54">
			<!-- 登录form -->
			<form class="login100-form validate-form"	action="<%=basePath%>userLogon.html" method="POST"  style="height:480px;">
				<span class="login100-form-title p-b-49 loginTitle">在线课程学习平台</span>

				<div class="wrap-input100 validate-input m-b-23" data-validate="请输入用户名" >

					<input class="input100"	type="text" name="account" placeholder="请输入用户名"	autocomplete="off" required="required">
					<span class="focus-input100" ></span>
				</div>

				<div class="wrap-input100 validate-input" data-validate="请输入密码">

					<input class="input100" type="password" name="password" placeholder="请输入密码" required="required">
					<span class="focus-input100" ></span>
				</div>


				<div style="margin-top:10px; float:left;">
					<span class="label-input100 label" style="color:#537b35">角色&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<div class="role">
						<input type="radio" id="type2" name="role" value="2" title="学生" checked="checked">
						<label style="color: white">学生&nbsp;&nbsp;</label>
						<input type="radio" id="type1" name="role" value="1" title="教师">
						<label style="color: white">教师&nbsp;&nbsp;</label>
						<input type="radio" id="type0" name="role" value="0" title="管理员">
						<label style="color: white">管理员&nbsp;&nbsp;</label>
					</div>
				</div>

				<div class="flex-col-c p-t-25"></div>
				<div class="flex-col-c p-t-25"></div>
				<div class="flex-col-c p-t-25"></div>
				<div class="flex-col-c p-t-25"></div>

				<div style="text-align:left;">
					<span class="txt2" style="color:#537b35;font-weight:700;font-size:14px;">提示：${info}</span>
				</div>
				<div class="container-login100-form-btn">
					<div class="wrap-login100-form-btn">
						<div class="login100-form-bgbtn"></div>
						<button class="login100-form-btn">登 录</button>
					</div>
				</div>
				<div class="copyright">
					<a href="#"> ©2020 All Rights Reserved | Design by CX</a>
				</div>
			</form>
		</div>
	</div>
</div>

<script src="resource/vendor/jquery/jquery-3.2.1.min.js"></script>
<script src="resource/js/main.js"></script>
</body>


</html>