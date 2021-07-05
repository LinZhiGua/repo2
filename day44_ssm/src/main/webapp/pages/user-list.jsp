<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>用户列表</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,factory-scalable=no" name="viewport">
</head>

<body>
<div id="frameContent" class="content-wrapper" style="margin-left:0px;">
<section class="content-header">
    <h1>
        系统管理
        <small>用户列表</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
    </ol>
</section>
<section class="content">
    <div class="box box-primary">
        <div class="box-header with-border">
            <h3 class="box-title">用户列表</h3>
        </div>
        <div class="box-body">
            <div class="table-box">
                <div class="pull-left">
                    <div class="form-group form-inline">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default" title="添加" onclick='location.href="pages/user-add.jsp"'>
                                <i class="fa fa-file-o"></i> 添加
                            </button>

                            <button type="button" class="btn btn-default" title="删除" onclick="deleteUser()">
                                <i class="fa fa-file-o"></i> 删除
                            </button>
                        </div>
                    </div>
                </div>
                <div class="box-tools pull-right">
                    <div class="has-feedback">
                        <input type="text" class="form-control input-sm" placeholder="搜索">
                        <span class="glyphicon glyphicon-search form-control-feedback"></span>
                    </div>
                </div>
                <table id="dataList" class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <th class="sorting">选择</th>
                        <th class="sorting">账户ID</th>
                        <th class="sorting">用户名称</th>
                        <th class="sorting">用户生日</th>
                        <th class="sorting">性别</th>
                        <th class="sorting">地址</th>
                        <th class="sorting">所在部门</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${userList}" var="user" varStatus="row">
                        <tr>
                            <td><input type="radio" name="userId" value="${user.id}"></td>
                            <td>${row.count}</td>
                            <td>${user.username}</td>
                            <td>${user.birthday}</td>
                            <td>${user.sex}</td>
                            <td>${user.address}</td>
                            <td>${user.dept.deptName}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box-footer">
        </div>
    </div>

</section>
</div>

<script>
    /*
    * 删除用户
    * */
    function deleteUser() {

        //获取所有name等于useId的元素,并且选中元素
        //判断是否被选中
        let len = $("[name=userId]:checked").length;
        if (len==0){
            alert("请选择你要删除的信息");
            return;
        }
        //有选中的元素
        //获取选中的id的值
        let id = $("[name=userId]:checked").val();
        if (confirm("你确定要删除该条信息嘛?")){

            //使用jQuery提交delete请求
            $.ajax({
                url:"user/" + id, //上传参数到控制器
                //请求方式
                method:"delete",
                success: function (result) {
                    if (result){
                        alert("删除成功");
                        location.reload();
                    }else {
                        alert("删除失败")
                    }
                }
            });

        }else {
            alert("取消删除...")
        }

    }



</script>
</body>

</html>