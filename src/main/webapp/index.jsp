<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>First jsp</title></head>
<body>

<% String[] steps = request.getParameterValues("step");

if(steps == null){ %>
<h2>Ты потерял память. Принять вызов НЛО?</h2>
<form method="get">
<input type="radio" name="step" value="step1-true">Принять вызов
<input type="radio" name="step" value="step1-false">Отклонить вызов
<input type="submit" value="Submit">
</form>
<%}%>
<%

    if(steps != null){
        %>
<h3>Выбранные авторы: </h3>
<ul>
<%
  for(int i = 0; i < steps.length; i++) {
    %>
    <li><%= steps[i]%></li>
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