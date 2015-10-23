/**
 * 
 */
function getXHR(){
				try
				{
					xhr=new XMLHttpRequest();
				}
				catch(e){
					try
					{
						xhr=new ActiveXObject("Microsoft.XMLHTTP");
					}
					catch(e1){
						try
						{
							xhr=new ActiveXObject("Msxml2.XMLHTTP");
						}
						catch(e2)
						{
							alert("Unable to connect to server");
						}
					}
				}
				return xhr;
			}
			function ajaxing(page){
				var suffix=(page=="ActiveVisite")?"1":"";
				var req = document.getElementById(page).value;
				var url = page+".do?req="+req;
				xhr=getXHR();
				xhr.onreadystatechange=function(){
					if(xhr.readyState == 4)
					{
						document.getElementById("reponse"+suffix).innerHTML = xhr.responseText;
					}
					else
						document.getElementById("reponse"+suffix).innerHTML="";
				}
				xhr.open("get",url,true);
				xhr.send();
			}