<%@ page import="com.javarush.quest.liashchanka.services.StepService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>First jsp</title></head>
<body>

<% String[] steps = request.getParameterValues("step");
    String[] name = request.getParameterValues("name");
%>

<%
    if(name == null && steps == null){ %>
<p>Введение:</p>
<form method="get">
    <input type="text" name="name" value="">
    <input type="submit" value="Представиться">
</form>
<br/>
<%}%>

<%
    if(name != null && steps == null){ %>
<h2>Ты потерял память. Принять вызов НЛО?</h2>
<form method="get">
    <input type="radio" name="step" value="step1-true">Принять вызов
    <input type="radio" name="step" value="step1-false">Отклонить вызов
    <input type="submit" value="Проголосовать">
</form>
<%}%>

<%
    if(steps != null){
        %>
<%



  for(int i = 0; i < steps.length; i++) {
      String header = StepService.getStep(steps[i]).get(0);

%>

<h3><%=header%></h3>
<form method="get">

    <%
            if (StepService.getStep(steps[i]).get(1) != "") {
    %>


    <input type="radio" name="step" value="step2-true"><%=StepService.getStep(steps[i]).get(1)%>
    <input type="radio" name="step" value="step2-false"><%=StepService.getStep(steps[i]).get(2)%>
    <input type="submit" value="Проголосовать">
    <%
                }
        }
        %>
</form>


<a href="<%= request.getRequestURI() %>">Назад</a>
<%
    }

%>



</body>
</html>