<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="/css/test.css"/>
</head>
<body>
<p>Spring MVC based on XML config success!</p>
<p>name: ${person.name}, age: ${person.age}</p>
<input type="text" id="name" value="">
<input type="button" id="btn" value="click me">
<form action="/mvc/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="submit" value="submit">
</form>
<form action="/rest/user/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="put">
</form>

<form action="/rest/user/1" method="post">
    <input type="submit" value="post">
</form>

<form action="/rest/user/1" method="get">
    <input type="submit" value="get">
</form>

<form action="/rest/user/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete">
</form>

<script type="text/javascript" src="/js/jquery.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn").click(function(){
            $.post("/mvc/getPerson",{name:$("#name").val()},function(data){
                alert(data);
            });
        });
    })
    
</script>
</body>
</html>