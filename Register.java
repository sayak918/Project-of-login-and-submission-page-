

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname=request.getParameter("uname");
		 String password=request.getParameter("password");
		 String email=request.getParameter("email");
		 String phone=request.getParameter("phone");
		 Member member=new Member(uname, password, email, phone);
		 RegisterDao rdao=new RegisterDao();
		 String result=rdao.insert(member);
		 response.getWriter().println(result);
		
	}

}
