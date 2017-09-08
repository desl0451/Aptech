<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>学员信息管理平台</title>

<!-- Bootstrap -->
<link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
<!-- Font Awesome -->
<link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
<!-- NProgress -->
<link href="${pageContext.request.contextPath }/statics/css/nprogress.css" rel="stylesheet">
<!-- Animate.css -->
<link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="${pageContext.request.contextPath }/statics/css/custom.min.css" rel="stylesheet">
</head>

<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a> <a class="hiddenanchor" id="signin"></a>
		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
					<form name="form1" method="get" action="${pageContext.request.contextPath }/stu/dologin.html">
						<h1>学员信息管理平台</h1>
						<div>
							<input type="text" class="form-control" name="username" placeholder="请输入用户名" required=""  value="尹成龙"/>
						</div>
						<div>
							<input type="password" class="form-control" name="password"	placeholder="请输入密码" required="" value="123456"/>
						</div>
						<div>
			                <a class="btn btn-default submit" href="javascript:document.form1.submit()">登  录</a>
			                <a class="btn btn-default submit" href="#">忘记密码</a>
			            </div>
						<span>${error}</span>

						<div class="clearfix"></div>

						<div class="separator">
							<p class="change_link">
								<a href="#signup" class="to_register">忘记密码</a> <a href="#signup" class="to_register"> 创建账号 </a>
							</p>
							<div class="clearfix"></div>
							<br />
							<div>
								<h1>
									<i class="fa fa-paw"></i> App软件开发
								</h1>
								<p>©2020 All Rights Reserved. Copyright © 1999-2020, Aptech.NET, All Rights Reserved</p>
							</div>
						</div>
					</form>
				</section>
			</div>

			<div id="register" class="animate form registration_form">
				<section class="login_content">
					<form>
						<h1>Create Account</h1>
						<div>
							<input type="text" class="form-control" placeholder="Username" required="" />
						</div>
						<div>
							<input type="email" class="form-control" placeholder="Email" required="" />
						</div>
						<div>
							<input type="password" class="form-control"	placeholder="Password" required="" />
						</div>
						<div>
							<a class="btn btn-default submit" href="index.html">提交</a>
						</div>

						<div class="clearfix"></div>

						<div class="separator">
							<p class="change_link">
								Already a member ? <a href="#signin" class="to_register">登录</a>
							</p>

							<div class="clearfix"></div>
							<br />

							<div>
								<h1>
									<i class="fa fa-paw"></i> Gentelella Alela!
								</h1>
								<p>©2016 All Rights Reserved. 青鸟精神，永不妥协的教育品质紧跟IT行业变化，打造适应时代需求的职业教育产品支持你成为一个受人尊重的专业人才</p>
							</div>
						</div>
					</form>
				</section>
			</div>
		</div>
	</div>
</body>
</html>