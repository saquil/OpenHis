<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page isELIgnored="false" %> 

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title><c:out value="${sessionScope.user.nom}"/> | PROFILE</title>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/admin.css"></c:url>'>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src='<c:url value="inc/include/admin.js"></c:url>' ></script>
<script src='<c:url value="inc/include/jquery-1.11.2.js"></c:url>' ></script>
</head>


 
<c:if test="${empty sessionScope.user}">
        <c:redirect url="/index.jsp" />
</c:if>


<body class="body" onload="setTablePos();activeMenuItem('profile');">
   

	<!-- including the header -->
    <c:import url="/WEB-INF/admin/include/header.jsp"></c:import>
	
    
    <div class="body"></div>
    <div class="grad"></div>
    <!-- div class="header">
        <div>Open<span>HIS</span></div>
    </div -->	
    <br/>
    
    <div id="profileBody">  

    	<div class="row">
    		<div class="col-lg-6" id="profileForm">
		    	<form role="form" method="post" action='<c:url  value="/ProfileACTION.do"/>'>
		    		<fieldset>
		    			 <legend>Votre Profile: </legend>
		    			 
		    			  <div class="form-group">
						    <label for="compte">Compte:</label>
						    <input type="text" class="form-control" id="compte" name="compte"  value="<c:out value="${sessionScope.user.compte}"/>">
						  </div>
						  
						  <div class="form-group">
						    <label for="pwd">Password:</label>
						    <input type="password" class="form-control" id="pwd" name="password"  value="<c:out value="${sessionScope.user.password}"/>">
						  </div>
						 
						  <div class="form-group">
						    <label for="nom">Nom:</label>
						    <input type="text" class="form-control" id="nom" name="nom" value="<c:out value="${sessionScope.user.nom}"/>" />
						  </div>
						  
						  <div class="form-group">
						    <label for="prenom">Prenom:</label>
						    <input type="text" class="form-control" id="prenom" name="prenom"  value="<c:out value="${sessionScope.user.prenom}"/>">
						  </div>
						  
						   <select class="form-control" id="sexe" name="sexe">
							    <option value="masculin" id="masc">Masculin</option>
							    <option value="feminin" id="fem">Feminin</option>
						  </select>
						  
						  <div class="form-group">
						    <label for="dateNaissance">Date de Naissance:</label>
						    <input type="date" class="form-control" id="Date de Naissance:" name="date_naissance"  value="<c:out value="${sessionScope.user.date_naissance}"/>">
						  </div>
						  
						  <div class="form-group">
						    <label for="age">Age:</label>
						    <input type="text" class="form-control" id="age" name="age"  value="<c:out value="${sessionScope.user.age}"/>">
						  </div>
						  
						  <div class="form-group">
						    <label for="telephone">Telephone:</label>
						    <input type="text" class="form-control" id="telephone" name="num_telephone"  value="<c:out value="${sessionScope.user.num_telephone}"/>">
						  </div>
						  
						  <div class="form-group">
						    <label for="code_postale">Code Postale:</label>
						    <input type="text" class="form-control" id="code_postale" name="code_postale"  value="<c:out value="${sessionScope.user.code_postale}"/>">
						  </div>
						  
						  <div class="form-group">
						    <label for="ville">Ville:</label>
						    <input type="text" class="form-control" id="ville" name="ville"  value="<c:out value="${sessionScope.user.ville}"/>">
						  </div>
						  <div class="form-group">
						    <label for="pays">Adresse:</label>
						    <input type="text" class="form-control" id="pays" name="pays"  value="<c:out value="${sessionScope.user.pays}"/>">
						  </div>
						  
						  <div class="form-group">
						    <label for="adresse">Adresse:</label>
						    <input type="text" class="form-control" id="adresse" name="adresse"  value="<c:out value="${sessionScope.user.adresse}"/>">
						  </div>
						  
						  
						  <div class="row"> 
						  <button type="submit" class="btn btn-default col-lg-1">Modifier</button>
						  <button type="reset" class="btn btn-default col-lg-offset-1 col-lg-1">Reset</button> 
						  <button  id="close" class="btn btn-danger col-lg-offset-7 col-lg-1">Close</button>						  
						  </div> 
					</fieldset>
				</form>
		    </div>  
		</div>
		<table   id="autosugestTable"  class="autosugestTable">
			
		</table>
		
		
    </div>
    
    
    	
       
 </body>
 
 
 
 </html>
  