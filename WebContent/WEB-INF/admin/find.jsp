<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page isELIgnored="false" %> 

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title><c:out value="${sessionScope.user.nom}"/> | CHERCHER</title>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/admin.css"></c:url>'>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" ></script>
<script src='<c:url value="inc/include/admin.js"></c:url>' ></script>
<script src='<c:url value="inc/include/jquery-1.11.2.js"></c:url>' ></script>
</head>


 
<c:if test="${empty sessionScope.user}">
        <c:redirect url="/index.jsp" />
</c:if>


<body class="body" onload="activeMenuItem('find');setTablePos();">
   

	<!-- including the header -->
    <c:import url="/WEB-INF/admin/include/header.jsp"></c:import>
	
    
    <div class="body"></div>
    <div class="grad"></div>
    <div class="header">
        <div>Open<span>HIS</span></div>
    </div>	
    <br/>
    
    <div id="body">  

    	<div class="row">
    		<div class="col-lg-6">
		    <form action="" method="post" class="input-group" id="form" role="form">
		      
		      <input  id="search" type="text" class="form-control" placeholder="Search With Compte Name">
		      
		      <span class="input-group-btn has-feedback has-feedback-left">
		        <button class="btn btn-default" type="button" onclick="submit()"><i class="glyphicon glyphicon-search"></i></button>
		      </span>
		    </form>
		    </div>  
		</div>
		<table   id="autosugestTable"  class="autosugestTable">
			
		</table>
		
		
    </div>
    
    
    	
       
 </body>
 
 
 
 </html>
  