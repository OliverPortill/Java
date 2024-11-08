<!DOCTYPE HTML>
<html lang="es">
  <head>
    <meta charset="UTF-8"/>
    <title>Primera APP en Java Website</title>
    <link rel = "stylesheet" href = "style.css"/>
    <link rel = "stylesheet" href = "bootstrap.min.css"/>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Menú</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contacto</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Más ocpiones
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Almacén</a></li>
            <li><a class="dropdown-item" href="#">Productos</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>

    <div class="container">
      <h1>Formulario de Login</h1>
      <div class="cube">
        <h2 class = "titulo">Complete el formulario</h2>
        <marquee class="subtitulo" >Lea los términos</marquee>
        
        <form method="POST" action="login">
          <label for="email">Email</label>
          <input id="email" name="email" type="email" class = "form-control " placeholder="Email" required/>
          
          <label for="password">Contraseña</label>
          <input id="password" name="password" class = "form-control" type="password" placeholder="Contraseña" required/>
          
          <button type="submit" class = "btn btn-outline-success">Iniciar sesión</button>
        </form>
        
        <a href="#">¿Olvidaste tu contraseña?</a>
      </div>
    </div>
  </body>
  <script src="bootstrap.bundle.min.js"></script>
</html>
