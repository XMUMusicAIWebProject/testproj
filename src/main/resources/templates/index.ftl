<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>

    <title>Login</title>
</head>

<body>
<div class="container">
    <form class="form-signin" action="/teacher/login" method="post">
        <h2 class="form-signin-heading">请 登 录</h2>
        <input type="text" class="form-control" placeholder="账号" name="userid"/>
        <input type="password" class="form-control" placeholder="密码" name="password"/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>
</div>
</body>
</html>
