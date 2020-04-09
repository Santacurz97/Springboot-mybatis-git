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
    <meta charset="utf-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/user_login.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/functions.js"></script>
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <script>
        //Demo
        layui.use('form', function(){
            var form = layui.form;
            form.render();
        });
    </script>
    <title>用户登入</title>
</head>

<body>
<div class="header" id="head">
    <div class="title">HBUE人事管理</div>
</div>
<form action="${pageContext.request.contextPath}/user/login" method="post">

    <div class="wrap" id="wrap">
        <div class="logGet">
            <!-- 头部提示信息 -->
            <div class="logD logDtip">
                <p class="p1">用户登录</p>
            </div>
            <div style="color: red; margin: -40px 100px -15px">${requestScope.info}</div>
            <!-- 输入框 -->
            <div class="lgD">
                <input type="text" id ="code" name="name" placeholder="输入用户名"/>
                <span id="codeInfo"></span>
            </div>
            <div class="lgD">
                <input type="password" id="password" name="password" placeholder="输入用户密码"/>
                <span id="paswInfo"></span>
            </div>
            <div class="logC">
                <a target="_self">
                    <button type="submit" id="login">登 录</button>
                </a>
            </div>
            <br>
            <div style="padding-left:60%;">
                <a href="#" >暂无账号?请先注册</a>
            </div>
        </div>
    </div>
</form>

</body>
</html>
