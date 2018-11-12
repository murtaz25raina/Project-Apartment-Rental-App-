<%@page import="java.util.ArrayList"%>
<%@page import="apartmentpackage.ListingBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<ListingBean> ar20 = (ArrayList<ListingBean>)request.getAttribute("GodOne"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Owned Apartments</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
        function validate()
            {
                var yes2 = document.formi[0][1].value;
                
                var yes = document.formi[0][0].value;
                console.log(yes);
                if(yes2!="Request")
                {
                    alert("Request Already Approved");
                    return false;
                }
                else{
                 if (yes == "No")
                {
                    alert("There are currently no requests for this Apartment");
                    return false;
                }
                else
                {
                    alert("Request Approved");
                }
            }
            }            
        function func()
            {
                    var yes3 = document.formi10[1][0].value;
            
                if (yes3 === "No")
                {
                    alert("There are currently no requests for this Apartment");
                    return false;
                }
                else{
                    alert(" Request Cancelled");
                    return true;
                }
            }
      </script>
  <style>
    p {
    font-family: "Times New Roman", Times, serif;
    font-size: 30px;
}
  #lol {
    background-color: #E0F2F1;
}
.colorgraph {
  height: 5px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
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
  <div class="container-fluid" >
    <div class="navbar-nav mr-auto">
      <a class="navbar-brand" href="FirstPage.jsp">MyHOME</a>
    </div>
  </div>
</nav>
    <center><h3 class="rainbow"> My Apartment(s).</h3></center>
    <hr class="colorgraph">
      <%  if(!ar20.isEmpty()){
          for(int i=0;i<ar20.size();i++)
      { %>
      <div style="height:300px;" id="lol">
       <a href=<%= ar20.get(i).getImgLink()%> target="_blank" >
           <img src=<%= ar20.get(i).getImgLink()%> width="300" height="300" style="float:left;margin:0 20px 20px 0;"> </a>
      <p style="color:#9C27B0;">Email :<%= ar20.get(i).getUserEmail()%></p>
      <p style="color:#9C27B0;">State :<%= ar20.get(i).getState()%></p>
      <p style="color:#9C27B0;">Address :<%= ar20.get(i).getAddress()%></p>
      <p style="color:#9C27B0;">Bedrooms :<%= ar20.get(i).getBedrooms()%></p>
      <p style="color:#9C27B0;">Requested By :<%= ar20.get(i).getRequestedBy()%></p>
      <div class="row">
          <!----> 
          <form method="post" name="formi" action="ApproveRequest" onsubmit="return validate()">
          <input type="hidden" name="APi" value=<%=ar20.get(i).getRequestedBy()%> >
          <input type="hidden" name="APi2" value=<%=ar20.get(i).getRequestStatus()%> >
          <input type="hidden" name="APD" value=<%=ar20.get(i).getApId()%> >
          <button type="submit" class="btn btn-success">Approve Request</button>
      <!--<input type="submit" value="Approve Request">--></form>
      <form method="post" name="formi10" action="RejectRequest" onsubmit="return func()">
          <input type="hidden" name="APi3" value=<%=ar20.get(i).getRequestedBy()%> >
          <input type="hidden" name="lol" value=<%=ar20.get(i).getApId()%> >
          <button type="submit" class="btn btn-danger" >Reject Request</button>
          <!-- <input type="submit" value="Reject Request">--></form></div>
      </div>
      <hr class="colorgraph">
      <%}}%>
      
    <center><h3 class="rainbow"> You Have Reached The End of This Page.</h3></center>
    </body>
</html>
