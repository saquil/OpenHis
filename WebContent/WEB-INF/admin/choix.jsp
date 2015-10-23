<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil & Renseignement</title>
<style type="text/css" media="screen">@import "./inc/accueil/default.css";</style>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/admin.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/cssRec.css"></c:url>'>
</head>
<body>
	<!-- including the header -->
<%--     <c:import url="/WEB-INF/admin/include/header.jsp"></c:import> --%>
<br>
<h2 class="head2">Accueil & Renseignement</h2>
<div class="choix">
<input class="button" type="image" src="inc/image/edit1new.png" onclick="document.location.href='AccueilHome.do'" style="cursor: hand; border: none" value="Enregistrer Patient"/>
<input class="button" type="image" src="inc/image/search1.png" onclick="document.location.href='Search.do'" style="cursor: hand; border: none" value="Chercher Patient"/>
<input class="button" type="image" src="inc/image/edit1.png" onclick="document.location.href='Edit.do'" style="cursor: hand; border: none" value="Modifier Patient"/>
<input class="button" type="image" src="inc/image/calendar2.png" onclick="document.location.href='Visite.do'" style="cursor: hand; border: none" value="Visite Patient"/>
<input class="button" type="image" src="inc/image/dash.png" onclick="document.location.href='Dashboard.do'" style="cursor: hand; border: none" value="Visite Patient"/>

<!-- 
<input class="button" type="button" value="Chercher Patient"></a>
<input class="button" type="button" value="Enregistrer Patient"></a>
<input class="button" type="button" value="Modifier Patient">
 -->
 
</div>
</body>
</html>