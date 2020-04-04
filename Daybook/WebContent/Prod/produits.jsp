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
<form action="recherche.aspx" method="get">
<input  type="text" name="idProduit"  />
<input type="submit" value="rechercher"/>
</form>
</fieldset>


<fieldset>
<legend>Ajouter :</legend>
<form action="addProduct.aspx" method="get">


<table border ="1" >
<tr>
<td>ID</td>
<td><input type="text" name="idProduit" /></td>
</tr>

<tr>
<td>NOM</td>
<td><input type="text" name="nom" /></td>
</tr>

<tr>
<td>DESC</td>
<td><input type="text" name="description" /></td>
</tr>

<tr>
<td>Price</td>
<td><input type="text" name="prix" /></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="ajouter"/>
</td>
</tr>

</table>



</form>
</fieldset>

<fieldset>
<legend>List des Tableaux</legend>
<table border="1">
<tr>
<td>ID</td>
<td>NAME</td>
<td>DESC</td>
<td>PRICE</td>
<td>OPTION</td>
</tr>
<sw:forEach items="${listeProduits }" var="o">
<tr>

<td>${o.getIdProduit() }</td>
<td>${o.getNom() }</td>
<td>${o.getDescription() }</td>
<td>${o.getPrix() }</td>
<td> <a href="deleted.aspx?id=${o.getIdProduit()}">suprrimer</a></td>

</tr>

</sw:forEach>

</table>

</fieldset>
</body>
</html>