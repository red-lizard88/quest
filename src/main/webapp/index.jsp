<%@ page import="com.javarush.quest.liashchanka.services.StepService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>First jsp</title></head>
<body>

<% String[] steps = request.getParameterValues("step");
    String name = request.getParameter("name");

    if (name != null)
    session.setAttribute("nameInSession", name);
    String nameSession = (String) session.getAttribute("nameInSession");

%>

<%
    if(name == null && steps == null){ %>
<h2>Пролог</h2>
<p>Ты стоишь в космическом порту и готов подняться на борт своего корабля. Так что вперед!</p>
<form method="get">
    <input type="text" name="name" value="">
    <input type="submit" value="Представиться">
</form>
<br/>
<%}%>

<%
    if(name != null && steps == null){

%>
<h2>Ты потерял память. Принять вызов НЛО? (Вас зовут: <%=nameSession%>)</h2>
<form method="get">
    <input type="radio" name="step" value="step1-true">Принять вызов
    <input type="radio" name="step" value="step1-false">Отклонить вызов
    <input type="submit" value="Проголосовать">
</form>
<%}%>

<%
    if(steps != null){


  for(int i = 0; i < steps.length; i++) {

      if (steps[i].startsWith("step1")){

      String header = StepService.getStep(steps[i]).get(0);
%>
<h3><%=header%> (Вас зовут: <%=nameSession%>)</h3>
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
      else if(steps[i].startsWith("step2")){
                    String header2 = StepService.getStep(steps[i]).get(0);
                   %>
        <h3><%=header2%> (Вас зовут: <%=nameSession%>)</h3>
        <form method="get">
            <%
                if (StepService.getStep(steps[i]).get(1) != "") {
            %>

            <input type="radio" name="step" value="step3-true"><%=StepService.getStep(steps[i]).get(1)%>
            <input type="radio" name="step" value="step3-false"><%=StepService.getStep(steps[i]).get(2)%>
            <input type="submit" value="Проголосовать">

    <%
                }
                }
                else if(steps[i].startsWith("step3")){
                    String header3 = StepService.getStep(steps[i]).get(0);

    %>
            <h3><%=header3%></h3>

            <%
                    }
        }
        %>
</form>


<a href="<%= request.getRequestURI() %>">В начало</a>
<%
    }

%>



</body>
</html>