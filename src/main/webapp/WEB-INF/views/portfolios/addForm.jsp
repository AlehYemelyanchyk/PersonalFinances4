<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<h1>Form</h1>
<form action="#" th:action="@{/portfolios/savePortfolio}" th:object="${portfolio}" method="post">
    <p>Name: <input type="text" th:field="*{name}"/></p>
    <p><input type="submit" value="Submit"/> <input type="reset" value="Reset"/></p>
</form>
</body>
</html>