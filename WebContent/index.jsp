<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Soukwinder G</title>
<LINK href="css/styles.css" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href = "css/bootstrap.css" rel = "stylesheet">
<link href = "css/styles.css" rel = "stylesheet">
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<style type="text/css"></style>
<script src="http://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
<script src="js/app-ajax.js" type="text/javascript"></script>

</head>
<body>
<div class= "navbar-default navbar-static-top" role="navigation">
			<div class="container">
			<div class="navbar-header">				
				<button type ="button" class="navbar-toggle" data-toggle ="collapse" data-target =".navbar-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="index.htm" class="navbar-brand">Groep 3</a>
				
			</div>
			
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-left">
						<li class="active"><a href="index.htm">Home</a></li>
						<li><a href="#">About</a></li>
						<li><a href="pages/contact.htm">Contact</a></li>
						<li><a href="pages/kukar.htm">Kukar</a></li>	
						</ul>
						<!-- <ul class="nav navbar-nav navbar-right">
						<li><a href="#"><i class="fa fa-facebook-square" style="font-size:25px; padding-left: 5px; padding-right:5px;"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter-square" style="font-size:25px;padding-left: 5px; padding-right:5px;"></i></a></li>
						<li><a href="#"><i class="fa fa-youtube-play"style="font-size:25px;padding-left: 5px; padding-right:5px;"></i></a></li>
						</ul> -->
				</div>
				
			</div>
			
		</div>
		
		<div class="container">
		<div class="row">
			<div class = "col-md-3">
					<h3 align="center"><a href="#">Moederborden</a></h3>
					<p align="center"><img id="moederbord" onclick="moeder()" align="center" src="img/moe.jpg"></img></p>
					<p id="moederbordResponse" align="center"></p>
			
			</div>
			<div class = "col-md-3">
					<h3 align="center"><a href="#">Processoren</a></h3>
					<p align="center"><img id="processor" onclick="proces()" align="center" src="img/pro.jpg"></img></p>
					<p id="processorResponse" align="center"></p>
			
			</div>
			<div class = "col-md-3">		
			</div>
			<div class = "col-md-3">
					<h3 align="center"><a href="#">Result</a></h3>
					
					<p id="moe_k"></p>
					<p id="pro_k"></p>
			
			</div>
			

			
		</div>
		    <div class="scrollbar" id="style-1">
      <div class="force-overflow"></div>
    </div>
		
	</div> 


<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
</body>
</html>