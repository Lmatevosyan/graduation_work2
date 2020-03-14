
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Test 1</title>
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
</head>
<body background="<c:url value='/images/0022-045-TSv.jpg'/>">
	<form method="POST" action="test1">
		<div align="center">
			<table width="50%" height="100%">
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">1. Какого цвета
							поле e4?</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst1" name="qst1" value="0"><label
						style="font-size: 20px; color: red;">Белое</label></td>
					<td align="center"><br>
					<input type="radio" id="qst1" name="qst1" value="1"><label
						style="font-size: 20px; color: red;">Черное</label></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">2. Какого цвета
							поле a7?</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst2" name="qst2" value="0"><label
						style="font-size: 20px; color: red;">Белое </label></td>
					<td align="center"><br>
					<input type="radio" id="qst2" name="qst2" value="1"><label
						style="font-size: 20px; color: red;">Черное </label></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">3. Какого цвета
							поле g6?</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst3" name="qst3" value="0"><label
						style="font-size: 20px; color: red;">Белое </label></td>
					<td align="center"><br>
					<input type="radio" id="qst3" name="qst3" value="1"><label
						style="font-size: 20px; color: red;">Черное </label></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">4. Какого цвета
							поле f8?</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst4" name="qst4" value="0"><label
						style="font-size: 20px; color: red;">Белое </label></td>
					<td align="center"><br>
					<input type="radio" id="qst4" name="qst4" value="1"><label
						style="font-size: 20px; color: red;">Черное </label></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">5. Какого цвета
							поле d3?</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst5" name="qst5" value="0"><label
						style="font-size: 20px; color: red;">Белое </label></td>
					<td align="center"><br>
					<input type="radio" id="qst5" name="qst5" value="1"><label
						style="font-size: 20px; color: red;">Черное </label></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">6. Назови
							диагонали, проходящие через поле e5</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst6" name="qst6" value="0"><label
						style="font-size: 20px; color: red;">a1-h8 и b8-h2 </label></td>
					<td align="center"><br>
					<input type="radio" id="qst6" name="qst6" value="1"><label
						style="font-size: 20px; color: red;">a1-g6 и a8-h1</label></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><br>
					<label style="font-size: 20px; color: red;">7. Назови поле
							пересечения диагоналей a2-g8 и вертикали e</label></td>
				</tr>
				<tr>
					<td align="center"><br>
					<input type="radio" id="qst7" name="qst7" value="0"><label
						style="font-size: 20px; color: red;">e5 </label></td>
					<td align="center"><br>
					<input type="radio" id="qst7" name="qst7" value="1"><label
						style="font-size: 20px; color: red;">e6 </label></td>
				</tr>
			</table>
			<br>
			<br>
			<div align="center">
				<input type="submit" id="check" name="action" value="Check"
					class="b1"> <br>
				<br> <label id="result" style="visibility: hidden; color: red;"><h1><%=request.getAttribute("message")%></h3></label>
				<%
					if (request.getAttribute("message") != null) {
				%>
					<script>
						document.getElementById("result").style.visibility = "visible";
					</script>
				<%
					}
				%>
				<div align="right">
					<input type="submit" id="nextl" name="action" value="Next lesson"
						style=" background: white; color: red; font-size: 15pt;	height: 46px;
									font-family: inherit; font-weight: bold; width: 126px;"> <input
						type="submit" id="back" name="action" value="My page" class="b1">
				</div>

			</div>
			<input type="hidden" name="message" id="message" />
	</form>
</body>
</html>