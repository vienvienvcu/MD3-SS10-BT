<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: viennguyenthi
  Date: 2024/07/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Add New Products</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h2 {
            color: #333;
        }
        .product {
            border: 1px solid #ddd;
            padding: 20px;
            margin: 10px 0;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .product img {
            display: block;
            margin-bottom: 10px;
        }
        .product p {
            margin: 5px 0;
            font-weight: 700;
        }
        .actions a {
            display: inline-block;
            margin-right: 10px;
            padding: 5px 10px;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            border-radius: 3px;
        }
        .actions a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h2>Show Add New Products</h2>
<c:forEach var="product" items="${newProducts}">
    <div class="product">
        <p>Name: ${product.name}</p>
        <p>Image: <img src="${product.image}" alt="product Image" width="100" height="60"/></p>
        <p>Price: ${product.price}</p>
        <p>Stock: ${product.stock}</p>
    </div>
</c:forEach>

<div class="actions">
    <a href="addProduct.jsp">+ Add</a>
    <a href="index.jsp">Home</a>
</div>
</body>
</html>
