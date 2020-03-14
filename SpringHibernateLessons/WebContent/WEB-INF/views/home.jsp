<%@page import="org.springframework.ui.ModelMap"%>

<%@ taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>Home Page</title>
<style type="text/css">
#wrap {
	display: none;
	opacity: 0.8;
	position: fixed;
	left: 0;
	right: 0;
	top: 0;
	bottom: 0;
	padding: 16px;
	background-color: rgba(1, 1, 1, 0.725);
	z-index: 100;
	overflow: auto;
}

#window {
	width: 300px;
	height: 300px;
	margin: 50px auto;
	display: none;
	background: #fff;
	z-index: 200;
	position: fixed;
	left: 0;
	right: 0;
	top: 0;
	bottom: 0;
	padding: 16px;
}

.close {
	margin-left: 364px;
	margin-top: 4px;
	cursor: pointer;
}

span.error {
	color: red;
}
</style>
<script type="text/javascript">
	function show(state) {
		document.getElementById('window').style.display = state;
		document.getElementById('wrap').style.display = state;
	}
</script>
</head>
 <style>
   .b1 {
    background: white; 
    color: red;
    font-size: 15pt; 
    width: 116px; 
    height: 46px;
    font-family: inherit;
    font-weight: bold;
   }
  </style>
<body background="<c:url value='/images/0022-045-TSv.jpg'/>" >
	<div onclick="show('none')" id="wrap"></div>
	<div class="loginmsg">
			<h1
				style="margin: 10px 0 7px; border-bottom: 1px solid #87CEEB; padding-bottom: 10px; color: #e54ea2">
				Welcome to Funny Chess School!
			</h1>
	</div>

	<div id="window" style="background-color:#87CEEB;">
	
	
		
		<form class="login-form"
			action="<c:url value='j_spring_security_check'/>" method="post">
			<table align="center">
				<tr>
					<td>
					<br><br><br>Email:</td>
				</tr>
				<tr>
					<td><input id="j_username" name="j_username" size="20"
						maxlength="50" type="text" /></td>
				</tr>
				<tr>
					<td>Password:</td>
				</tr>
				<tr>
					<td><input id="j_password" name="j_password" size="20"
						maxlength="50" type="password" /></td>
				</tr>
			</table>
			<br> <br>
			<div align="center">
			<input type="submit" name="action"
				style=" background: white; color: red; font-size: 15pt; width: 95px; height: 40px;
    						 font-family: inherit; font-weight: bold;" value="Log in"/> 
				</div>
			<br><br>
			<div align="center">
				<label id="err1" style="visibility: hidden;">
				<span class="error">Incorrect password or email</span></label>
			</div>
			<span class="error">${err}</span>
		</form>
		
	</div>
	<form:form name="homeForm" method="POST" action="home"
		commandName="loginUser">
<!-- 		<div align="right"> -->
<!-- 			<input type="submit" id="logIn" -->
<!-- 				onclick="show('block'); return false;" -->
<!-- 				 class="b1" -->
<!-- 				value="Log in"> -->
<!-- 		</div> -->
<!-- 		<div align="left"> -->
<!-- 			<input type="submit" id="users" name="action" -->
<!-- 				class="b1" -->
<!-- 				value="Users" />  -->
			<br><br> 
<!-- 			<input type="submit" id="registration" name="action" -->
<!-- 				class="b1" -->
<!-- 				value="Registration" /> -->
			
<!-- 		</div> -->
		<br><br><br><br><br><br><div align="center">
		<video width="600" height="400" preload="auto"
		 controls="controls">
  <source src="video/vimperor.ru.62a3eec4-63e5-45b7-b823-c621d445fc3a.ogg" type="video/ogg">
   <source src="video/vimperor.ru.62a3eec4-63e5-45b7-b823-c621d445fc3a.mp4" type="video/mp4">
<!--   <source src="/video/vimperor.ru.62a3eec4-63e5-45b7-b823-c621d445fc3a.ogg" type="video/ogg"> -->
  </video>
  </div>
  

	</form:form>
	<%
		if (request.getParameter("err") != null
				&& request.getParameter("err").equals("true")) {
	%>
	<script>
		document.getElementById('window').style.display = "block";
		document.getElementById('wrap').style.display = "block";
		document.getElementById('err1').style.visibility = "visible";
	</script>
	<%
		}
	%>
	<c:if test="${not empty err}">
		<script>
			document.getElementById('window').style.display = "block";
			document.getElementById('wrap').style.display = "block";
		</script>
	</c:if>

</body>
</html>