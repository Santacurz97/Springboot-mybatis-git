<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 杨青云
  Date: 2020/4/9
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addStaff1.css">
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

    <title>添加员工信息</title>
</head>
<body>
<div class="wrapper">
    <!-- 数据提交 - form表单 -->
    <form action="${pageContext.request.contextPath}/user/addStaff" method="post" class="layui-form" style="margin: auto;width: 300px;">
        <div style="color: red;">
            ${requestScope.info}
        </div>
        <div class="layui-form-item">
            <input type="text" name="staffName" lay-verify="title" autocomplete="off" placeholder="请输入姓名" class="layui-input">
        </div>
        <div class="layui-form-item">
            <input type="radio" name="staffSex" value="男" title="男" checked="">
            <input type="radio" name="staffSex" value="女" title="女">
        </div>
        <div class="layui-form-item">
            <input type="text" name="staffNum" lay-verify="title" autocomplete="off" placeholder="请输入身份证号" class="layui-input">
        </div>
        <div class="layui-form-item">
            <input type="text" name="staffBirth" lay-verify="title" autocomplete="off" placeholder="请输入生日" class="layui-input">
        </div>
        <div class="layui-form-item">
            <select name="departmentId">
                <option value="">请输入部门名称</option>
                <c:forEach items="${requestScope.staffVo.departmentList}" var="department">
                    <option value="${department.departmentId}">${department.departmentName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="layui-form-item">
            <select name="postId">
                <option value="">请输入岗位名称</option>
                <c:forEach items="${requestScope.staffVo.postList}" var="post">
                    <option value="${post.post_id}">${post.post_name}</option>
                </c:forEach>
            </select>
        </div>
        <button id="reg" type="submit">添加</button>
    </form>
</div>
</body>
<script>
    //一般直接写在一个js文件中
    layui.use([ 'layer', 'form' ], function() {
        var layer = layui.layer, form = layui.form;
    });
</script>
</html>