<%--
  Created by IntelliJ IDEA.
  User: zkaigang
  Date: 2020/3/31
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
查询所有
<hr>
    <c:forEach items="${list}" var="user">
        ${user.username}
    </c:forEach>
<hr>
查询一个
<hr>
    ${user.username}


</body>
</html>
