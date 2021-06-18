<%--
  Created by IntelliJ IDEA.
  User: Tombulibo
  Date: 2021/6/17
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page contentType="image/jpeg"%>
<jsp:useBean id="image" scope="page" class="com.tyg.util.verificate.Verificate" />
<%
    String str = image.getCertPic(0, 0, response.getOutputStream());
    // 将认证码存入SESSION
    session.setAttribute("certCode", str);
    out.clear();
    out = pageContext.pushBody();
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
