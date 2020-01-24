<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div cssClass="container">
            <h1>Registrar</h1>
            <s:form action="registrarempleado" method="POST">
                <div class="form-group">
                    <s:textfield name="nombres" cssClass="form-control" id="nombres" placeholder="Ingrese sus nomnbres"></s:textfield>
                </div>
                <div class="form-group">
                    <s:textfield name="apellidos" cssClass="form-control" id="apellidos" placeholder="Ingrese sus apellidos"></s:textfield>
                </div>
                <div class="form-group">
                    <s:textfield name="dni" cssClass="form-control" id="dni" placeholder="Ingrese su DNI"></s:textfield>
                </div>
                <s:submit cssClass="btn btn-info" label="enviar"/>
            </s:form>
            <a href="listarempleado" class="btn btn-primary">Regresar al listado </a>
        </div>
    </body>
</html>
