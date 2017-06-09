<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Post Your Quote</title>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->

<!-- css files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
<link href="css/wickedpicker.css" rel="stylesheet" type='text/css' media="all" />
<link rel="stylesheet" href="css/jquery-ui.css" />
<!-- //css files -->

<!-- online-fonts -->
<link href="//fonts.googleapis.com/css?family=Amaranth:400,400i,700,700i" rel="stylesheet">
<!--//online-fonts -->

</head>
<body>
<div class="header">
	<h1>Post your Quote</h1>
</div>
<div class="w3-main">
	<!-- Main -->
	<div class="about-bottom">
		<div class="w3l_about_bottom_right two">
			<h2 class="tittle"><img src="images/logo.png" style="height:40px" alt=""><span>Facebook Developer Details</span></h2>
			<div class="book-form">

			    <form action="./signin">
					<div class="form-date-w3-agileits">
						<div class="form-agileits">
							<label> App ID :</label>
						</div>
						<div class="form-agileits-2">
							<input type="text" name="appId" placeholder="App ID" required="">
						</div>
						<div class="clear"> </div>
					</div>
					<div class="form-date-w3-agileits">
						<div class="form-agileits">
							<label> Secret ID :</label>
						</div>
						<div class="form-agileits-2">
							<input type="password" name="secretId" placeholder="Secret ID" required="">
						</div>
						<div class="clear"> </div>
					</div>
					<div class="form-date-w3-agileits">
						<div class="form-agileits">
							<label> Access Token :</label>
						</div>
						<div class="form-agileits-2">
							<input type="password" name="accessToken" placeholder="Access Token" required="">
						</div>
						<div class="clear"> </div>
					</div>
					<div class="make">
						  <input type="submit" value="Post your Quote">
					</div>
				</form>
			</div>
		</div>
		<div class="clear"> </div>
	</div>
</div>
</body>
</html>