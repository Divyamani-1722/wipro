//Java code
package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormHandler")
public class FormHandlerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type for the response.
        response.setContentType("text/html");

        // Retrieve form parameters.
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Prepare the HTML response.
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Form Submission Result</title></head>");
            out.println("<body>");
            // Display a greeting message. If name is missing, greet "Guest".
            out.println("<h1>Hello " + ((name != null && !name.trim().isEmpty()) ? name : "Guest") + "!</h1>");
            out.println("<p>Thank you for contacting us.</p>");
            out.println("<h3>Your Details:</h3>");
            out.println("<p><strong>Email:</strong> " + (email != null ? email : "Not provided") + "</p>");
            out.println("<p><strong>Message:</strong> " + (message != null ? message : "No message entered") + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}


// HTML code
<!DOCTYPE html>
<html>
<head>
    <title>Contact Form</title>
</head>
<body>
    <h2>Contact Us</h2>
    <form action="FormHandler" method="POST">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" /><br/><br/>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" /><br/><br/>

        <label for="message">Message:</label><br/>
        <textarea id="message" name="message" rows="5" cols="30"></textarea><br/><br/>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>

