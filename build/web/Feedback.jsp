<%@page import="apartmentpackage.FeedbackBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<FeedbackBean> AR = (ArrayList<FeedbackBean>)request.getAttribute("Apt"); %>
<% System.out.print(AR.size());%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .form-gradient .header ,#form107{
  border-top-left-radius: .3rem;
  border-top-right-radius: .3rem; }

#form107,.form-gradient input[type=text]:focus:not([readonly]) {
  border-bottom: 1px solid #fd9267;
  box-shadow: 0 1px 0 0 #fd9267; }

#form107,.form-gradient input[type=text]:focus:not([readonly]) + label {
  color: #4f4f4f; }

.form-gradient textarea.md-textarea:focus:not([readonly]) {
    border-bottom: 1px solid #fd9267;
    box-shadow: 0 1px 0 0 #fd9267; }


.form-dark .md-form label {
  color: #fff; }

#form107,.form-dark input[type=text]:focus:not([readonly]) {
  border-bottom: 1px solid #00C851;
  -webkit-box-shadow: 0 1px 0 0 #00C851;
  box-shadow: 0 1px 0 0 #00C851; }

.form-dark input[type=text]:focus:not([readonly]) + label {
  color: #fff; }

.form-dark textarea.md-textarea:focus:not([readonly]) {
    border-bottom: 1px solid #00C851;
    box-shadow: 0 1px 0 0 #00C851;
    color: #fff; }

.form-dark textarea.md-textarea  {
    color: #fff;
}

.form-dark .form-control, .form-dark .form-control:focus {
    color: #fff;
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
        <br>
     <% int count=0;
          for(int j=AR.size()-1;j>=0 && count<3;j--)
      { count++;%>
      <div class="panel panel-success">
      <div class="panel-heading">Email :<%= AR.get(j).getEmail20()%></div>
      <div class="panel-body">Feedback :<%= AR.get(j).getFeedback20()%></div>
    </div>
      <% }%>
        <form method="post" action="Insertfeedback" onsubmit="return validate(this)">
         <div class="md-form">
         <i class="fa fa-pencil prefix grey-text"></i>
         <label for="form107">Your Feedback</label>
        <textarea name="cmnt" id="form107" class="md-textarea form-control" rows="4"></textarea>
          </div>
      
            <button type="submit" class="btn btn-success">Post Feedback</button>
        </form>
        <script>
            function validate(form){
                var regex = /(<([^>]+)>)/ig;
                form[0].value = form[0].value.replace(regex, "");
                if (form[0].value === "")
                    return false;
                else
                    return true;
            }
        </script>
    </body>
</html>
