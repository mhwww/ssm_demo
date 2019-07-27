<%--
  Created by IntelliJ IDEA.
  User: MHW
  Date: 2019/7/27
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="findAll">查询全部</a>

    <form action="/saveAccount" method="post">
        账户：<input type="text" name="username"><br/>
        密码：<input type="password" name="password"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
