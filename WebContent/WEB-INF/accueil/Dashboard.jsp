<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Dashboard</title>
	<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/dashboard.css"></c:url>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/default.css"></c:url>'>
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
	<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/cssRec.css"></c:url>'>
	<script type="text/javascript">
		hidden=true;
		function showContact(){
			if (hidden==true){
				document.getElementById("contactInfoContent").style.display="block";
				hidden=false;
			}
			else{
				document.getElementById("contactInfoContent").style.display="none";
				hidden=true;
			}
		}
	</script>
</head>
<body>
	<logic:empty name="patient">
		<logic:redirect action="Search.do"></logic:redirect>
	</logic:empty>
	<logic:empty name="service">
	<logic:redirect action="ServiceAction.do"></logic:redirect>
	</logic:empty>
	<logic:empty name="done">
		<logic:redirect action="VisiteAllAction.do"></logic:redirect>
	</logic:empty>
	<div id="body-wrapper">
	<div id="content">
		<div class="patient-header ">
	    <div class="demographics">
	        <h1 class="name">
	            <span>
	            	<bean:write name="patient" property="nom"/>
	            	<bean:write name="patient" property="prenom"/>
	            	&nbsp;
	            </span>
	            <span class="gender-age">
	                <span><bean:write name="patient" property="sexe"/>&nbsp;</span>
	                <span>
	                	<bean:write name="patient" property="age"/> ans
	                	(<bean:write name="patient" property="date_naissance"/>)
	                </span>
	                <span class="edit-info">
	                	<small><a href="Edit.do">Modifier</a></small>
	                </span>
	                <a href="#" id="patient-header-contactInfo" class="contact-info-label" onClick="showContact()">Contacter</a>
	            </span>
	            <div id="contactInfoContent">
					<div class="contact-info-inline">
					    <span>
					    	<bean:write name="patient" property="adresse"/>, 
					    	<bean:write name="patient" property="ville"/>, 
					    	<bean:write name="patient" property="pays"/>
					    	<em>Adresse</em></span>
					    	&nbsp;
					    <span class="left-margin">
					    	<bean:write name="patient" property="num_telephone"/>
					    	<em>Numero de Telephone</em>
					    </span>
					</div>
	            </div>
	        </h1>
	        <logic:present name="patient" property="last">
			<logic:empty name="patient" property="last.date_fin">
	            <div class="active-visit-started-at-message">
	                Active Visit - <bean:write name="patient" property="last.date_debut"/>
	            </div>
	            <div class="active-visit-message">
	                <bean:write name="patient" property="last.type"/>
	            </div>
	        </logic:empty>
			</logic:present>
	    </div>
	    <div class="identifiers">
	        <em>Patient IPP</em>
	        <span><bean:write name="patient" property="ipp"/></span>
	    </div>
	</div>

	<div class="clear"></div>

	<div id="container">
	    <div class="dashboard clear">
<!-- 	    	<div class="info-container column"> -->
<!-- 		    	<div class="info-section"> -->
<!-- 				    <div class="info-header"> -->
<!-- 				        <i class="icon-calendar"></i> -->
<!-- 				        <h3>APPOINTMENTS</h3> -->
<!-- 				    </div> -->
<!-- 				    <div class="info-body"> -->
<!-- 				    	<ul> -->
<!-- 				    		<li class="clear"> -->
<!-- 						    	<a class="visit-link" href="#">20.May.2015</a> -->
<!-- 								<div class="tag">ServiceA</div> -->
<!-- 							</li> -->

<!-- 				    		<li class="clear"> -->
<!-- 						    	<a class="visit-link" href="#">19.May.2015</a> -->
<!-- 								<div class="tag">ServiceB</div> -->
<!-- 							</li> -->
<!-- 						</ul>			    	 -->
<!-- 				    </div> -->
<!-- 				</div> -->
<!-- 	    	</div> -->
	    	<div class="info-container column">
		    	<div class="info-section">
				    <div class="info-header">
				        <i class="icon-calendar"></i>
				        <h3>VISITS</h3>
				    </div>
				    <div class="info-body">
				    	<ul>
				    		<logic:present name="visites">
				    		<logic:iterate id="visite" name="visites">
				    			<li class="clear">
						    	<a class="visit-link" href="#">
						    		<bean:write name="visite" property="time_debut"/>
						    		<logic:present name="visite" property="date_fin">
						    			- <bean:write name="visite" property="time_fin"/>
						    		</logic:present>
						    	</a>
								<div class="tag"><bean:write name="visite" property="service.nom"/></div>
								</li>
				    		</logic:iterate>
				    		</logic:present>
						</ul>
				    </div>
				</div>
	    	</div>
	    	<div class="action-container column">
	    		<div class="action-section">
                    <ul>
                        <h3>Current Visit Actions</h3>
                        <li>
                        <logic:present name="patient" property="last">
                        	<logic:empty name="patient" property="last.date_fin">
                        		<li><a href="VisiteAction.do?end=end">End visit</a></li>
                        	</logic:empty>
                        </logic:present>
                        </li>
                    </ul>
	            </div>
			</div>
	    </div>
	</div>
	<logic:empty name="patient" property="last">
		<div class="dashboard clear">
			<h2 class="sectionHeader">Commencer une Nouvelle Visite</h2>
			<html:form action="VisiteAction.do">
				<table>
					<tr>
						<td>Visit Type</td>
						<td>
								<html:select property="type">
									<html:option value="hostpitalisation"></html:option>
									<html:option value="urgence"></html:option>
									<html:option value="rendez-vous du jour"></html:option>
									<html:option value="consultation"></html:option>
								</html:select>
						</td>
					</tr>
					<tr>
						<td>Service</td>
						<td>
								<html:select property="service">
									<html:optionsCollection name="service" label="nom" value="nom"/>
								</html:select>
						</td>
					</tr>
				</table>
				<!--<html:submit>Valider >></html:submit>-->
				<input class="button" value="Valider" type="submit">
			</html:form>
		</div>
	</logic:empty>
	<logic:present name="patient" property="last.date_fin">
		<div class="dashboard clear">
			<h2 class="sectionHeader">Commencer une Nouvelle Visite</h2>
			<html:form action="VisiteAction.do">
				<table>
					<tr>
						<td>Visit Type</td>
						<td >
								<html:select property="type">
									<html:option value="hostpitalisation"></html:option>
									<html:option value="urgence"></html:option>
									<html:option value="rendez-vous du jour"></html:option>
									<html:option value="consultation"></html:option>
								</html:select>
						</td>
					</tr>
					<tr>
						<td>Service</td>
						<td>
								<html:select property="service">
									<html:optionsCollection name="service" label="nom" value="nom"/>
								</html:select>
						</td>
					</tr>
				</table>
				<!--<html:submit>Valider >></html:submit>-->
				<input class="button" value="Valider" type="submit">
			</html:form>
		</div>
	</logic:present>
</div>
</div>

</body>
</html>