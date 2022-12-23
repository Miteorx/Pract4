<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<body>
<h2>Hello stranger</h2>
<form action="/login" method="post">
    <div><label> Login : <input type="text" name="login"/> </label></div>
    <div><label> Password : <input type="password" name="password"/> </label></div>
    <div><input type="submit" class="btn btn-outline-primary" value="Sign In"/></div>
</form>
<div>
    <c:if test="${invalid}">
        Bad login or password
    </c:if>
</div>
</body>
</html>
