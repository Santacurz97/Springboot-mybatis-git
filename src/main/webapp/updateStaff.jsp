<%--
  Created by IntelliJ IDEA.
  User: 杨青云
  Date: 2020/4/9
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" pageEncoding="UTF-8"  contentType="text/html; UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/addStaff1.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <!--<script src="js/functions.js"></script>-->
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <script>
        $(document).ready(function(){
            //文档就绪事件

        });
    </script>
    <script>
        //JavaScript代码区域
        layui.use('element', function() {
            var element = layui.element;

        });
    </script>

    <title>修改员工信息</title>
</head>
<body>
<div class="wrapper">
    <!-- 数据提交 - form表单 -->
    <form action="${pageContext.request.contextPath}/user/updateStaff/${requestScope.staffMessage.staffId}" method="post" class="layui-form" style="margin: auto;width: 300px;">
        <div style="color: red;">
            ${requestScope.info}
        </div>
        <div class="layui-form-item">
            <input type="text" name="staffName" lay-verify="title" autocomplete="off" placeholder="请输入姓名" class="layui-input" value="${requestScope.staffMessage.staffName}" >
        </div>
        <div class="layui-form-item">
            <c:choose>
            <c:when test="${requestScope.staffMessage.probation == '1'}">
                <input type="radio" name="probation" value="1" title="试用期" checked="">
                <input type="radio" name="probation" value="0" title="正式员工">
            </c:when>
            <c:otherwise>
                <input type="radio" name="probation" value="1" title="试用期">
                <input type="radio" name="probation" value="0" title="正式员工" checked="">
            </c:otherwise>
            </c:choose>
        </div>
        <div class="layui-form-item">
            <c:choose>
                <c:when test="${requestScope.staffMessage.quit == '1'}">
                    <input type="radio" name="quit" value="1" title="离职" checked="">
                    <input type="radio" name="quit" value="0" title="在职">
                </c:when>
                <c:otherwise>
                    <input type="radio" name="quit" value="1" title="离职">
                    <input type="radio" name="quit" value="0" title="在职" checked="">
                </c:otherwise>
            </c:choose>
        </div>
        <div class="layui-form-item">
            <input type="text" name="staffNum" lay-verify="title" autocomplete="off" placeholder="请输入身份证号" value="${requestScope.staffMessage.staffNum}"class="layui-input">
        </div>
        <div class="layui-form-item">
            <select name="departmentId">
                <option value="">请选择部门名称</option>
                <c:forEach items="${requestScope.staffVo.departmentList}" var="department">
                    <option value="${department.departmentId}">${department.departmentName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="layui-form-item">
            <select name="postId">
                <option value="">请选择岗位名称</option>
                <c:forEach items="${requestScope.staffVo.postList}" var="post">
                    <option value="${post.post_id}">${post.post_name}</option>
                </c:forEach>
            </select>
        </div>
        <button id="reg" type="submit">修改</button>
    </form>
</div>
<script>
    //一般直接写在一个js文件中
    layui.use([ 'layer', 'form' ], function() {
        var layer = layui.layer, form = layui.form;
    });
</script>
</html>