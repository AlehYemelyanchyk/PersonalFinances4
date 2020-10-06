<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>List</title>
</head>
<body>
<h1 th:text="'List of portfolios'">List Page</h1>
<input type="button" value="Add Portfolio"
       onclick="window.location.href='showAddForm'; return false;">
<div id="container">
    <div id="content">
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>User id</th>
                <th>Action</th>
            </tr>

            <tr th:each="portfolio : ${portfoliosList}">
                <td th:text="${portfolio.id}">id</td>
                <td th:text="${portfolio.name}">name</td>
                <td th:text="${portfolio.user.id}">user_id</td>
                <td><a href="/portfolios/showUpdateForm">Update</a></td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>