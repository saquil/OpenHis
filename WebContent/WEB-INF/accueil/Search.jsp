<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css" media="screen">@import "./inc/accueil/default.css";</style>
<style type="text/css" media="screen">@import "./inc/accueil/styles.css"</style>
<script type="text/javascript" src="./inc/accueil/ajax.js"></script>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/cssRec.css"></c:url>'>
<title>Accueil</title>
</head>
<body>
<br>
<div id="body-wrapper">
	<div id="content">
<fieldset>
<legend><h3>Rechercher </h3></legend> 
	<div id="active-visits_wrapper" class="dataTables_wrapper" role="grid">
		<div id="active-visits_filter" class="dataTables_filter">
			<label class="searchLabel">
				Recherche 
			<input class="inputText" type="text" id="AjaxAction" onInput="ajaxing('AjaxAction')">
			</label>
		</div>
	<table id="reponse" style="width: 100%;" aria-describedby="active-visits_info" class="dataTable" id="active-visits" border="1" cellpadding="2" cellspacing="0" width="100%">
	</table>
	</div>
</fieldset>
</div>
</div>
</body>
</html>
