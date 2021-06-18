<%--
  Created by IntelliJ IDEA.
  User: Tombulibo
  Date: 2021/6/17
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript">
        function reloadCode() {
            var verify = document.getElementById('code');
            verify.setAttribute("src", "${pageContext.request.contextPath}/verificationCodeImg?it=" + Math.random());
        }
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/confirmLogin" method="post">
    <label for="user_name">用户名</label>
    <input type="text" id="user_name" name="user_name" placeholder="用户名"><br>
    <label for="password">密码</label>
    <input type="password" id="password" name="password" placeholder="密码">
    <div>
        <label for="confirmLogo" class="col-sm-2 control-label">验证码</label>
        <img src="${pageContext.request.contextPath}/verificationCodeImg" id="code" onclick="reloadCode()"
             style="cursor: pointer;" alt="看不清楚,换一张" width="100px">
        <div style="width: 160px">
            <input type="text" class="form-control" id="confirmLogo"
                   name="confirmLogo" placeholder="验证码">
        </div>
    </div><br>
    <input type="submit" value="登录">
</form>

</body>
</html>
