<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<!--calling css pages  -->
<%@include file="all_Components/all_css.jsp" %>
</head>
<body style="background-color: #f0f1f2;">
<!--calling navbar.jsp here -->
<%@include file="all_Components/navbar.jsp" %>

<div class="container-fluid">
	<div class="row p-4">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body">
					<div class="text/center">
					 	<!-- <i class="fa fa-plus fa-2x" aria-hidden="true"></i> -->
					 	<h5>Registration</h5>
					 	
					</div>
					<form action="register" method="post">
					
					<div class="form-group">
					<label>Enter your full name</label>
					<input type="text" required="required" class="form-control" id="exampleInputName" name="name" aria-describedly="namehelp">
					</div>
					
					<div class="form-group">
					<label>Enter your Qualification</label>
					<input type="text" required="required" class="form-control" id="exampleInpuQua" name="qua" aria-describedly="quahelp">
					</div>
					
					<div class="form-group">
					<label>Enter your Email id</label>
					<input type="email" required="required" class="form-control" id="exampleInputemail" name="email" aria-describedly="emailhelp">
					</div>
					
					<div class="form-group">
					<label>Enter your Password </label>
					<input type="password" required="required" class="form-control" id="exampleInputPassword" name="password" aria-describedly=passwordhelp">
					</div>
				
					
					
					<button type="submit" class="btn btn-primary badge-pill btn-block">
					Register
					</button>
					
					</form>
					
				</div>
			</div>
		
		
		
</div>
</div>
</div>


</body>
</html>