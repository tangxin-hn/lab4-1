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
     
    <title>My JSP 'index.jsp' starting page</title>
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
  	图书管理主页</br>
    all books <br>
    ISBN	Title	AuthorID	Publisher	PublishDate		Price</br>
    <s:iterator value="#list">
       <s:property value="ISBN"/>
       <s:property value="Title"/>
       <s:property value="AuthorID"/>
       <s:property value="Publisher"/>
       <s:property value="PublishDate"/>
       <s:property value="Price"/>
       <s:a href="book!delete.action?ISBN=%{ISBN}">delete</s:a> 
       <s:a href="book!updateOne.action?ISBN=%{ISBN}">update</s:a></br></br>
    </s:iterator>
    <s:a href="book!add.action">add(增加图书)</s:a></br>
  </body>
</html>
