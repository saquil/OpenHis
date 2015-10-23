<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page isELIgnored="false" %> 

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title><c:out value="${sessionScope.user.nom}"/> | HOME</title>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/login/login-styles.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/main.css"></c:url>'>
<link rel="stylesheet" type="text/css" href='<c:url value="inc/include/admin.css"></c:url>'>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine" />


</head>
 
<c:if test="${empty sessionScope.user}">
        <c:redirect url="/index.jsp" />
</c:if>


<body class="body">
   

	<!-- including the header -->
    <c:import url="/WEB-INF/admin/include/header.jsp"></c:import>
	
    
    <div class="body"></div>
    <div class="grad"></div>
    <!-- div class="header">
        <div>Open<span>HIS</span></div>
    </div -->	
    <br/>
    
    <div id="body">    
	    <h1>Welcome <span id="compte"><c:out value="${sessionScope.user.nom}"/> </span>, you're curently logged in as: <span id="compte"><c:out value="${sessionScope.user.compte}"/> </span>.</h1>
	
            <html:form action="/LoginAction" method="post">
		
	    </html:form>  
	    <html:link action="AccueilHome">Click Here to Continue</html:link>
    </div>     
 </body>
 
 
 
 </html>
  