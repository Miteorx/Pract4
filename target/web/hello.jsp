<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
Hello, ${name}<br>

<a href="/users">Show other users</a>

<form action="/logout" method="post">
    <div><input type="submit" class="btn btn-outline-primary" name="logout" value="Logout"/></div>
</form>

</body>
</html>
