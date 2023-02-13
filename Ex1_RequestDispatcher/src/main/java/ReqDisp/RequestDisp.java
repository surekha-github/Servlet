package ReqDisp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDisp extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
		String u = request.getParameter("val1");  
	    String n =request.getParameter("val2"); 
	    String p = request.getParameter("val3");  
	          
	    if(p.equals("123456"))
	            {  
	        RequestDispatcher rd=request.getRequestDispatcher("Display");  
	        rd.forward(request, response);  
	    }  
	    else{  
	        out.print("Incorrect UserId or Password");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
	        rd.include(request, response);  
	                      
	        }  
		
				
	}

}
