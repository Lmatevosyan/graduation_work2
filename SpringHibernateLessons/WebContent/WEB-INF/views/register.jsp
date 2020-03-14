<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@ taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body  background="<c:url value='/images/0022-045-TSv.jpg'/>" >

<div id="main">

	<div class="loginmsg">
			<h1
				style="margin: 10px 0 7px; border-bottom: 1px solid #87CEEB; padding-bottom: 10px; color: #e54ea2">Create
		 Account</h1>
		</div><br><br>
	
	<form:form method="POST" action="register" commandName="myUser">
	
		<div align="center">
			<table>
				<tr>
					<td>
						<br> 
						<label style="color: #e54ea2">First Name:</label>
						<br> 
						<form:input type="text" path="firstName"
							id="fos_user_registration_form_first_name"
							name="fos_user_registration_form_first[name]" required="required"
							maxlength="100" size="70%"/> 
						<br> 
						<span style="color: red;"><form:errors path="firstName" /></span>
					</td>
				</tr>
				<tr>
					<td>
						<br> 
						<label style="color: #e54ea2">Last Name:</label>
						<br> 
						<form:input type="text" path="lastName"
								id="fos_user_registration_form_last_name"
								name="fos_user_registration_form_last[name]" required="required"
								maxlength="100" size="70%"/> 
						<br> 
						<span style="color: red;"><form:errors path="lastName"/></span> 
						<br>
						<div style="clear: both;"></div>
					</td>
				</tr>
				
				<tr>
					<td>
						<label for="fos_user_registration_form_age"
							class="required" style="color: #e54ea2">Age:</label>
						<br> 
						<form:input type="text" path="age"
								id="fos_user_registration_form_age"
								name="fos_user_registration_form[age]" required="required"
								maxlength="255" pattern=".{2,}" size="70%"/> 
						<br> 
						<span style="color: red;"><form:errors path="age" /></span> 
						<br>
						<div style="clear: both;"></div>
					</td>
				</tr>
				<tr>
					<td>
						<label for="fos_user_registration_form_email"
							class="required" style="color: #e54ea2">Email:</label>
						<br> 
						<form:input type="email"
								path="email" id="fos_user_registration_form_email"
								name="fos_user_registration_form[email]" required="required" size="70%"/>
						<br> 
						<span style="color: red;"><form:errors path="email" /></span> 
						<label id="errorForEmail" style="visibility: hidden; color: #ff0000">The user with
								this email has already been registered.</label> 
						<br>
						<div style="clear: both;"></div>
					</td>
				</tr>
				<tr>
					<td>
						<label style="color: #e54ea2">Your Password</label>
						<br> 
						<form:input type="password" path="password"
							id="fos_user_registration_form_plainPassword_first"
							name="fos_user_registration_form[plainPassword][first]"
							required="required" size="70%"/> 
						<br> 
						<span style="color: red;"><form:errors path="password" /></span> 
						<br>
					</td>
				</tr>
				<tr>
					<td>
						<label style="color: #e54ea2">Repeat Password</label>
						<br> 
						<input type="password"
							id="fos_user_registration_form_plainPassword_second"
							name="fos_user_registration_form[plainPassword][second]"
							required="required" size="70%"/> 
						<br> 
						<label id="errorForConfirmPassword" style="visibility: hidden; color: #ff0000">*Your passwords
								do not match. Please try again.</label> 
						<br>
					</td>
				</tr>
				<tr>
					<td>
						<br> 
						<br> 
						<div align="right">
						<input type="submit"  value="Register" name="action" class="btn btn-default" style="width: auto; color: #e54ea2">
						</div>					
					</td>
				</tr>
			</table>
		</div>
		<input type="hidden" id="fos_user_registration_form__token"
			name="fos_user_registration_form[_token]"
			value="Tclk2gdsfhNXusnEpqsc3eonswv0Y9xLlAwEBEm9cV4">

	</form:form>

	
		<input type="hidden" name="confirmPasswordErr">

	<% if(request.getAttribute("confirmPasswordErr") != null && request.getAttribute("confirmPasswordErr").equals("true")) { %>
	<script>document.getElementById('errorForConfirmPassword').style.visibility = "visible";</script>
	<%} %>
</div>
</body>