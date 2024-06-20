<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<%
String id = request.getParameter("userId");
String driverName = "org.postgresql.Driver";
String connectionUrl = "jdbc:postgresql://localhost:5432/";
String dbName = "jobportal";
String userId = "postgres";
String password = "postgres";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b> job_id </b></td>
<td><b>job_role</b></td>
<td><b>job_description</b></td>
<td><b>job_location</b></td>
<td><b>required_experience</b></td>
<td><b>required_skills</b></td>
<td><b>Sallary</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM job_application";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getInt("job_id") %></td>
<td><%=resultSet.getString("job_role") %></td>
<td><%=resultSet.getString("job_description") %></td>
<td><%=resultSet.getString("job_location") %></td>
<td><%=resultSet.getString("required_experience") %></td>
<td><%=resultSet.getString("required_skills") %></td>
<td><%=resultSet.getString("Sallary") %></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>