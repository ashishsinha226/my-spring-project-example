<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/main.css">
<title>Exception occurred.</title>
</head>
<body class='bodyClass'>
	<h1>Exception message : ${exception.message}</h1>
	<h2>ID : ${exception.id}</h2>
</body>
</html>