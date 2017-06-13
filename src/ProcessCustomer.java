

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lookup
 */
@WebServlet("/Lookup")
public class ProcessCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProcessCustomer() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int custid = Integer.parseInt(request.getParameter("custid"));
		System.out.println("The customer id is : " + custid);
		//System.out.println(custid);
	}

}
