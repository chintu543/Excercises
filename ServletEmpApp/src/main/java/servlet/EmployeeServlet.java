package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeJdbc.EmployeeJDBCLibrary.Employee;
import com.employeeJdbc.EmployeeJDBCLibrary.EmployeeDBOperations;
import com.employeeJdbc.EmployeeJDBCLibrary.EmployeeNotFoundException;
import com.employeeJdbc.EmployeeJDBCLibrary.IEmployeeArray;


public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeServlet() {
        super();
      
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
//		RequestDispatcher rd = request.getRequestDispatcher("Pages/empSearch.jsp");
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empId = request.getParameter("empId");
		
		int eId = Integer.parseInt(empId);
		
		IEmployeeArray dbImpl = new EmployeeDBOperations();
		
				try {
					try {
						Employee e = dbImpl.findEmployee(eId);
						if(e!=null) {
						request.setAttribute("emp", e);
						request.getRequestDispatcher("Pages/empSearch.jsp").forward(request, response);
					}
						else {
							request.setAttribute("message", "Invalid EmployeeId!!");
							request.getRequestDispatcher("Pages/empSearch.jsp").forward(request, response);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (EmployeeNotFoundException e1) {
					
					e1.printStackTrace();
				}
			
	}

}
