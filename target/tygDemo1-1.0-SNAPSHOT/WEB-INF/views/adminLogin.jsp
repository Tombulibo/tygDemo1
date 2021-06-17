<%--
  Created by IntelliJ IDEA.
  User: Tombulibo
  Date: 2021/6/17
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/admin/confirmLogin" method="post">
        <input type="text" placeholder="用户名" name="admin_name"><br>
        <input type="password" placeholder="密码" name="password"><br>
        <button type="submit" class="templatemo-blue-button width-100">登录</button><br>
    </form>

</body>
</html>
