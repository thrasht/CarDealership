<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">

<h2>Vehículos</h2>

<div class="row">
	<c:forEach items="${vehicleList}" var="vehicle">
		<section class="col-md-6">
			<p>${vehicle.id }</p>
			<p>${vehicle.typeId.type }</p>
			<p>${vehicle.brand }</p>
			<p>${vehicle.model }</p>
			<p>${vehicle.color }</p>
			<p>${vehicle.value }</p>
			<p>${vehicle.image }</p>
		</section>      
    </c:forEach>
	
</div>


</div>