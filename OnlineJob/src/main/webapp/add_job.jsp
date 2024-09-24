<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Job</title>
<%@include file="all_Components/all_css.jsp" %>
</head>
<body style="background-color: #f0f1f2;">
<%@include file="all_Components/navbar.jsp" %>

<div class="container p-2">
	<div class="col-md-10 offset-md-1">
		 <div class="card">
		 	<div class="card-body">
		 		<div class="text-center text-success">
		 			<i class="fas fa-user-friends fa-3x"></i>
		 				<h5> Add Jobs</h5>
		 		</div>
		 		<form action="addjob" method="post">
		 			<div class="form-group">
		 				<label>Enter Title</label>
		 					<input type="text"  name="title" required-class="form-control">
		 		    </div>
		 		
		 			<div class="form-row">
		 				<div class="form-group-col-md-4">
		 					<label>Location</label>
		 						<select name="location" class="custom-select" id="customselectPref">
		 						<option selected>Choose..</option>
		 						<option value="Bihar">Bihar</option>
		 						<option value="Delhi">Delhi</option>
		 						<option value="Mumbai">Mumbai</option>
		 						<option value="Chennai">Chennai</option>
		 						<option value="Kolakata">Kolakata</option>
		 						<option value="Patna">Patna</option>
		 						<option value="Pune">Pune</option>
		 						<option value="Gurgaon">Gurgaon</option>
		 						<option value="Noida">Noida</option>
		 						
		 						</select>
		 				</div>
		 				
		 				<div class="form-group col-md-4">
		 					<label>Category</label>
		 						<select class="custom-select" id="formCustomSelectPref" name="category">
		 						<option Selected>Choose..</option>
		 						<option value="IT"></option>
		 						<option value="Developer">Developer</option>
		 						<option value="Banking"></option>
		 						<option value="Engineer">Engineer</option>
		 						<option value="Teacher"></option>
		 						<option value="OfficeExcutive">Office Excutive</option>
		 						
		 						</select>
		 					</div>
		 					
		 					
		 				</div>
		 			</form>
		 	</div>
		 </div>
		 </div>
</div>

</body>
</html>