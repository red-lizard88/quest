package com.javarush.quest.liashchanka.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet( urlPatterns = {"/secret"} )
public class FirstHttpServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Получаем атрибут “sum” из сессии
        HttpSession session = request.getSession();
        Integer sum = (Integer) session.getAttribute("sum");
        //Обрабатываем ситуацию, когда такого атрибута у сессии еще нет
        if (sum == null)
            sum = 0;

        // Получаем параметр “n” из запроса
        String n = request.getParameter("n");
        sum += Integer.parseInt(n);

        // Записываем атрибут “sum” в сессию
        session.setAttribute("sum", sum);

        // Печатаем HTML в качестве ответа для браузера
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head> <title> CalculatorServlet </title> </head>");
        out.println("<body>");
        out.println("<h1> Sum == " + sum + "</h1>");
        out.println("</body>");
        out.println("</html>");

        Enumeration keys = session.getAttributeNames();
        while( keys.hasMoreElements() ){
            System.out.println( (String) keys.nextElement() );
        }

        // Получаем параметр “secret” из запроса
        String secret = request.getParameter("secret");

        // Кладем параметр “secret” в Http-сессию
//        HttpSession session = request.getSession(true);
//        session.setAttribute("secret", secret);

        // Печатаем HTML в качестве ответа для браузера
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Заголовок</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Пример сервлета "+ secret +"</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        } finally {
//            out.close();
//        }
    }
}
