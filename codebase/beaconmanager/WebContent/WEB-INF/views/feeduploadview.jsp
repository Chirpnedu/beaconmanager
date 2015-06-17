<html xmlns:form="http://www.springframework.org/tags/form">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="images_extra/favicon.png">
    
    <!-- Custom styles for this template -->
    <link href="css/style.css" type="text/css" rel="stylesheet">
</head>

<jsp:include page="header.jsp"/>
<jsp:include page="sidebar.jsp"/>
<body class="content">
	<div class="homepagecontainer">
	  <form:form method="POST" commandName="feedUploadForm"
		enctype="multipart/form-data">
		Please select a file to upload: <br/>
		<span>
			<input type="file" name="file" class="fileupload"/><br/>
		</span>
				
		<span>
			<input type="submit" value="upload" class="fileupload"/>
		</span>
		</form:form>
	</div>
</body>
<jsp:include page="footer.jsp"/>
</html>