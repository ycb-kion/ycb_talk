<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	function checkForm(){
		 var userName=$("#name").val();
		 var password=$("#password").val();
		 if(userName==""){
			 $("#error").html("用户名不能为空！");
			 return false;
		 }
		 if(password==""){
			 $("#error").html("密码不能为空！");
			 return false;
		 }
		 return true;
	}
</script>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

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
	<form action="login.action" method="post" onsubmit="return checkForm()">
	<table>
        
        <tr>
            <td><label>姓名: </label></td>
            <td><input type="text" id="name" name="name"></td>
        </tr>
        
        <tr>
            <td><label>密码: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        
        <tr>
            <td><label>角色: </label></td>
			<td>
			    <select id="role" name="role">
				    <option value="user"selected="selected">普通用户</option>
				    <option value="admin" >管理员</option>	
				</select>
			</td>
			</tr>

        <tr>
            <td><input id="submit1" type="submit" value="登录"></td>
            <td><font id="error"  color="red">${error}</font></td>
        </tr>
        <tr>
            <td><a href="register.jsp">注册新用户</a></td>
        </tr>
    </table>
	</form>
  </body>
</html>
