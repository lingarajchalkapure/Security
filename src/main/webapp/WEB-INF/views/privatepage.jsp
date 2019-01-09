<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>



<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Home</title>  
</head>  
<body>  
<h3> Hello ${pageContext.request.userPrincipal.name} </h3>

<h4>welcome javatpoint</h4>
<a href="<c:url value='/logout' />">Click here to logout</a>  
  

</body>  
</html>  