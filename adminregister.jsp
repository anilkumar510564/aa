 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/traindb", "root", "anil123");

Statement stat=c.createStatement();
String id=request.getParameter("fname");
int del=stat.executeUpdate("Delete from users where fname="+id);



%>
