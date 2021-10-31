<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

                <title>Jsp </title>
        </head>
<body>
        <div class="container"><br>
                <form method="post" action="<%=request.getContextPath()%>/registro">
                        <input type="text" name="nombre" placeholder="introduce el usuario"><br><br>
                        <input type="password" name="password" placeholder="introduce el password"><br><br>
                        <input type="submit" value="Login" class="btn btn-success">
                </form>
        </div>

</body>
</html>
