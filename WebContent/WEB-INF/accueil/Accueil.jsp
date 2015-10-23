<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css" media="screen">@import "./inc/accueil/default.css";</style>
<style type="text/css" media="screen">@import "./inc/accueil/styles.css";</style>
<script type="text/javascript" src="./inc/accueil/ajax.js"></script>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/cssRec.css"></c:url>'>
<title>Accueil</title>
</head>
<body onload="ajaxing('ActiveVisite')">
<div id="body-wrapper">
	<div id="content">
<fieldset>
<div id="active-visits_wrapper" class="dataTables_wrapper">
<table style="width: 70%; margin-left: 15%; margin-right: 15%;"  class="dataTable" id="form" border="1" cellpadding="2" cellspacing="0">
<html:form action="AccueilAction.do">
<legend><h3 class="head3">Créer Patient</h3></legend> 
<p id="rempchapms">Remplir les champs</p>
	<tr>
		<td class="searchLabel">Nom *</td>
		<td><html:text property="patient.nom" styleClass="inputText"/></td>
	</tr>
	<tr>
		<td class="searchLabel">Date de naissance *</td>
		<td>
			<html:select property="birthday_day" styleClass="inputText" style="width: 100px;">
				<html:option value="-1">Jour</html:option>
				<c:forEach begin="1" end="31" step="1" varStatus="status">
					<logic:lessThan value="10" name="status" property="index">
						<html:option value="0${status.index }">
							<c:out value="0${status.index }"></c:out>
						</html:option>
					</logic:lessThan>
					<logic:greaterEqual value="10" name="status" property="index">
						<html:option value="${status.index }">
							<c:out value="${status.index }"></c:out>
						</html:option>
					</logic:greaterEqual>
				</c:forEach>
			</html:select>
			<select  name="birthday_Month" class="inputText" style="width: 100px;">
<!-- 			id="Birthday_Month" -->
			<option value="-1">Mois</option>
			<option value="01">Jan</option>
			<option value="02">Feb</option>
			<option value="03">Mar</option>
			<option value="04">Apr</option>
			<option value="05">May</option>
			<option value="06">Jun</option>
			<option value="07">Jul</option>
			<option value="08">Aug</option>
			<option value="09">Sep</option>
			<option value="10">Oct</option>
			<option value="11">Nov</option>
			<option value="12">Dec</option>
			</select>
			
			<select name="birthday_Year" class="inputText" style="width: 100px;"> 
				<option value="-1">Année</option>
				<c:forEach end="116" begin="1" step="1" varStatus="status" >
					<option value="${ 2016-status.index }"><c:out value="${2016-status.index }"/></option>
				</c:forEach>
			</select>
		<span class="searchLabel">ou Age</span>
		<html:text property="patient.age" styleClass="inputText" style="width: 80px;"/></td>
	</tr>
    <tr>
		<td class="searchLabel">Sexe *</td>
		<td>
			<label><html:radio property="patient.sexe" value="Male"/>Male</label>
			<label><html:radio property="patient.sexe" value="Femelle"/>Femelle</label>
		</td>
	</tr>
	<tr>
		<td><html:submit styleClass="button">Suivant</html:submit></td>
	</tr>
</html:form>
</table>
</div>
</fieldset>
</div>
</div>
</body>
</html>