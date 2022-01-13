<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "traindb";
String userid = "root";
String password = "anil123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<body>
<center>
<h1 style="background-color:DodgerBlue;">Delete Data From Database</h1>

<table border="1">
<tr>
<td>train no</td>
<td>train name</td>
<td>Source</td>
<td>Destination</td>
<td>ticket price</td>
</tr>
</center>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from trains";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("TRAIN_NO") %></td>
<td><%=resultSet.getString("TRAIN_NAME") %></td>
<td><%=resultSet.getString("SOURCE") %></td>
<td><%=resultSet.getString("DESTINATION") %></td>
<td><%=resultSet.getString("TICKET_PRICE") %></td>

<td><a href="d.jsp?TRAIN_NO=<%=resultSet.getString("TRAIN_NO") %>"><button type="button" class="delete">Delete</button></a></td>
</tr>

<%
i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>
