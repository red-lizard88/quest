<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>First jsp</title></head>
<body>
<h2>Hello World!</h2>
<% String[] authors = request.getParameterValues("author");

if(authors == null){ %>
<form method="get">
<input type="checkbox" name="author" value="Ilya Liashchanka">Ilya
<input type="checkbox" name="author" value="Petr Sapojnikov">Petr
<input type="checkbox" name="author" value="Vova Small">Vova
<input type="submit" value="Submit">
</form>
<%}%>
<%

    if(authors != null){
        %>
<h3>Выбранные авторы: </h3>
<ul>
<%
  for(int i = 0; i < authors.length; i++) {
    %>
    <li><%= authors[i]%></li>
    <%
}
        %>
    </ul>
<a href="<%= request.getRequestURI() %>">Назад</a>
<%
    }
%>



</body>
</html>