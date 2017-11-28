package testjstl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport{
  
	
	String id;
    String table;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
	public int doStartTag()
	{   
		JspWriter out = pageContext.getOut();
		try{
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test1","root","root");
			
			 PreparedStatement smt = con.prepareStatement("select*from "+table+" where id=?");
			 smt.setInt(1,Integer.parseInt(id));
			 ResultSet rs =smt.executeQuery();
			 if(rs!=null)
			 {
				 ResultSetMetaData rsmd  =rs.getMetaData();
				 int ColCount = rsmd.getColumnCount();
				 out.write("<table border = 2 >");
				 out.write("<tr>");
				 for(int i =1; i<=ColCount;i++)
				 {
					 out.write("<th>"+rsmd.getColumnName(i)+"</th>");
				 }
				 out.write("</tr>");
				 out.write("<tr>");
			     if(rs.next())
			     {   
			    	 for(int i=1;i<=ColCount;i++)
			    	 out.write("<td>"+rs.getString(i)+"</td>");
			     }
			    // out.write("/tr");
			     out.write("</table>");
		     }
			 else
			 {
				 out.write("Table does not exist");
			 }
			 con.close();
	     }
		catch(Exception sq)
		{
			sq.printStackTrace();
		}
		return SKIP_BODY;
		
	}
}
