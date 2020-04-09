<%--
  Created by IntelliJ IDEA.
  User: 杨青云
  Date: 2020/4/9
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reg.css" />
    <title>菜单</title>
</head>
<body>
<div class="wrapper">
    <div class="container">
        <h1>Welcome</h1>
        <a href="${pageContext.request.contextPath}/user/todepartment"><button>部门管理</button><br /></a>
        <a href="${pageContext.request.contextPath}/user/topost"><button>岗位管理</button><br /></a>
        <a href="${pageContext.request.contextPath}/user/tostaff"><button>员工信息中心</button></a>
    </div>
</div>
<script>
    //一般直接写在一个js文件中
    layui.use([ 'layer', 'form' ], function() {
        var layer = layui.layer, form = layui.form;
    });
</script>
</body>
</html>