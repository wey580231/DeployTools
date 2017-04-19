<%--
  Created by IntelliJ IDEA.
  User: hanchangming
  Date: 2017/4/19
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--引入JQuery--%>
    <script src="http://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <%--引入BootStrap--%>
    <link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h3>
                CloudFoundry可视化部署工具
            </h3>
            <form action="/loginController" method="post" class="form-horizontal">
                <div class="control-group">
                    <label class="control-label" for="inputBoshDirectorIP">Bosh DirectorIP：</label>
                    <div class="controls">
                        <input id="inputBoshDirectorIP" name="BoshDirectorIP" type="text"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputBoshDirectorUsername">Bosh Director用户名：</label>
                    <div class="controls">
                        <input id="inputBoshDirectorUsername" name="inputBoshDirectorUsername" type="text"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputBoshDirectorPassword">Bosh Director密码：</label>
                    <div class="controls">
                        <input id="inputBoshDirectorPassword" name="inputBoshDirectorPassword" type="password"/>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <button type="submit" class="btn">登陆</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
