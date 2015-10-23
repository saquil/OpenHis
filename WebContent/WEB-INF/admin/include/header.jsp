<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
<div>
    <div class="logo">
        <a href="index.jsp">
            <img src="inc/image/open_his_new2.png"/>
        </a>
    </div>
    <div id="divzer">
    		
    		<img id="lg" src="inc/image/receptionist.png">
    		<a><c:out value="${user.compte }"></c:out></a>
       		
       			<img id="lg" src="inc/image/position.png">
       		<a>
                <span>Reception</span>
            </a>
             <img id="lg" src="inc/image/logout.png" />
            <a href="<c:url value="/DeconnexionSERVLET" />">
                Logout
            </a>
               
            
   </div>
 </div>   
</header>
