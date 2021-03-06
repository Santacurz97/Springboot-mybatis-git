<%--
  Created by IntelliJ IDEA.
  User: 杨青云
  Date: 2020/4/9
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" pageEncoding="UTF-8"  contentType="text/html; UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addDepartment.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <!--<script src="js/functions.js"></script>-->
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <script>
        //JavaScript代码区域
        layui.use('element', function() {
            var element = layui.element;

        });
    </script>

    <title>添加部门</title>
</head>
<body>
<div class="wrapper">
    <!-- 数据提交 - form表单 -->
    <form action="${pageContext.request.contextPath}/dep/updateDepartment/${requestScope.departmentMessage.departmentId}" class="layui-form" method="post" style="margin: auto;width: 300px;">
        <div style="color: red;">
            ${requestScope.info}
        </div>
        <div class="layui-form-item">
            <input type="text" name="departmentName" lay-verify="title" value="${departmentMessage.departmentName}"
                   autocomplete="off" placeholder="请输入部门名称" class="layui-input" />
        </div>
        <div>
            <select name="sdepartmentId">
                <option value="">请输入上级部门名称</option>
                <c:forEach var="sdepart" items="${SdepartList}">
                        <c:choose>
                            <c:when test="${sdepart.departmentId} === ${departmentMessage.sdepartmentId}">
                                <option   value="${sdepart.departmentId}" selected>${sdepart.departmentName}</option>
                            </c:when>
                            <c:otherwise>
                                <option   value="${sdepart.departmentId}">${sdepart.departmentName}</option>
                            </c:otherwise>
                        </c:choose>
                </c:forEach>
            </select>
        </div><br /><br />
        <button id="reg" type="submit">添加</button>
    </form>
</div>
<script>
    //一般直接写在一个js文件中
    layui.use([ 'layer', 'form' ], function() {
        var layer = layui.layer, form = layui.form;
    });
</script>
</html>
