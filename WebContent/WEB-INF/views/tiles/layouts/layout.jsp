<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title><tiles:getAsString name="title" /></title>
	<link href="<c:url value='/static/css/bootstrapSpacelab.min.css' />"  rel="stylesheet"></link>
	<link href="<c:url value='/static/css/mystyle.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/full-slider.css' />" rel="stylesheet"></link>
</head>
 
<body>
	
		<section>
			<tiles:insertAttribute name="menu" />
		</section>
		
		
		<tiles:insertAttribute name="header" />
		
		 
		
	    <tiles:insertAttribute name="body" />
		 
		
		<footer>
			<tiles:insertAttribute name="footer" />
		</footer>
		
	    
	    
    
		<script src="static/js/jquery-2.2.4.js"></script>
	    <script src="static/js/bootstrap.min.js"></script>
	    <script src="static/js/myscript.js"></script>
	    <!-- Script to Activate the Carousel -->
	    <script>
	    $('.carousel').carousel({
	        interval: 5000 //changes the speed
	    })
	    </script>
</body>
</html>