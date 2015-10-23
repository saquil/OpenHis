<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic"  prefix="logic"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Connexion</title>
<style type="text/css">
	body header{
		display:none;
	}
</style>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/accueil/cssRec.css"></c:url>'>
</head>


<body>

	<!-- including the header -->
<%-- 	<c:import url="/WEB-INF/include/header.jsp"></c:import> --%>
	
	
<logic:present name="user">
	<logic:redirect action="adminHome.do"></logic:redirect>
</logic:present>
	
		<div class="body"></div>
		<div class="grad"></div>
		<!-- div class="header">
        <div>Open<span>HIS</span></div>
    </div -->
		<br/>
		<div class="row loginRow">
		<html:form action="/LoginAction" method="post" styleClass="col-xs-6">
			    <div class="form-group has-feedback">
	    			<input type="text" value="username" name="compte" class="form-control" placeholder="Username" />
	    			<i class="form-control-feedback glyphicon glyphicon-user"></i>
	    		</div>
	    		
	    		<div class="form-group has-feedback">
	    			<input type="password" value="password" name="password" class="form-control" placeholder="Username" />
	    			<i class="glyphicon glyphicon-lock form-control-feedback"></i>
	    		</div>
				
				<html:submit styleId="login" value="Login" styleClass="btn btn-default"/>
			
		</html:form>
		</div>
		
	
	
	
</body>
</html>

