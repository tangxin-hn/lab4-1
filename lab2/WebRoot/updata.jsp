<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
     
    <title>My JSP 'update.jsp' starting page</title>
     
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
 
  </head>
   
  <body>
   <s:form action="blog!updateOne.action">
   	<s:textfield name="ISBN" label="ISBN"/>
    <s:textfield name="Title" label="Title"/>
    <s:textfield name="AuthorID" label="AuthorID"/>
    <s:textfield name="Publisher" label="Publisher"/>
    <s:textfield name="PublishDate" label="PublishDate"/>
    <s:textfield name="Price" label="Price"/>
    <s:submit value="save"/>
    </s:form>
<s:a href="book!select.action">home</s:a>
  </body>
</html>