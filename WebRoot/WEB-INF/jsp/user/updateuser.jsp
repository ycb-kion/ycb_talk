<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateuser.jsp' starting page</title>
    
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
    <form action="update.action" method="post" >
       <table>
        <tr>
            <td><label>id: </label></td>
            <td><input type="text" style="border:0px;" value="${user.user_id}" name="user_id" readonly="readonly"></td>
        </tr>
        <tr>
            <td><input type="text" style="display:none" value="${user.icon}" id="icon" name="icon"></td>
        </tr>
        <tr>
            <td>头像：</td>
            <td><a href="#"><img src="${user.icon}"></a></td>
        </tr>
        
        <tr>
            <td><label>姓名: </label></td>
            <td><input type="text" value="${user.username}" name="username"></td>
        </tr>
        
        <tr>
            <td><label>邮箱: </label></td>
            <td><input type="text" value="${user.emill}" name="emill"></td>
        </tr>
        
        <tr>
            <td><label>密码: </label></td>
            <td><input type="text" value="${user.password}" name="password"></td>
        </tr>
        
        <tr>
            <td><label>性别: </label></td>
            <td><input type="text" style="border:0px;" value="${user.sex}" readonly="readonly" name="sex"></td>
        </tr>
        
        <tr>
            <td><input type="submit" value="修改"></td>
        </tr>
       </table>
    </form>
  </body>
</html>
