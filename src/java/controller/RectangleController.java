package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RectangleModel;


 
public class RectangleController extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
String length = request.getParameter("length");
String width = request.getParameter("width");
RectangleModel calculator = new RectangleModel();
String area = calculator.calculateArea(length, width);
request.setAttribute("area", area);
RequestDispatcher view = request.getRequestDispatcher("/rectangleResponse.jsp");
view.forward(request, response);
}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
processRequest(request, response);
}

@Override
public String getServletInfo() {
return "Desc";
}
}
    

