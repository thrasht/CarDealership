<nav class="navbar navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="home">
      	<img alt="" src="static/img/logo.png">
      </a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="home">Home<span class="sr-only">(current)</span></a></li>
        
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Vehículos<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="vehicles">Autos</a></li>
            <li class="divider"></li>
            <li><a href="#">Camionetas</a></li>
            <li class="divider"></li>
            <li><a href="#">Camiones</a></li>
          </ul>
        </li>
      </ul>
      
      <ul class="nav navbar-nav">
      <li><a href="appointments">Agendar cita</a></li>
      </ul>
      
      <ul id="loginButton" class="nav navbar-nav navbar-right">
        <li><a href="#">Login</a></li>
      </ul>
      
      <ul class="nav navbar-nav">
      <li><a href="aboutus">Acerca de nosotros</a></li>
      </ul>
      
      <ul id="loginForm" type="hidden" class="nav navbar-nav navbar-right">
      <form class="form-inline">
		  <div class="form-group">
		    <label for="email">Email</label>
		    <input type="email" class="form-control" name="email" placeholder="jane.doe@example.com">
		  </div>
		  <div class="form-group">
		    <label for="password">Password</label>
		    <input type="password" class="form-control" name="password">
		  </div>
		  <button type="submit" class="btn btn-default">Entrar</button>
		</form>
		</ul>
    </div>
  </div>
</nav>





