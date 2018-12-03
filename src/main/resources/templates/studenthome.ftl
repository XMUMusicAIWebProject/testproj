<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <!-- Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">

</head>

<body >
<div class="container">
    <!-- 标题-->
    <nav class="navbar navbar-default row ">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                <a href="#" class="navbar-brand "><span class="glyphicon glyphicon-arrow-left"></span></a>
                <div class="navbar-brand  " href="#" >我的主页</div>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">主页</a></li>
                    <li><a href="seminar.ftl">讨论课</a></li>
                    <li><a href="#">通知  <span class="badge">  42</span></a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="jumbotron" style="background: lightsteelblue">
        <h3>Hello,Student!</h3>
    </div>

    <div >
        <ul class="list-group " >
            <a class="list-group-item margin-3p" >
                <h4><span class="glyphicon glyphicon-book"></span>
                    <span class="margin-left-5b">我的课程</span>
                    <span class="glyphicon glyphicon-chevron-right float-right"></span>
                </h4>
            </a>
            <a class="list-group-item margin-3p" href="seminar.ftl" >
                <h4><span class="glyphicon glyphicon-education"></span>
                    <span class="margin-left-5b">讨论课系统</span>
                    <span class="glyphicon glyphicon-chevron-right float-right"></span>
                </h4>
            </a>
            <a class="list-group-item margin-3p" >
                <h4><span class="glyphicon glyphicon-user"></span>
                    <span class="margin-left-5b">账户与设置</span>
                    <span class="glyphicon glyphicon-chevron-right float-right"></span>
                </h4>
            </a>
        </ul>
    </div>




</div>





<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="../bootstrap/js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
