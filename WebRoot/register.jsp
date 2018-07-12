<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
    <script type="text/javascript">
	    function checkForm(){
		     var userName=$("#username").val();
		     var password=$("#password").val();
		     if(userName==""){
		    	 $("#error").html("姓名不能为空！");
		    	 return false;
		     }
		     if(password==""){
			     $("#error").html("密码不能为空！");
			     return false;
		     }
		     return true;
	    }
	    
// 	    $(function(){
// 	     $(".thumbs a").click(function(){
// 	        var largePath=${admin.icon};
// 	        $("#Icon").attr({
// 	           src:largePath,
// 	        });
// 	        return false;
// 	     });
// 	   });

    </script>

  </head>
  
  <body>
    <form action="upload.action" enctype="multipart/form-data" method="post">
             头像上传：<input id="icon" name="icon" type="file"  />
       <input type="submit" value="提交" />${result}
    </form>
    <img alt="ic" src="img/${filename}"/>
    
    
    <form action="adduser.action" method="get" onsubmit="return checkForm()" >
       <table>
        <tr>
            <td><input type="text" style="display:none" value="img/${filename}" id="icon" name="icon"></td>
        </tr>
        <tr>
            <td><label>姓名: </label></td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        
        <tr>
            <td><label>邮箱: </label></td>
            <td><input type="text" id="emill" name="emill"></td>
        </tr>
        
        <tr>
            <td><label>密码: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        
        <tr>
            <td><label>性别: </label></td>
			<td>
			    <select id="sex" name="sex">
				    <option value="男"selected="selected">男</option>
				    <option value="女" >女</option>	
				</select>
			</td>
        </tr>
        
        <tr>
            <td><input type="submit" value="注册"></td>
            <td><font id="error"  color="red">${error}</font></td>
        </tr>
       </table>
    </form>
  </body>
</html>
