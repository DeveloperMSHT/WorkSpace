<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,javabeans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
            <h1>Libros</h1>
            <br/><br/>
            <table border="1">
			<tr>
				<th>Titulo</th><th>Autor</th><th>Precio</th>
			</tr>
			<%List<Libro> libros=(List<Libro>)request.getAttribute("libros");
			for(Libro l:libros){%>
				<tr>
					<td><%=l.getTitulo() %></td>
					<td><%=l.getPrecio() %></td>
					<td><%=l.getAutor() %></td>
				</tr>
			
			<%} %>
		
		</table>
	</center>

</body>
</html>