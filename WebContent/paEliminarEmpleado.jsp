<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="WEB-INF/libreria.tld" prefix="libreria" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <meta name="format-detection" content="telephone=no">
        <meta charset="UTF-8">

        <meta name="descripcion" content="Violate Responsive Admin Template">
        <meta name="keywords" content="Super Admin, Admin, Template, Bootstrap">

        <title>Eliminar Empleado</title>
            
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/animate.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/form.css" rel="stylesheet">
        <link href="css/calendar.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/icons.css" rel="stylesheet">
        <link href="css/generics.css" rel="stylesheet">
        <link href="css/app.css" rel="stylesheet">
        <link href="css/icons2.css" rel="stylesheet">
    </head>
<body id="skin-blur-sunset">
        <header id="header" class="media">
            <a href="" id="menu-toggle"></a> 
            <a class="logo pull-left" href="Indice.jsp">Bonan S.A.</a>
            
            <div class="media-body">
                <div class="media" id="top-menu">


                    <div id="time" class="pull-right">
                        <span id="hours"></span>
                        :
                        <span id="min"></span>
                        :
                        <span id="sec"></span>
                    </div>
                   
                </div>
            </div>
        </header>
        
        
         <!--Para cambiar fondo  -->
         <section id="main" class="p-relative" role="main">
         
         
         
        	<aside id="sidebar">
        	
                <div class="side-widgets overflow">
                    <!-- Profile Menu -->
                    <div class="text-center s-widget m-b-25 dropdown" id="profile-menu">
                        <a href="" data-toggle="dropdown">
                                                      <img class="profile-pic animated" src="gestionaEmpleado?operacion=mostrarFoto&idEmpleado=${sessionScope.idEmpleado}">
                        </a>
                        <ul class="dropdown-menu profile-menu">
                            <li><a href="">Mi Perfil</a><i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="">Mensajes</a><i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="">Ajustes</a><i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                            <li><a href="gestionaUsuario?operacion=salir">Desconectar</a> <i class="icon left">&#61903;</i><i class="icon right">&#61815;</i></li>
                        </ul>
                        
                        <h5 class="m-0" style="color: orange;">Nombre completo:</h5>
                        <h5 class="m-0">${sessionScope.nombreCompleto}</h5>
 
                        <br>
                        
                        <h5 class="m-0" style="color: orange;">Tipo:</h5>
                        <h5 class="m-0">${sessionScope.tipoEmpleado}</h5>
                         
                    </div>
                    <div class="s-widget m-b-25">
                        <div id="sidebar-calendar"></div>
                    </div>
                    <nav id="wrapper">
                    <ul class="menu">
                    
						<a href="mpAdministrador.jsp">Inicio</a>
						
			<li class="item2"><a href="#">Mantenimiento Clientes</a>
				<ul>
					<li class="subitem1"><a href="paRegistrarCliente.jsp">Registrar Cliente</a></li>
					<li class="subitem2"><a href="paMenuActualizarCliente.jsp">Actualizar Cliente</a></li>
					<li class="subitem2"><a href="paMenuEliminarCliente.jsp">Eliminar Cliente</a></li>
					<li class="subitem3"><a href="gestionaCliente?operacion=listar">Listar Cliente</a></li>
			</ul>
			</li>

        				
        				
        				<li class="item3"><a href="#">Mantenimiento Empleados</a>
						    <ul>
                				<li class="subitem1"><a href="mpAdRegistrarEmpleado.jsp">Registrar Empleado</a></li>
					            <li class="subitem2"><a href="paMenuActualizarEmpleado.jsp">Actualizar Empleado</a></li>
					            <li class="subitem2"><a href="paMenuEliminarEmpleado.jsp">Eliminar Empleado</a></li>
                				<li class="subitem3"><a href="gestionaEmpleado?operacion=listar">Listar Empleado</a></li>
            				</ul>
        				</li>
        				
        				
          <li class="item3"><a href="#">Mantenimiento Usuario</a>
				<ul>
					<li class="subitem1"><a href="paRegistrarUsuario.jsp">Registrar
							Usuario</a></li>
					<li class="subitem2"><a href="paActualizarUsuario.jsp">Actualizar
							Usuario</a></li>
					<li class="subitem2"><a href="paEliminarUsuario.jsp">Eliminar
							Usuario</a></li>
					<li class="subitem3"><a
						href="gestionaUsuario?operacion=listar">Listar Usuario</a></li>
				</ul>
			</li>
        				
        				
        				<li class="item4"><a href="#">Mantenimiento Vehiculos</a>
						    <ul>
                				<li class="subitem1"><a href="paRegistrarVehiculo.jsp">Registrar Vehiculo</a></li>
                				<li class="subitem2"><a href="paActualizarVehiculo.jsp">Actualizar Vehiculo</a></li>
                				<li class="subitem3"><a href="paEliminarVehiculo.jsp">Eliminar Vehiculo</a></li>
                				<li class="subitem4"><a href="gestionaVehiculo?operacion=listar">Listar Vehiculos</a></li>
            				</ul>
        				</li>
        				
        				 <li class="item4"><a href="#">Registro de acciones</a>
						    <ul>
                				<li class="subitem1"><a href="gestionaLog?operacion=listar">Listado de logs</a></li>
            				</ul>
        				</li>
        				
        				
        			
                	</ul>
                	</nav>
                    </div>
        	</aside>
        	
        <section id="content" class="container">
                
                
                <div class="block-area" id="required">

                <!--Titulo  -->
                 <h3 class="block-title">Matenimiento de empleado</h3>
                </div>
                
                
                <div class="block-area" id="required">

                <!--Titulo  -->
                 
                </div>

                
                
                
                
                
                
                
                
                
                
                
                
                
      <!--Espacio para el formulario  -->
     <div class="block-area" id="required">
                    
       <!-- FORMULARIO  -->             
       <form action="gestionaEmpleado" method="post" enctype="multipart/form-data">
         
         <fieldset>
                   
         <legend class="block-title" style="color: white;">Eliminar Empleado</legend>
         <input type="hidden" name="operacion" value="eliminar">                  
 
                   
                   
                
                   
                   <!--Contenedor de datos generales  -->
                <div class="block-area" id="input-masking">
                	         
		         <c:set var="x" value="${requestScope.empleadoX}"></c:set>
     
     
		                   
		            <div class="block-area">
		                   <div class="row">
		                   	  <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">ID EMPLEADO</label>
		                            <input type="text" name="txtIdEmpleado" id="txtIdEmpleado" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar codigo" value="${x.idEmpleado}">
		                        </div>
		                        
		                        
		                       <div class="col-md-3 m-b-15">
                                   <br>
		                           <input type="button" class="btn" value="Buscar empleado" onclick="location='gestionaEmpleado?operacion=listar'">
		                        </div>
		                        
		                   </div>
		            </div>
		            
		            
		          
		             <hr class="whiter m-t-20" />
		                    
		                    
		             <div class="block-area">
		             <div class="row">
		             
		             <div class="col-md-3 m-b-29">
														
														<center>
														<h1 class="block-title">FOTO DEL EMPLEADO</h1>
															<div class="col-sm-12">
																<div class="fileupload fileupload-new" data-provides="fileupload">
																	<div class="fileupload-new thumbnail" style="width: 200px; height: 150px;"><img src="gestionaEmpleado?operacion=mostrarFoto&idEmpleado=${x.idEmpleado}">
																	</div>
																	<div class="fileupload-preview fileupload-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
																	<div>
																		<span class="btn btn-light-grey btn-file">
																			 <span class="fileupload-new">
																				<i class="icon-picture"></i> Cambiar Imagen
																			</span> 
																			<span class="fileupload-exists"><i class="icon-picture"></i> Cambiar</span>
																			<input type="file" name="txtFoto">
																		</span>
																		<a href="#" class="btn fileupload-exists btn-light-grey" data-dismiss="fileupload">
																			<i class="icon-remove"></i> Remover
																		</a>
																	</div>
																</div>
															</div>
														</center>
														
								</div>
								
								<div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">N� DOCUMENTO</label>
		                            <input type="text" id="txtNumDocumento" name="txtNumDocumento" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar n� documento" required="requerid"
		                                    maxlength="20" value="${x.numDocumento}">
                               </div> 
		                   
		                   
		                        <div class="col-md-3 m-b-15">
		                        <label style="font-size: 12px;">NOMBRE</label>
		                            <input type="text" id="txtNombre" name="txtNombre" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar nombre" required="requerid" value="${x.nomEmpleado}">
		                        </div>
                                  
                                  
                                <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">APELLIDO PATERNO</label>
		                            <input type="text" id="txtApePa" name="txtApePa" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar a. paterno" required="requerid" value="${x.apepaEmpleado}">
                               </div>  
                               
                               <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">APELLIDO MATERNO</label>
		                            <input type="text" id="txtApeMa" name="txtApeMa" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar a. materno" required="requerid" value="${x.apemaEmpleado}">
                               </div>  
                               
                               
                               <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">SEXO</label>
		                            <libreria:CboSexo idSexo="${x.sexoEmpleado}"/>
                               </div> 
                               
                                <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">FECHA DE NACIMIENTO</label>
		                            <input type="text" id="txtFecNac" name="txtFecNac" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar fecha de nacimiento" required="requerid" value="${x.fecnacEmpleado}">
                               </div> 
                               
                               
                               <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">UBIGEO</label>
		                            <input type="text" id="txtUbigeo" name="txtUbigeo" class="input-sm form-control"  style="font-size: 16px;" placeholder="ingresar N� ubigeo" required="requerid" value="${x.ubigeoEmpleado}">
                               </div> 
                               
                               
                               <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">DIRECCION</label>
		                            <input type="text" id="txtDireccion" name="txtDireccion" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar direccion" required="requerid" value="${x.domicilioEmpleado}">
                               </div> 
                               
                                 <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">N� TELEFONO</label>
		                            <input type="text" id="txtFono" name="txtFono" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar N� telefono" required="requerid" value="${x.fonoEmpleado}">
                               </div> 
                               
                               
                                 <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">N� CELULAR</label>
		                            <input type="text" id="txtCelular" name="txtCelular" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar N� celular" required="requerid" value="${x.celularEmpleado}">
                               </div> 
                               
                                 <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">E-MAIL</label>
		                            <input type="text" id="txtEmail" name="txtEmail" class="input-sm form-control" style="font-size: 16px;" placeholder="ingresar e-mail" required="requerid" value="${x.emailEmpleado}">
                               </div> 
                               

                               <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">Estado</label>
		                            <libreria:cboEstado idEstado="${x.idEstado}"/>
		                            
                               </div> 
                               
                               
                               <div class="col-md-3 m-b-15">
		                            <label style="font-size: 12px;">Estado Trabajo</label>
		                            <libreria:cboEstadoTrabajo idEstadoTrabajo="${x.idEstadoTrabajo}"/>
                               </div>                                                                	                        
                               
                       </div>
                 
                 </div>
                 
                 <hr class="whiter m-t-20" />
                   <!--Botones  -->
                   <div class="block-area" id="input-masking">
                        <input class="btn btn-sm" type="submit" value="ELIMINAR">
                        <input class="btn btn-sm" type="reset" value="LIMPIAR">
                   </div>
                 
            </div>
                   
                   
                   
                   
                  
                   
             </fieldset>
         </form><!--FIN DEL FORMULARIO  -->
                    
    </div><!-- Fin del contenedor del form -->
                
                
                
                
    
                            

                         
                         
                  
             
         <!--Chat  -->       
                <div class="chat">
                    
                    <!-- Chat List -->
                    <div class="pull-left chat-list">
                        <div class="listview narrow">
                            <div class="media">
                                <img class="pull-left" src="img/profile-pics/1.jpg" width="30" alt="">
                                <div class="media-body p-t-5">
                                    Alex Bendit
                                </div>
                            </div>
                            <div class="media">
                                <img class="pull-left" src="img/profile-pics/2.jpg" width="30" alt="">
                                <div class="media-body">
                                    <span class="t-overflow p-t-5">David Volla Watkinson</span>
                                </div>
                            </div>
                            <div class="media">
                                <img class="pull-left" src="img/profile-pics/3.jpg" width="30" alt="">
                                <div class="media-body">
                                    <span class="t-overflow p-t-5">Mitchell Christein</span>
                                </div>
                            </div>
                            <div class="media">
                                <img class="pull-left" src="img/profile-pics/4.jpg" width="30" alt="">
                                <div class="media-body">
                                    <span class="t-overflow p-t-5">Wayne Parnell</span>
                                </div>
                            </div>
                            <div class="media">
                                <img class="pull-left" src="img/profile-pics/5.jpg" width="30" alt="">
                                <div class="media-body">
                                    <span class="t-overflow p-t-5">Melina April</span>
                                </div>
                            </div>
                            <div class="media">
                                <img class="pull-left" src="img/profile-pics/6.jpg" width="30" alt="">
                                <div class="media-body">
                                    <span class="t-overflow p-t-5">Ford Harnson</span>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                    
                    <!-- Chat Area -->
                    <div class="media-body">
                        <div class="chat-header">
                            <a class="btn btn-sm" href="">
                                <i class="fa fa-circle-o status m-r-5"></i> Chat with Friends
                            </a>
                        </div>
                    
                        <div class="chat-body">
                            <div class="media">
                                <img class="pull-right" src="img/profile-pics/1.jpg" width="30" alt="" />
                                <div class="media-body pull-right">
                                    Hiiii<br/>
                                    How you doing bro?
                                    <small>Me - 10 Mins ago</small>
                                </div>
                            </div>
                            
                            <div class="media pull-left">
                                <img class="pull-left" src="img/profile-pics/2.jpg" width="30" alt="" />
                                <div class="media-body">
                                    I'm doing well buddy. <br/>How do you do?
                                    <small>David - 9 Mins ago</small>
                                </div>
                            </div>
                            
                            <div class="media pull-right">
                                <img class="pull-right" src="img/profile-pics/2.jpg" width="30" alt="" />
                                <div class="media-body">
                                    I'm Fine bro <br/>Thank you for asking
                                    <small>Me - 8 Mins ago</small>
                                </div>
                            </div>
                            
                            <div class="media pull-right">
                                <img class="pull-right" src="img/profile-pics/2.jpg" width="30" alt="" />
                                <div class="media-body">
                                    Any idea for a hangout?
                                    <small>Me - 8 Mins ago</small>
                                </div>
                            </div>
                        
                        </div>
                    
                        <div class="chat-footer media">
                            <i class="chat-list-toggle pull-left fa fa-bars"></i>
                            <i class="pull-right fa fa-picture-o"></i> 
                            <div class="media-body">
                                <textarea class="form-control" placeholder="Type something..."></textarea>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        </section>
        
