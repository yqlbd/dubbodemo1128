<%--
  Created by IntelliJ IDEA.
  User: 343617
  Date: 2016/11/28
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示User</title>
</head>
<body>
<h1>姓名：${user.name}</h1>
<h1>性别：${user.gender}</h1>
<h1>证件类别：${user.userCardType}</h1>
<h1>证件号码：${user.userCardId}</h1>
<h1>住址：${user.papersStreet}</h1>
</body>
</html>
