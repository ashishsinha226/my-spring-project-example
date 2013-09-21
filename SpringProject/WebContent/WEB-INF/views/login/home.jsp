<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
<title>Home</title>
</head>
<body class='bodyClass'>
	<form:form method="POST" action="/spr/login.htm">
		<table width="25%" align="center">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
					<fieldset>
						<legend class="TextSmall">Login here</legend>
						<table align="center">
							<tr>
								<td colspan="2">&nbsp;</td>
							</tr>
							<tr>
								<td><form:label path="username">Username:</form:label></td>
								<td><form:input path="username" /></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><form:errors path="username"
										cssClass="error"></form:errors></td>
							</tr>
							<tr>
								<td><form:label path="password">Password:</form:label></td>
								<td><form:password path="password" /></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><form:errors path="password"
										cssClass="error">
									</form:errors></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="Login" /></td>
							</tr>
							<tr>
								<td colspan="2">&nbsp;</td>
							</tr>
						</table>
					</fieldset>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>