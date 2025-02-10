//Java code 
package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Annotation-based servlet mapping
@WebServlet("/currentDateTime")
public class CurrentDateTimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Write the response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Current Date and Time</title></head>");
        out.println("<body><h1>Current Date and Time</h1>");
        out.println("<p>Date and Time: " + formattedDateTime + "</p>");
        out.println("</body></html>");
        out.close();
    }
}
//HTML code 
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="https://jakarta.ee/xml/ns/jakartaee" xmlns:web="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="https://jakarta.ee/xml/ns/jakartaee https://jakarta.ee/xml/ns/jakartaee/web-app_5_0.xsd http://xmlns.jcp.org/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="5.0">
      <display-name>DateAndTimeServlet</display-name>
    <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.jsp</welcome-file>
    <welcome-file>default.htm</welcome-file>
  </welcome-file-list> 
  
  <servlet>
    <servlet-name>CurrentDateTimeServlet</servlet-name>
    <servlet-class>com.example.servlet.CurrentDateTimeServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>CurrentDateTimeServlet</servlet-name>
    <url-pattern>/currentDateTime</url-pattern>
</servlet-mapping>

</web-app>

