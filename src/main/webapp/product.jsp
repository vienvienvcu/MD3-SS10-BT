<%--
  Created by IntelliJ IDEA.
  User: viennguyenthi
  Date: 2024/07/24
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách sản phẩm</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .edit {
            background: #399918;
            border: none;
            padding: 8px 12px;
            border-radius: 8px;
            font-weight: 700;
            cursor: pointer;
            color: #f2f2f2;
        }
        .delete {
            background: #C40C0C;
            border: none;
            padding: 8px 12px;
            margin-left: 20px;
            border-radius: 8px;
            font-weight: 700;
            cursor: pointer;
            color: #f2f2f2;
        }
        .delete:hover{
            scale: 1.1;
        }
        .edit:hover{
           scale: 1.1;
        }
        h2 {
            color: cadetblue;
        }
    </style>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<table>
    <thead>
    <tr>
        <th>STT</th>
        <th>Product Name</th>
        <th>Image</th>
        <th>Price</th>
        <th>Stock</th>
        <th>Active</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td><img src="${product.image}" alt="product Image" width="100" height="60"/></td>
            <td>${product.price}</td>
            <td>${product.stock}</td>
            <td>
                <button class="edit">Edit</button>
                <button class="delete">delete</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="index.jsp">Home</a>
</body>
</html>
