<!DOCTYPE html>
<html>
<head>
<title>Bootstrap 101 Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	media="screen">
<script src="http://code.jquery.com/jquery.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</head>
<body>
	<h1>Hello, world!</h1>
	<div class="row">
		<div class="span4">abc</div>
		<div class="span8">def</div>
	</div>
	<div class="row">
		<div class="span4">abc</div>
		<div class="span3 offset2">def</div>
	</div>
	<div class="row">
		<div class="span9">
			Level 1 column
			<div class="row">
				<div class="span6">Level 2</div>
				<div class="span3">Level 2</div>
			</div>
		</div>
	</div>
</body>
</html>