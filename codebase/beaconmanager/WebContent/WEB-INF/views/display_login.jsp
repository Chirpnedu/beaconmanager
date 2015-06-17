
 
<html xmlns:form="http://www.springframework.org/tags/form">
 <%@ page isELIgnored="false" %>
<head>
<meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="images/favicon.png">

    <!-- Custom styles for this template -->
    <link href="css/style.css" type="text/css" rel="stylesheet">
</head>

<script>
function submitCurrentPage(){
	document.getElementById("loginCredentials").action="${flowExecutionUrl}&_eventId=loginCredentialsEntered";
	document.getElementById("loginCredentials").submit();
}

</script>
<jsp:include page="header.jsp"/>
<body class="content">
	  <div class="logincontainer" style="margin-top: 50px;">
			<form id="loginCredentials" method="post"> 
	
				<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
	        	<div>
		            <div>
		                <input type="text" placeholder="User ID" name="userName" autofocus><br/><br/>
		                <input type="password" placeholder="Password" name="password">
		            </div>
		            <div class="checkbox">
		                <input type="checkbox" value="remember-me"> Remember me <br/> 
		            </div>
		            <button type="button" class="button" onclick="javascript:submitCurrentPage();">Sign in</button>
		
		            <div class="registration">
		                Don't have an account yet?
		                <a class="" href="http://localhost:8080/onedigital/registrationFlow?registrationHome">
		                    Create an account
		                </a>
		            </div>
	
	        	</div>
			</form>
		</div>
	</body>
<jsp:include page="footer.jsp"/>
</html>