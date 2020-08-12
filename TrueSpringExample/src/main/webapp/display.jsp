<%--
  Created by IntelliJ IDEA.
  User: JebanyDis
  Date: 12.08.2020
  Time: 03:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>hi there</title>
</head>
<body>
    <h1> Result is: <%= request.getAttribute("result") %> </h1>
    <h2> Using $ also work like Result is: ${result} (if not working set isELIgnored="false")</h2>
</body>
</html>
