<%@ page import="com.tyg.entity.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%= "Info" %>
</h1>
<br/>


    <form action="user/find" method="post">
        <input name="user_name"><br>
        <input type="submit" value="查找">
    </form>



</body>
</html>