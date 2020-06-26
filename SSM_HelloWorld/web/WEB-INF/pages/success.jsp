<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/24
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>666</h1>
<table border="1" cellspacing="0" cellpadding="5">
    <tr>
        <th>id</th>
        <th>teacherName</th>
        <th>course</th>
        <th>address</th>
    </tr>
    <C:forEach items="${teachers.list}" var="tea">
        <tr>
            <td>${tea.id}</td>
            <td>${tea.teacherName}</td>
            <td>${tea.course}</td>
            <td>南昌市</td>
        </tr>
    </C:forEach>
    <tr>
        <td colspan="4">
            <a href="getAll?pn=1">首页</a>
            <a href="getAll?pn=${teachers.prePage}">上一页</a>
            <c:forEach items="${teachers.navigatepageNums}" var="num">
                <c:if test="${num == teachers.pageNum}">
                    [${num}]
                </c:if>
                <c:if test="${num != teachers.pageNum}">
                    <a href="getAll?pn=${num}">${num}</a>
                </c:if>
            </c:forEach>
            <a href="getAll?pn=${teachers.nextPage}">下一页</a>
            <a href="getAll?pn=${teachers.pages}">末页</a>
        </td>
    </tr>
</table>
</body>
</html>
