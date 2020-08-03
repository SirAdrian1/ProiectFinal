import onlineshoping.HttpServlet;

import java.io.*;
import java.sql.*;

public class register  extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException, InterruptedException {
	PrintWriter pw = null;
		res.wait();

		String uid =req.getParameter("uid");
String pwd= req.getParameter("pwd");
	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	res.setContentType("text/html");
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		stmt=con.createStatement();
		//String qry="insert into reges(userid,passward) values ('"+req.getParameter("uid")+"','"+req.getParameter("pwd")+"','"+req.getParameter("hques")+"','"+req.getParameter("hans")+"','"+req.getParameter("fname")+"','"+req.getParameter("lname")+"','"+req.getParameter("dd")+"-"+req.getParameter("mm")+"-"+req.getParameter("yy")+"','"+req.getParameter("add")+"','"+req.getParameter("city")+"','"+req.getParameter("pin")+"','"+req.getParameter("state")+"','"+req.getParameter("country")+"','"+req.getParameter("ccdnm")+"','"+req.getParameter("ccdno")+"','"+req.getParameter("email")+"')";
		String qry="insert into reges(userid,passward)  values('"+uid+"','"+pwd+"')";
		pw.println(qry);
                                int b=stmt.executeUpdate(qry);
		pw.println("<a href='c:/sriren/prodlist1.html'>DoShopping</a>");
	}
	catch(Exception e){e.printStackTrace();}

		/*pw.println("<a href='c:/sriren/prodlist1.html'>DoShopping</a>");*/
		
}

	private class HttpServletRequest {
		public String getParameter(String uid) {
			return null;
		}
	}

	private class HttpServletResponse {
		public void getWriter() {
		}

		public void setContentType(String s) {

		}
	}

	private class ServletException extends Exception {
	}
}