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
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/addStaff.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}layui/css/layui.css">
    <script src="${pageContext.request.contextPath}js/jquery.min.js"></script>
    <!--<script src="js/functions.js"></script>-->
    <script src="${pageContext.request.contextPath}layui/layui.js"></script>
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
    <form action="${pageContext.request.contextPath}/user/updateStaff" method="post" class="layui-form">
        <div style="color: red;">
            ${requestScope.info}
        </div>
        <div class = "rgD">
            <div>
                <input id="code" type="text" placeholder="请输入姓名" autocomplete="off" value="${staffMessage.staffName}"
                       name="staffName"> <span id="codeInfo"></span>
            </div>
        </div>
        <div class="layui-form-item">
            <c:when test="${staffMessage.staffSex}">
                <input type="radio" name="staffSex" value="false" title="男">
                <input type="radio" name="staffSex" value="true" title="女" checked="">
            </c:when>
            <c:otherwise>
                <input type="radio" name="staffSex" value="false" title="男" checked="">
                <input type="radio" name="staffSex" value="true" title="女">
            </c:otherwise>

        </div>
        <div class = "rgD">
            <div>
                <input class="password" type="password" placeholder="请输入身份证号" autocomplete="off" value="${staffMessage.staffNum}"
                       name="staffNum"> <span id="repaswInfo"></span>
            </div>
        </div>
        <div class = "rgD">
            <div>
                <input id="birthday" type="date" placeholder="出生日期" autocomplete="off" value="${staffMessage.staffBirth}"
                       name="staffBirth"> <span id="birthdayInfo"></span>
            </div>
        </div>
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