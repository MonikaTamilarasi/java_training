<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

table{
border: 2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,td,th{
border: 2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
</style>
</head>
<body>
<table>
<tr>
<th><h3>Product id</th></h3>
<th><h3>Product Name</th></h3>
<th><h3>Price</th></h3>
</tr>
<c:forEach items="${list}" var ="eachItem" >
<tr>
<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>