package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int counter;
       
    public CounterServlet() {
           counter = 0;  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Counter is incrementing");
		counter++;
		request.setAttribute("message", counter);
     	RequestDispatcher rd = request.getRequestDispatcher("Pages/count.jsp");
     	rd.forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
