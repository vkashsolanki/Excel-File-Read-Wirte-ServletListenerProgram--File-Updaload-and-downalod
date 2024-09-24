<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<!--calling css pages  -->
<%@include file="all_Components/all_css.jsp" %>

</head>
<body style="background-color: #f0f1f2;">
<!--calling navbar.jsp here -->
<%@include file="all_Components/navbar.jsp" %>
<!--for full display container-flud -->
<div class="container-flud">
	<div class="row p-4">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body">
					<div class="text/center">
						
					<h5>Login Page </h5>
					</div>
					
					<form action="login" method="post">
					<div class="form-group">
						<label>Enter the Email id </label>
						 <input type="email" required="required" class="form-control" id="exampleInputId1" aria-describedly="emailHelp" name="em">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword">Enter the Password </label>
						 <input type="password" required="required" class="form-control" id="exampleInputPassword1" aria-describedly="passwordHelp" name="pass">
					</div>
					
					<button type="submit" class="btn btn-primary badge-pill btn-block">
					Login
					</button>
					</form>
				
				
				
				
				</div>
	
	
	
	
	</div>
	</div>
	 






</div>




</div>



</body>
</html>