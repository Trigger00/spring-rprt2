<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Bootstrap Admin Theme</title>

<!-- Bootstrap Core CSS -->
<link
	href="${pageContext.request.contextPath}/public//bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link
	href="${pageContext.request.contextPath}/public//bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="${pageContext.request.contextPath}/public//dist/css/sb-admin-2.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="${pageContext.request.contextPath}/public//bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<script type="text/javascript">
	function OpenInNewTab(url) {
		var win = window.open(url, '_blank');
		win.focus();
	}
</script>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">SB Admin v2.0</a>
			</div>
			<!-- /.navbar-header -->

			<ul class="nav navbar-top-links navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i
						class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-messages">
						<li><a href="#">
								<div>
									<strong>John Smith</strong> <span class="pull-right text-muted">
										<em>Yesterday</em>
									</span>
								</div>
								<div>Lorem ipsum dolor sit amet, consectetur adipiscing
									elit. Pellentesque eleifend...</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<strong>John Smith</strong> <span class="pull-right text-muted">
										<em>Yesterday</em>
									</span>
								</div>
								<div>Lorem ipsum dolor sit amet, consectetur adipiscing
									elit. Pellentesque eleifend...</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<strong>John Smith</strong> <span class="pull-right text-muted">
										<em>Yesterday</em>
									</span>
								</div>
								<div>Lorem ipsum dolor sit amet, consectetur adipiscing
									elit. Pellentesque eleifend...</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>Read
									All Messages</strong> <i class="fa fa-angle-right"></i>
						</a></li>
					</ul> <!-- /.dropdown-messages --></li>
				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-tasks">
						<li><a href="#">
								<div>
									<p>
										<strong>Task 1</strong> <span class="pull-right text-muted">40%
											Complete</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="40" aria-valuemin="0"
											aria-valuemax="100" style="width: 40%">
											<span class="sr-only">40% Complete (success)</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li> -->
						<li><a href="#">
								<div>
									<p>
										<strong>Task 2</strong> <span class="pull-right text-muted">20%
											Complete</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
											style="width: 20%">
											<span class="sr-only">20% Complete</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<p>
										<strong>Task 3</strong> <span class="pull-right text-muted">60%
											Complete</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-warning"
											role="progressbar" aria-valuenow="60" aria-valuemin="0"
											aria-valuemax="100" style="width: 60%">
											<span class="sr-only">60% Complete (warning)</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<p>
										<strong>Task 4</strong> <span class="pull-right text-muted">80%
											Complete</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-danger"
											role="progressbar" aria-valuenow="80" aria-valuemin="0"
											aria-valuemax="100" style="width: 80%">
											<span class="sr-only">80% Complete (danger)</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>See
									All Tasks</strong> <i class="fa fa-angle-right"></i>
						</a></li>
					</ul> <!-- /.dropdown-tasks --></li>
				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-alerts">
						<li><a href="#">
								<div>
									<i class="fa fa-comment fa-fw"></i> New Comment <span
										class="pull-right text-muted small">4 minutes ago</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
										class="pull-right text-muted small">12 minutes ago</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-envelope fa-fw"></i> Message Sent <span
										class="pull-right text-muted small">4 minutes ago</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-tasks fa-fw"></i> New Task <span
										class="pull-right text-muted small">4 minutes ago</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-upload fa-fw"></i> Server Rebooted <span
										class="pull-right text-muted small">4 minutes ago</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>See
									All Alerts</strong> <i class="fa fa-angle-right"></i>
						</a></li>
					</ul> <!-- /.dropdown-alerts --></li>
				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> User
								Profile</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
								Logout</a></li>
					</ul> <!-- /.dropdown-user --></li>
				<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<%-- 
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="Search...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div> 
							<!-- /input-group -->
						</li>
					
						
					
						<li><a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i>
								Dashboard</a></li> 
							
						<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
								Charts<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="flot.html">Flot Charts</a></li>
								<li><a href="morris.html">Morris.js Charts</a></li>
							</ul> <!-- /.nav-second-level --></li>
						
						<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>
								Tables</a></li>
						<li><a href="forms.html"><i class="fa fa-edit fa-fw"></i>
								Forms</a></li>
						<li><a href="#"><i class="fa fa-wrench fa-fw"></i> UI
								Elements<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="panels-wells.html">Panels and Wells</a></li>
								<li><a href="buttons.html">Buttons</a></li>
								<li><a href="notifications.html">Notifications</a></li>
								<li><a href="typography.html">Typography</a></li>
								<li><a href="icons.html"> Icons</a></li>
								<li><a href="grid.html">Grid</a></li>
							</ul> <!-- /.nav-second-level --></li>
						<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
								Multi-Level Dropdown<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="#">Second Level Item</a></li>
								<li><a href="#">Second Level Item</a></li>
								<li><a href="#">Third Level <span class="fa arrow"></span></a>
									<ul class="nav nav-third-level">
										<li><a href="#">Third Level Item</a></li>
										<li><a href="#">Third Level Item</a></li>
										<li><a href="#">Third Level Item</a></li>
										<li><a href="#">Third Level Item</a></li>
									</ul> <!-- /.nav-third-level --></li>
							</ul> <!-- /.nav-second-level --></li>	--%>
						<li class="active"><a href="#"><i
								class="fa fa-files-o fa-fw"></i> Sample Pages<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a class="active" href="blank.html">Blank Page</a></li>
								<li><a href="login.html">Login Page</a></li>
							</ul> <!-- /.nav-second-level --></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<!-- Page Content -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Bachiller</h1>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">Bachiller</div>
				<div class="panel-body">

					<div>

						<form method="get" action="<%=request.getContextPath()%>/search">
							<div class="row">
								<div class="col-lg-3">
									<div class="input-group">
										<span class="input-group-btn">
											<button class="btn btn-default" type="submit">Buscar</button>
										</span> <input type="text" class="form-control" name="searchString"
											placeholder="Matricula">
									</div>
									<!-- /input-group -->
								</div>
								<!-- /.col-lg-6 -->

							</div>
							<!-- /.row -->

						</form>
					</div>
					<br>


				<c:if test="${not empty msg}">
						<div class="alert alert-${css} alert-dismissible" role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
							<strong>${msg}</strong>
						</div>
					</c:if>

					
					<div class="panel panel-default">
						<c:choose>
							<c:when test="${not empty id}">
								<div class="panel-heading">Editar alumno</div>
							</c:when>
							<c:otherwise>

								<div class="panel-heading">Datos del alumno</div>

							</c:otherwise>
						</c:choose>



						<div class="panel-body">


							<form class="form-horizontal" role="form"
								action="<%=request.getContextPath()%>/guardar" method="post">
								<input type="hidden" name="id" value="${id}" />

								<div class="form-group">
									<label for="matricula_1" class="col-lg-1 control-label">matricula</label>
									<div class="col-lg-2">
										<input type="text" class="form-control" id="matricula_1"
											placeholder="Matricula"
											value="${alumnos.alumnosPromCiclos.matricula}"
											name="matricula">
									</div>
								</div>
								<div class="form-group">
									<label for="nombre_1" class="col-lg-1 control-label">Nombre</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="nombre_1"
											placeholder="Nombre"
											value="${alumnos.alumnosPromCiclos.alu_nombre}"
											name="aluNombre">
									</div>
								</div>
								<div class="form-group">
									<label for="facultad_1" class="col-lg-1 control-label">Facultad</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="facultad_1"
											placeholder="Facultad"
											value="${alumnos.alumnosPromCiclos.alumnosFac.facNombre}"
											name="facNombre">
									</div>
								</div>
								<div class="form-group">
									<label for="carrera_1" class="col-lg-1 control-label">Carrera
										Profesional</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="carrera_1"
											placeholder="Carrera"
											value="${alumnos.alumnosPromCiclos.especial.espNombre}"
											name="espNombre">
									</div>
								</div>
								<div class="form-group">
									<label for="creditos_1" class="col-lg-1 control-label">Creditos
										Aprobados</label>
									<div class="col-lg-1">
										<input type="text" class="form-control" id="creditos_1"
											placeholder="Creditos" value="${alumnos.ppg}" name="ppg">
									</div>
								</div>
								<div class="form-group">
									<label for="profesor_1" class="col-lg-1 control-label">Profesor
										consejero</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id=""
											profesor_1""
											placeholder="Profesor consejero"
											value="${alumnos.alumnosPromCiclos.pro_codigo}"
											name="proCodigo">
									</div>
								</div>
								<div class="form-group">
									<label for="promocion_1" class="col-lg-1 control-label">Promocion</label>
									<div class="col-lg-1">
										<input type="text" class="form-control" id="promocion_1"
											placeholder="Promocion" value="${alumnos.ciclo}" name="ciclo">
									</div>
								</div>


								<div class="form-group">
									<div class="col-lg-offset-1 col-lg-10">
										<button type="submit" class="btn btn-default">Guardar</button>
									</div>
								</div>
							</form>




						</div>
					</div>



					<table class="table table-hover">
						<thead>
							<tr>
								<th>Id</th>
								<th>Matricula</th>
								<th>Alumno nombre</th>
								<th>Ppg</th>
								<th>facultad</th>
								<th>Carrera</th>
								<th>Profesor Consejero</th>
								<th>Ciclo</th>
								<th>Usuario</th>
								<th>Acción</th>
							</tr>
						</thead>


						<c:forEach var="i2" items="${registros}">
							<tbody>
								<tr>
									<td>${i2.id}</td>
									<td>${i2.matricula}</td>
									<td>${i2.aluNombre}</td>
									<td>${i2.ppg}</td>
									<td>${i2.facNombre}</td>
									<td>${i2.espNombre}</td>
									<td>${i2.proCodigo}</td>
									<td>${i2.ciclo}</td>
									<td>${i2.usuario}</td>

									<td><spring:url value="${i2.id}/pdf" var="userUrl" /> <spring:url
											value="${i2.id}/editar" var="deleteUrl" /> <spring:url
											value="${i2.id}/eliminar" var="updateUrl" />

										<button class="btn btn-info"
											onclick="location.href='${userUrl}'" formtarget="_blank">Reporte</button>

										<!--<button class="btn btn-info"
											onclick="OpenInNewTab(location.href='${userUrl}')">Reporte2</button>


										<button class="btn btn-info"
											onclick="window.open(location.href='${userUrl}')">Reporte3</button>-->


										<button class="btn btn-primary"
											onclick="location.href='${deleteUrl}'">editar</button>
										<button class="btn btn-danger"
											onclick="location.href='${updateUrl}'">eliminar</button></td>

								</tr>
							</tbody>

						</c:forEach>
					</table>


				</div>

				<!-- /.container-fluid -->
			</div>
			<!-- /#page-wrapper -->

		</div>
		<!-- /#wrapper -->

		<!-- jQuery -->
		<script
			src="${pageContext.request.contextPath}/public//bower_components/jquery/dist/jquery.min.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script
			src="${pageContext.request.contextPath}/public//bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

		<!-- Metis Menu Plugin JavaScript -->
		<script
			src="${pageContext.request.contextPath}/public//bower_components/metisMenu/dist/metisMenu.min.js"></script>

		<!-- Custom Theme JavaScript -->
		<script
			src="${pageContext.request.contextPath}/public//dist/js/sb-admin-2.js"></script>
</body>

</html>