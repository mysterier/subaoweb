<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${backendPageTitle}</title>
    <link href="${url}/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading"><h3 class="panel-title">后台管理系统</h3></div>
                <div class="panel-body">
                    <form action="${backendUrl}/login" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="用户名" name="userName" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="密码" name="userPass" type="password" value="">
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <button type="submit" class="btn btn-lg btn-success btn-block">Login</button>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
