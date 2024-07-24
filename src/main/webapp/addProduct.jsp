<%--
  Created by IntelliJ IDEA.
  User: viennguyenthi
  Date: 2024/07/24
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Products</title>
</head>

<style>
    .container {
        width: 40%;
        height: 80%;
        border: 1px solid cadetblue;
        margin: 0 auto;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-content: center;
    }
    h1 {
        text-align: center;
        color: cadetblue;
    }
    form {
        margin: 0 auto;
    }
    .control {
        margin-top: 20px;
    }
    .control label{
        width: 100%;
        margin-bottom: 20px;
    }
    .control input, select{
        width: 100%;
        padding-bottom: 20px;
        margin-top: 16px;
    }
    .control-button input{
        margin-top: 30px;
        border: none;
        font-size: 16px;
        background: cadetblue;
        color: white;
        border-radius: 6px;
        padding: 10px 20px;
    }
    .control-button input:hover{
        background: #f2f2f2;
        color: cadetblue;
    }
    .control select{
        width: 50%;
        padding: 10px;
    }
    .control select option{
        font-size: 20px;
        font-weight: bolder;
    }

</style>
<body>
<div class="container">
    <h1>Add New Product</h1>
    <form action="dddProductServlet" method="post">
        <div class="control">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="control">
            <label for="image">Image URL:</label>
            <input type="text" id="image" name="image" required>
        </div>
        <div class="control">
            <label for="price">Price:</label>
            <input type="text" id="price" name="price" required>
        </div>
        <div class="control">
            <label for="stock">Stock:</label>
            <input type="text" id="stock" name="stock" required>
        </div>
        <div class="control-button">
            <input type="submit" value="Add Product">
        </div>
    </form>
</div>
<a href="index.jsp">Home</a>
</body>
</html>
