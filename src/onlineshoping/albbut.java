package onlineshoping;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class albbut
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:sri","scott","tiger");
		stmt=con.createStatement();
		String alph=req.getParameter("albsrh");
		String qry="select * from music where title like alph and type='a' ";
		rs=stmt.executeQuery(qry);
		pw.println("<font size=6><pre><b>     <u>TITLE </u>      <u>AUTHOR</b></u></pre>");
		pw.println("<br>");
		pw.println("<form action=\"http://localhost:8080/addcart\" method=post>");
		pw.println("<font size=3><input type=submit value=Add_to_Cart>");
		pw.println("<input type=submit value=Check_Out></font>");
		pw.println("<select name=bch size=5 >");
		while(rs.next())
		{
		String t=rs.getString("title");
		int len=t.length();
		len=40-len;
		String s="     ";s=s.concat(t);
		//for(int i=0;i<len;i++)
			s=s.concat(" - ");
		s=s.concat(rs.getString("author"));
		pw.println("<option>"+s+"</option><br>");
		}
		pw.println("</select>");
		pw.println("</form></font>");
}
catch(ClassNotFoundException e){}
catch(SQLException e){}
finally
{
	try
	{ if (con!=null)
	 con.close();
	}catch(SQLException e){}}
}

	public class HttpServletRequest {
		public String getParameter(String albsrh) {
			return null;
		}
	}

	public class HttpServletResponse {
		public void setContentType(String s) {

		}

		public PrintWriter getWriter() {
			return null;
		}
	}

	public class ServletException extends Throwable {
	}

	public class ServletExceptionImpl { }
}