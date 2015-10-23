<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css" media="screen">@import "./inc/accueil/styles.css";</style>
<style type="text/css" media="screen">@import "./inc/accueil/default.css";</style>
<title>Nouveau Patient</title>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/cssRec.css"></c:url>'>
</head>
<body>
<div id="body-wrapper">
	<div id="content">
<html:form action="RegisterAction.do">
<h2 class="head3">Créer Patient</h2>
<hr>
<table style="width: 70%; margin-left: 15%; margin-right: 15%;"  class="dataTable" id="form" border="1" cellpadding="2" cellspacing="0">
	<tr>
		<td><h4>Nom Patient</h4></td>
		<td class="searchLabel">Nom*</td>
		<td class="searchLabel">Prénom*</td>
	</tr>
	<tr>
		<td></td>
		<td>
			<html:text property="patient.nom" value="${ patient.nom }" styleClass="inputText"/>
		</td>
		<td>
			<html:text property="patient.prenom" styleClass="inputText"/>
		</td>
	</tr>
	<tr>
		<td><h4>IPP</h4></td>
		<td class="searchLabel">Identifier*</td>
	</tr>
	<tr>
		<td></td>
		<td><html:text property="patient.ipp" styleClass="inputText"/></td>
	</tr>
	<tr>
		<td><h4>Information démographique</h4></td>
		<td class="searchLabel"> Sexe*</td>
		<td class="searchLabel">Date de naissance <br /><i>(format:jj/mm/aaaa)</i></td>
		<td class="searchLabel">Age </td>
	</tr>
	<tr>
		<td></td>
		<td>
			<label>
				<input type="radio" name="patient.sexe" value="Male" ${ patient.sexe == 'Male' ? 'checked' : '' } />
				Male
			</label>
			<label>
				<input type="radio" name="patient.sexe" value="Femelle" ${ patient.sexe == 'Femelle' ? 'checked' : '' } />
				Femelle
			</label>
		</td>
		<td>
			<html:text property="patient.date_naissance" value="${ patient.date_naissance }" styleClass="inputText"/>
		</td>
		<td>
			<html:text property="patient.age" value="${patient.age }" disabled="true" styleClass="inputText" style="width: 80px; cursor:not-allowed;"/>
		</td>
	</tr>
	<tr>
	    <td><h4>Information de contact</h4></td>
	</tr>
	<tr>
		<td></td>
		<td class="searchLabel"> Pays</td>
		<td class="searchLabel">Ville</td>
		<td class="searchLabel">Code Postale</td>
	</tr>
	<tr>
		<td></td>
		<td><html:text property="patient.pays" styleClass="inputText"/></td>
		<td><html:text property="patient.ville" styleClass="inputText"/></td>
		<td><html:text property="patient.code_postale" styleClass="inputText"/></td>
	</tr>
	<tr>
		<td></td>
		<td class="searchLabel">Adresse</td>
		<td></td>
		<td class="searchLabel">Telephone</td>
	</tr>
	<tr>
		<td></td>
		<td colspan="2"><html:textarea property="patient.adresse" value="${patient.adresse }" styleClass="inputText" style="width: 527px;
		height: 79px;"/>
		</td>
		<td style="vertical-align: top;"><html:text property="patient.num_telephone" styleClass="inputText"/></td>
    </tr>
    <tr>
	    <td>
	    	<html:submit styleClass="button">Sauvegarder</html:submit>
	    </td>
    </tr>
</table>
</html:form>
</div>
</div>
</body>
</html:html>