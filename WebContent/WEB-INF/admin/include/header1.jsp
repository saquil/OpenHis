<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<nav class="navbar navbar-default navbar-fixed-top">
	  <div class="container-fluid" id="c-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href='<c:url value="#"></c:url>'>OpenHIS</a>
	    </div>
	    <div>
	      <ul class="nav navbar-nav">
	        <li id="home" class="active"><a href='<c:url value="/adminHome.do"></c:url>'>Home</a></li>
	        <li id="find"><a href='<c:url value="/adminFind.do" />'>Chercher</a></li>
	        <li id="add"><a href="#">Ajouter</a></li>
	        <li id="modify"><a href="#">Modifier</a></li>
            <li id="delete"><a href="#">Supprimer</a></li>
	      </ul>
	    </div>
             
            <ul class="nav navbar-nav navbar-right" id="drpdwn">
                <li class="dropdown" id="profile">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" id="dropdown">Mon compte <span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href='<c:url value="/ProfileSERVLET"/>'>Profile</a></li>
                    <li class="divider"></li>
                    <li><a href='<c:url value="/DeconnexionSERVLET" />'>Deconnexion</a></li>
                  </ul>
                </li>
            </ul>
	  </div>
</nav>
