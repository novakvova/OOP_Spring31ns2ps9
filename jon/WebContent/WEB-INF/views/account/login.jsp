<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<jsp:include page="../container/_link-css.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="../container/_header.jsp"></jsp:include>

	<main class="main">

		<div class="container">
			<div class="p-0 loginform">

				<h1 class="d-flex justify-content-center">Логін</h1>
				<form:form name="form" action="login" method="post" modelAttribute="user">

					<div class="form-group row">
						<div class="col-12">
							<form:input path="login" type="email" class="form-control"
								placeholder="Почта" value="${user.login}" />
							<!--  
							<input type="email" autocomplete="on" id="email" name="email"
								class="form-control" placeholder="Почта" value="">
								-->
						</div>
					</div>

					<div class="form-group row">
						<div class="col-12">
							<input type="password" autocomplete="on" id="password"
								name="password" class="form-control" placeholder="Пароль"
								value="">
						</div>
					</div>
					<div class="form-group">
						<button class="btn btn-primary btn-block">Вхід</button>
					</div>
				</form:form>
			</div>
		</div>
	</main>

	<jsp:include page="../container/_scripts.jsp"></jsp:include>
</body>
</html>