<script src="js/jquery.min.js"></script> <!-- jQuery Library -->




        <script src="js/validation/validationEngine.min.js"></script> <!-- jQuery Form Validation Library - requirred with above js -->
        <script src="js/select.min.js"></script> <!-- Custom Select -->
        <script src="js/chosen.min.js"></script> <!-- Custom Multi Select -->
        <script src="js/datetimepicker.min.js"></script> <!-- Date & Time Picker -->
        <script src="js/colorpicker.min.js"></script> <!-- Color Picker -->
        <script src="js/icheck.js"></script> <!-- Custom Checkbox + Radio -->
        <script src="js/autosize.min.js"></script> <!-- Textare autosize -->
        <script src="js/toggler.min.js"></script> <!-- Toggler -->
        <script src="js/input-mask.min.js"></script> <!-- Input Mask -->
        <script src="js/spinner.min.js"></script> <!-- Spinner -->
        <script src="js/slider.min.js"></script> <!-- Input Slider -->
        <script src="js/fileupload.min.js"></script> <!-- File Upload -->


        <script src="js/jquery-ui.min.js"></script> <!-- jQuery UI -->
        <script src="js/jquery.easing.1.3.js"></script> <!-- jQuery Easing - Requirred for Lightbox + Pie Charts-->

        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Charts -->
        <script src="js/charts/jquery.flot.js"></script> <!-- Flot Main -->
        <script src="js/charts/jquery.flot.time.js"></script> <!-- Flot sub -->
        <script src="js/charts/jquery.flot.animator.min.js"></script> <!-- Flot sub -->
        <script src="js/charts/jquery.flot.resize.min.js"></script> <!-- Flot sub - for repaint when resizing the screen -->

        <script src="js/sparkline.min.js"></script> <!-- Sparkline - Tiny charts -->
        <script src="js/easypiechart.js"></script> <!-- EasyPieChart - Animated Pie Charts -->
        <script src="js/charts.js"></script> <!-- All the above chart related functions -->

        <!-- Map -->
        <script src="js/maps/jvectormap.min.js"></script> <!-- jVectorMap main library -->
        <script src="js/maps/usa.js"></script> <!-- USA Map for jVectorMap -->

        <!--  Form Related -->
        <script src="js/icheck.js"></script> <!-- Custom Checkbox + Radio -->

        <!-- UX -->
        <script src="js/scroll.min.js"></script> <!-- Custom Scrollbar -->

        <!-- Other -->
        <script src="js/calendar.min.js"></script> <!-- Calendar -->
        <script src="js/feeds.min.js"></script> <!-- News Feeds -->
        

        <!-- All JS functions -->
        <script src="js/functions.js"></script>
        <script src="js/depmain.js"></script>
        
		
</body>
</html>