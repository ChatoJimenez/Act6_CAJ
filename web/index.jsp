<%-- 
    Document   : index
    Created on : 12 mar. 2021, 19:15:32
    Author     : jesgu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="misTags" uri="/WEB-INF/tlds/myTags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividad 6 - Computación Avanzada en Java</title>
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        <div class="container">
            <h1>Prueba de Tags Personalizados</h1>
            <p>Tag vacío:</p>
            <div class="tag">
                <!--Tag vacío-->    
                <misTags:nombreFecha nombre="Jesús Guillermo Jiménez Delgado"></misTags:nombreFecha>
            </div>
            <p>Tag con cuerpo:</p>
            <div class="tag">
                <!--Tag con cuerpo-->
                <misTags:tagInfoHora>Este es el resultado de un tag personalizado, el texto escrito aquí es el cuerpo del tag.</misTags:tagInfoHora>
            </div>
        </div>
    </body>
</html>


