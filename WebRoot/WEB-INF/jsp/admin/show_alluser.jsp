<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show_alluser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript">
	
	   $(function(){
	     $(".thumbs a").click(function(){
	        var largePath=${admin.icon};
	        $("#Icon").attr({
	           src:largePath,
	        });
	        return false;
	     });
	   });
	   </script> -->
	

  </head>
  
   <body>
   <h1 align="center">欢迎管理员，${admin.name}！
   <a><img id="Icon" alt="icon" src="${admin.icon}"/></a></h1>
   <h2 ><a href="login.jsp">退出登录</a></h2>
      <table align="center" border="1" width="720" cellspacing="0" cellpadding="6">
		<thead>
			<tr>
				<th>用户id</th>
				<th>用户名</th>
				<th>邮箱</th>
				<th>性别</th>
				<th>操作</th>
				
			</tr>
		</thead>
		<c:forEach items="${requestScope.allusers}" var="u" varStatus="a">
		  
			<tbody>
				<tr>
					<td>${u.user_id}</td>
					<td>${u.username}</td>
					<td>${u.emill}</td>
					<td>${u.sex}</td>
<!-- 					<td><input type="button" value="删除"></td> -->
 					<td><a href="delete.action?id=${u.user_id}">删除</a></td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
  </body>
</html>
