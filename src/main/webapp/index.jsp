<%@page isELIgnored="false" pageEncoding="utf-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach items="${requestScope.list}" var="a">
    ${a.id}
    ${a.name}
</c:forEach>
aaaaaaaaaaaaaa
</body>
</html>