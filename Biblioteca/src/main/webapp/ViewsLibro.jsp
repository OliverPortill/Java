<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libros</title>
</head>
<body>
	<h1>Gestión de libros</h1>
	<form method = "POST" action = " v ">
		<input type = "text" placeholder = "Código:" name = "code"/>
		<input type = "text" placeholder = "Autor:" name = "author"/>
		<input type = "text" placeholder = "Titulo:" name = "title"/>
		<input type = "text" placeholder = "Año:" name = "year"/>
		<select name = "status">
			<option value = "disponible">Disponible</option>
			<option value = "no-disponible">No Disponible </option> 
		</select>
		<input type = "text" placeholder = "Editorial" name = "editorial"/>
		<button type = "submit">Registrar libro</button>
	</form>
	<hr>
	<table>
		<tr>
			<td>Código</td>
			<td>Código</td>
			<td>Código</td>
			<td>Código</td>
			<td>Código</td>
			<td>Código</td>
		</tr>
	</table>
</body>
</html>