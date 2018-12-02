<% String spot=(String)session.getAttribute("Email");%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Welcome to MyHome</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      p{color :black;
      font-size: 15px;
      }
      body {
  background: url(hol.jpg) no-repeat;
  background-size: 100%;
  background-size: cover;
  background-position: 100% top;
    background-attachment: fixed;
      }
      .rainbow {
  
   /* Font options */
  font-family: 'Pacifico', cursive;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
  
   /* Chrome, Safari, Opera */
  -webkit-animation: rainbow 3s infinite; 
  
  /* Internet Explorer */
  -ms-animation: rainbow 3s infinite;
  
  /* Standar Syntax */
  animation: rainbow 3s infinite; 
}

/* Chrome, Safari, Opera */
@-webkit-keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}	
}

/* Internet Explorer */
@-ms-keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}	
}

/* Standar Syntax */
@keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}
}

  </style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="FirstPage.jsp">MyHOME</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="userApart.jsp">Upload Apartment</a></li>
      <li>|</li>
      <li class="active"><a href="MyOrders">My Apartments</a></li>
      <li>|</li>
      <li class="active"><a href="ListOforderz">My Orders</a></li>
      <li>|</li>
      <li class="active"><a href="Fback">Feedback</a></li>
    </ul>
      <form class="navbar-form navbar-right" method="post" action="LogoutController">
     <input class="btn btn-default" type="submit" value="LogOut">
     </form>
      <form class="navbar-form navbar-right" method="post" action="SearchForAparts" >
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Enter the state" name="ste" required>
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
  </div>
</nav>
    <div> 
<div class="container">
     <h4><b><%
		if (session != null) {
			if (session.getAttribute("Email") != null) {
				String name = (String) session.getAttribute("Email");
				out.print("Hello, " + name);
			} else {
				response.sendRedirect("LogIn.jsp");
			}
		}
	%></b></h4>
    <h2 class="rainbow">About Us</h2><br>
  <p><b>There are millions of homes out there. Let's find the one that's perfect for you.</b></p>
  <br>
  <b><p>At MyHOME, our mission is to find you a home and our method is trust and transparency.</p>
      <p>With tons of homes and apartments for rent in almost every state, city, and neighborhood across</p>
      <p>the nation, we are here to help you find your next home.</p>
  <br><br><br><br>
  <p>Here is how it works: first, we get to know you. You will answer a </p>
  <p>few simple questions and we will find the best matches ,just for you.</p>
  <p>Then, we mix and match your personalized results,making it easy to</p>
  <p>discover places with the perfect combination of price, location and</p> 
  <p>amenities.From there, we help you figure out which listings are best</p>
  <p>to visit and eventually lease, showing you up-to-date pricing and</p>
  <p>availability, rent specials, and much more. After all, everyone deserves</p> 
  <p>a home they love <3 .</p></b>
</div>
</body>
</html>

