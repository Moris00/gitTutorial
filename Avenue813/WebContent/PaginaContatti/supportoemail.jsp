<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<style><%@include file="formemail.css"%></style>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Pagina Assistenza</title>

</head>
<body>
            <div class="head">
				<%@include file="../../PaginaUtili/header.jsp"%>
            </div>
            
 <form name="formemail" method="post" action="?send=1">
  <h1 align="center">ASSISTENZA E SUPPORTO</h1>
  <div class="campo">
  	<fieldset class="fields"> 
  		<legend >Risolviamo il problema insieme</legend> 
  		
  		<label for="name">Name</label> <input type="text"  id="name" name="name" maxlength="30" placeholder="Matteo" > 
  		<br> <br> 
  		<label for="surname">Surname</label> <input type="text" id="surname" name="surname" maxlength="30" placeholder="Gregorio">
  		<br> <br>  
  		<label for="email">Email</label> <input type="email" id="email" name="email" required maxlength="40" placeholder="matteogregorio@gmail.com"> 
  		<br> <br>
  		 <label for="phone">Phone</label> <input type="phone" id="phone" name="phone" maxlength="10" placeholder="+39 3272256741"> 
  		 <br> <br> 
  		 
  		 <label for="subject">Subject</label> 
  		 <select id="subject" name="subject"> 
  		 
  		 <option value="payment">Payment</option> 
  		 <option value="rhesus">Rhesus</option> 
  		 <option value="Report a bug">Report a bug</option> 
  		 </select> 
  		 
  		 <br> <br> <br> 
  		  <label id="message_label" for="message">Message</label><br> <textarea id="message" name="message" id="" cols="80" rows="8"></textarea>
  		   <br> <br> 
  		   
  		    <label for="file">Upload a file</label> 
  		    <input type="file" id="file" name="file" multiple > 
  		  <br> <br> 
  		    <input type="submit" id="submit" value="Send details"> </fieldset> 
  		    </div>
 </form>


</body>
</html>