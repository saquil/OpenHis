 	function activeMenuItem(menu){
 		var temp= document.getElementsByClassName("active");
 		var curr=temp[0];
 		curr.setAttribute("class","");
 		document.getElementById(menu).className="active";   		
 	}
 	
 	function selectSexe(sexe){
 		if(sexe == "masculin")
 			document.getElementById("masc").setAttribute("selected", "selected");
 		else
 			document.getElementById("fem").setAttribute("selected", "selected");
 	}
 	/*function selectSexeItem(){
 		var temp= document.getElementsBy("selected");
 		var curr=temp[0];
 		curr.setAttribute("class","");
 		elemt.setAttribute
 	}*/
 	
 	function submit(){
 		document.getElementById("submit").submit();
 	}
 	
 	function setTablePos(){
 		document.getElementById("autosugestTable").style.position="absolute";
 		document.getElementById("autosugestTable").style.border="1px solid black";
 		document.getElementById("autoSugestTable").style.top = document.getElementById("myBtn").offsetHeight + document.getElementById("search").offsetTop;
 		document.getElementById("autoSugestTable").style.left = document.getElementById("search").offsetLeft;
 		document.getElementById("autoSugestTable").style.width = document.getElementById("search").offsetWidth/2;
 	}
 	

 	
 	$(document).ready(function(){
	 	$("#search").keyup(function() {
	 		$.get("AutocompletionSERVLET", { nom: $("#search").val()},
	 			function(data){
	 				$("#autosugestTable").html(data);
	 				$('.autosugestTable td').click(function(i, obj) {
	 					$("#search").val($(this).text());
	 					$("#autosugestTable").html("");
	 				});
	 			});
	 	});
	 	
	 	
	 	//$("#profile").click(function(){
	        $("#profileBody").slideDown();
	    //});
	 	$("#close").click(function(){
	 		$("#profileBody").slideUp();
	 	});
	 	$(document).on('click', '.autosugestTable td', function(){
	 		 alert($(this).closest('tr').text());
	 		$("#search").val("toto");//$(this).val();
	 	});
 	});
 	
 	
 	
 	
