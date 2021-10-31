<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
                <title>JSP Page</title>
        </head>
<body>
        <div class="container">
                <div class="jumbotron">
                        <h1>TUTORIAL 1</h1>
                        <h1>Servlet Controlador</h1>
                </div>
        </div><br>
        <div class="container">
                <form action="<%=request.getContextPath()%>/SaludoServlet" method="get" class="form-control">
                                <input type="text" name="nombre" placeholder="Tu nombre" class="form-control"><br><br>
                                <input type="text" name="edad" placeholder="Tu edad" class="form-control">
                                <input type="submit" value="enviar"><br><br>
                </form>
                <!--requestScope es lo mismo q reques.getAttribute -->
                <!-- puse & en vez de $, no te olvides nov
                &{requestScope.error} &{requestScope.mensaje} -->
<c:if test="${not empty requestScope.error}">
        <div class="alert alert-danger d-flex align-items-center" role="alert">
                <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
        <div>
                ${requestScope.error}
        </div>
        
</c:if>
                
<c:if test="${not empty requestScope.mensaje}">
        <div class="alert alert-success d-flex align-items-center" role="alert">
                <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Danger:"><use xlink:href="#exclamation-triangle-fill"/></svg>
        <div>
                ${requestScope.mensaje}
        </div>
        
</c:if>
<%
        /*
String error=(String)request.getAttribute("error");
String mensaje=(String)request.getAttribute("mensaje");
        if(error==null){
                error="";
        }else{
                mensaje="";
        }

out.print(error);
out.print(mensaje);
*/
%>
        </div>

</body>
</html>
