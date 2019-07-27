<%--
  Created by IntelliJ IDEA.
  User: MHW
  Date: 2019/7/27
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
访问成功
<c:forEach items="${list}" var="account">
    ${account.username}
</c:forEach>
</body>
</html>
