<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
<legend>Search</legend>

<form action="rechercher.aspx" method="get">
<input type="date" id="start" name="date"
       value="2018-07-22"
       min="2018-01-01" max="2018-12-31">
<input type="submit" value="rechercher"/>
</form>
<form>

<table border="1">

<sw:forEach items="${periods }" var="o">
<tr>

<td>${o.getLabel() }</td>

<td> <a href="reserver.aspx?id=${o.getId()}&date=${date}">reserver</a></td>

</tr>

</sw:forEach>

</table>
</form>
</fieldset>





</body>
</html>