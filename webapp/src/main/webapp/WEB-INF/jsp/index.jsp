<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
</head>
<body>
<div class="row">
<header>


<div class="layer">
</div>

<s:include value="include/nav.jsp"></s:include> 




</header>
</div>

<div class="container justify-content-center" id="containerAccueil">
	
		<div id="sectionAccueil">
		<div class="row justify-content-center"> 
		
			<h1 class="text-center"> Médiathèque Biblio OCR</h1>
		

	
		</div>
		
			<div class="row justify-content-center m-2 pt-5" style="text-align:center"> 
			Bienvenue sur le site de la médiathèque Biblio OCR
			</div>
			<div class="row justify-content-center m-2 pb-5" style="text-align:center">
			Vous pouvez consulter les ouvrages disponibles ou vous connecter à votre espace personnel
			</div>
			
			<div class="row justify-content-center m-2" style="text-align:center"> 
			
			<s:if test="#session.user">
          
            <s:a action="acces_perso" class="btn btn-primary my-2 my-sm-0 justify-content-right m-3">Espace personnel</s:a>

              		
    		</s:if>
    			<s:else>
			 <s:a action="Login" class="btn btn-primary my-4 my-sm-0 justify-content-right m-3"><i class="fa fa-lock m-1"></i> Connexion</s:a>
    			</s:else>
    		</div>
			
			
			
			

    		
    		
			
			<div class="row justify-content-center">
					 <s:actionmessage/>
					<s:actionerror/>
			</div>		
    		
    		
    		

    		</div>
    		
			</div>





<footer>
<s:include value="include/footer.jsp"></s:include> 
</footer>
</body>
</html>