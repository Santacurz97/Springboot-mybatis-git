<%--
  Created by IntelliJ IDEA.
  User: 杨青云
  Date: 2020/4/9
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}css/staff.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}layui/css/layui.css">
    <script src="${pageContext.request.contextPath}js/jquery.min.js"></script>
    <!--<script src="js/functions.js"></script>-->
    <script src="${pageContext.request.contextPath}layui/layui.js"></script>
    <script>
        //JavaScript代码区域
        layui.use('element', function() {
            var element = layui.element;

        });
    </script>

    <title>员工管理</title>
</head>
<body>
<div class="wrapper">
    <div class="layui-container">
        <div class="layui-row">
            <div class="header" id="head">
                <div class="title">HBUE员工管理</div>
            </div>
        </div>
        <div class="layui-row" style="margin-top: 50px;">
            <div class="layui-col-xs3" style="text-align: left;margin-top: 100px;">
                <div style="width: 70%;">
                    <input type="text" name="tie" id="value1" required  lay-verify="required" placeholder="请输入员工编号" autocomplete="off" class="layui-input">
                </div><br /><br />
                <div style="width: 70%;">
                    <input type="text" name="tle" id="value2" required  lay-verify="required" placeholder="请输入员工名称" autocomplete="off" class="layui-input">
                </div><br /><br />
                <button type="button" id="sub" class="layui-btn" style="width: 70%;">查询</button>
            </div>
            <div class="layui-col-xs9">

                <table class="layui-hide" id="test" lay-filter="test"></table>

                <script type="text/html" id="toolbarDemo">
                    <div class="layui-btn-container">
                        <a href="${pageContext.request.contextPath}/addStaff"><button class="layui-btn layui-btn-sm" lay-event="addNew">新增</button></a>
                    </div>
                </script>

                <script type="text/html" id="barDemo">
                    <a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
                    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
                </script>



                <script>
                    layui.use('table', function(){
                        var table = layui.table;

                        table.render({
                            elem: '#test'
                            ,url:'${pageContext.request.contextPath}/user/staffList'
                            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
                            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                            ,defaultToolbar: ['filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
                                title: '提示'
                                ,layEvent: 'LAYTABLE_TIPS'
                                ,icon: 'layui-icon-tips'
                            }]
                            ,title: '用户数据表'
                            ,cols: [[
                                {type: 'checkbox', fixed: 'left'}
                                ,{field:'staffId', title:'员工编号', fixed: 'left', unresize: true, sort: true}
                                ,{field:'staffName', title:'名字', edit: 'text'}
                                ,{field:'staffSex', title:'性别', edit: 'text', sort: true}
                                ,{field:'staffNum', title:'身份证号', edit: 'text', sort: true}
                                ,{field:'departmentName', title:'所属部门', edit: 'text', sort: true}
                                ,{field:'postName', title:'所属岗位', edit: 'text', sort: true}
                                ,{field:'probation', title:'是否适用', templet: '#switchTpl', unresize: true}
                                ,{field:'quit', title:'是否离职', templet: '#switchTpl', unresize: true}
                                ,{fixed: 'right', title:'操作', toolbar: '#barDemo'}
                            ]]
                            ,page: true
                        });

////头工具栏事件
//table.on('toolbar(test)', function(obj){
//  var checkStatus = table.checkStatus(obj.config.id);
//  switch(obj.event){
//    case 'getCheckData':
//      var data = checkStatus.data;
//      layer.alert(JSON.stringify(data));
//    break;
//    case 'getCheckLength':
//      var data = checkStatus.data;
//      layer.msg('选中了：'+ data.length + ' 个');
//    break;
//    case 'isAll':
//      layer.msg(checkStatus.isAll ? '全选': '未全选');
//    break;
//
//    //自定义头工具栏右侧图标 - 提示
//    case 'LAYTABLE_TIPS':
//      layer.alert('这是工具栏右侧自定义的一个图标按钮');
//    break;
//  };
//});

                        //监听行工具事件
                        table.on('tool(test)', function(obj){
                            var data = obj.data;
                            //console.log(obj)
                            if(obj.event === 'del'){  //删除
                                layer.confirm('真的删除行么', function(index){
                                    obj.del();
                                    $.post("${pageContext.request.contextPath}/user/delStaff", {id:data.staffId})
                                    layer.close(index);
                                    //执行重载
                                    table.reload('test', {
                                        page: {
                                            curr: 1 //重新从第 1 页开始
                                        }
                                        , where: {//这里传参  向后台
                                            //name: name
                                            //可传多个参数到后台...  ，分隔
                                        }
                                        , url: '${pageContext.request.contextPath}/user/staffList'
                                        , method: 'post'
                                    });
                                });
                            } else if(obj.event === 'edit'){  //修改
                                window.location.href = "/user/toupdateStaff/"+data.staffId;
                                layer.close(index);
                            }
                        });

                        $('#sub').on('click', function(){
                            var departIdValue = $('#value1');
                            var departValue = $('#value2');
                            //执行重载
                            table.reload('test', {
                                page: {
                                    curr: 1 //重新从第 1 页开始
                                }
                                ,where: {
                                    staffIdValue: departValue.val(),
                                    staffValue:SdepartValue.val(),
                                }
                                , url: '${pageContext.request.contextPath}/user/searchStaff'  //后台做模糊搜索接口路径
                                , method: 'post'
                            });
                        });

                    });

                </script>
            </div>
        </div>
    </div>
</div>
</body>
</html>