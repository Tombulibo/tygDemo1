<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tombulibo
  Date: 2021/6/17
  Time: 1:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="user">
    ${user.user_name}——${user.password}——${user.nickname}<br>
</c:forEach>

${user.user_name}——${user.password}——${user.nickname}——${user.birthday.toString()}——${user.sex}——${user.delivery_address}——${user.email}——${user.telephone}<br>
${user.toString()}<br>
</body>
</html>
