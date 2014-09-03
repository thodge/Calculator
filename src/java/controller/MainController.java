package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RectangleCalculatorModel;


 
public class MainController extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
String length = request.getParameter("length");
String width = request.getParameter("width");
RectangleCalculatorModel calculator = new RectangleCalculatorModel();
String area = calculator.calculateArea(length, width);
request.setAttribute("area", area);
RequestDispatcher view = request.getRequestDispatcher("/response.jsp");
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
    

