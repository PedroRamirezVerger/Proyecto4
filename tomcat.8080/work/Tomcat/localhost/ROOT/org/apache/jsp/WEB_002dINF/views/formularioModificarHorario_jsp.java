/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-12-09 16:31:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formularioModificarHorario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("\thref=\"https://getbootstrap.com/docs/3.4/examples/signin/\">\r\n");
      out.write("\r\n");
      out.write("<title>Horario Médico</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"datePicker/css/bootstrap-datepicker.css\">\r\n");
      out.write("<script src=\"datePicker/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"datePicker/locales/bootstrap-datepicker.es.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("<link href=\"../../assets/css/ie10-viewport-bug-workaround.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"signin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("<!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("<script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".bd-placeholder-img {\r\n");
      out.write("\tfont-size: 1.125rem;\r\n");
      out.write("\ttext-anchor: middle;\r\n");
      out.write("\t-webkit-user-select: none;\r\n");
      out.write("\t-moz-user-select: none;\r\n");
      out.write("\t-ms-user-select: none;\r\n");
      out.write("\tuser-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 768px) {\r\n");
      out.write("\t.bd-placeholder-img-lg {\r\n");
      out.write("\t\tfont-size: 3.5rem;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"/gestor\">THE GOOD HEALTH</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarsExampleDefault\"\r\n");
      out.write("\t\t\taria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\taria-disabled=\"true\">Asignar Horario</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown01\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cuenta</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Mi Perfil</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#informacion\">Información</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"/\">Cerrar sesión</a>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<main role=\"main\" class=\"container\">\r\n");
      out.write("\t\t<div class=\"span\">\r\n");
      out.write("\t\t\t<div></div>\r\n");
      out.write("\t\t\t<div class=\"container center\">\r\n");
      out.write("\t\t\t\t<div class=\"hero-unit\">\r\n");
      out.write("\t\t\t\t\t<br></br> <br></br>\r\n");
      out.write("\t\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Formulario de Asignación de Horario Médico</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Para asignar el horario del médico seleccione los días\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tque va a trabajar y la hora inicio y hora fin de su jornada\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tlaboral.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"informacion\" tabindex=\"-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"dialog\" aria-labelledby=\"exampleModalLongTitle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Información</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tEn esta vista usted puede:\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h5>Asignar horario al médico</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tPara asignar el horario del médico usted debe seleccionar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tlos días que va a trabajar y la hora inicio y hora fin de su\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tjornada laboral.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br></br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container center\">\r\n");
      out.write("\t\t\t\t<div class=\"jumbotron jumbotron-fluid\">\r\n");
      out.write("\t\t\t\t\t<div align='center'>\r\n");
      out.write("\t\t\t\t\t\t<label for=\"diasSemana\">Seleccione los días que va a\r\n");
      out.write("\t\t\t\t\t\t\ttrabajar</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 mb-3 text-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"lunes\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"lunesLabel\"> Lunes </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"martes\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"martesLabel\"> Martes </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"miercoles\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"miercolesLabel\"> Miércoles </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"jueves\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"juevesLabel\"> Jueves </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"viernes\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"viernesLabel\"> Viernes </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"sabado\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"sabadoLabel\"> Sábado </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"domingo\"> <label class=\"form-check-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"domingoLabel\"> Domingo </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<label id=\"labelDiaMal\"></label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br></br> <label for=\"horas\">Seleccione el horario laboral</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"horaIni\" id=\"horaInicio\" type=\"text\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" placeholder=\"Hora de Inicio 00:00\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"horaFin\" id=\"horaFin\" type=\"text\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" placeholder=\"Hora de Fin 00:00\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<label id=\"labelHoraMal\"></label> <br></br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<hr class=\"mb-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"confirmarMedico\" class=\"btn btn-primary btn-large\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\">Confirmar</a> <a href=\"/gestor\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-large\" type=\"submit\">Volver atrás</a>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br></br>\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar jsoDNI = JSON.parse(sessionStorage.MedicoHorario);\r\n");
      out.write("\t\t\tvar dni = jsoDNI.DNI;\r\n");
      out.write("\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\t$('DNIMedico').html(dni);\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t * Control para que no acceda a travï¿½s de la url a alguna pï¿½gina que no sea el home\r\n");
      out.write("\t\t\t * Hay que ponerlo en todos los jsp que se hagan prï¿½ximamente\r\n");
      out.write("\t\t\t */\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\tvar referrer = document.referrer;\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\tif (referrer != 'http://localhost:8080/citas'\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\t\t\t&& referrer != 'https://sgc-e4.herokuapp.com/citas') {\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\t\tvar forma = document.forms[0];\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\t\tforma.action = \"/error\";\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\t\tforma.submit();\r\n");
      out.write("\t\t\t// \t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\tvar jsoDNI = JSON.parse(sessionStorage.MedicoHorario);\r\n");
      out.write("\t\t\tvar dni = jsoDNI.DNI;\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction comprobarValidezDatos() {\r\n");
      out.write("\t\t\tvar cuenta = 0;\r\n");
      out.write("\t\t\tdocument.getElementById(\"labelDiaMal\").style.display = 'none';\r\n");
      out.write("\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'none';\r\n");
      out.write("\t\t\tcuenta = comprobarDia() + cuenta;\r\n");
      out.write("\t\t\tcuenta = comprobarValidezHora(document.getElementById(\"horaInicio\").value)\r\n");
      out.write("\t\t\t\t\t+ cuenta;\r\n");
      out.write("\t\t\tcuenta = comprobarValidezHora(document.getElementById(\"horaFin\").value)\r\n");
      out.write("\t\t\t\t\t+ cuenta;\r\n");
      out.write("\t\t\tconsole.log(cuenta);\r\n");
      out.write("\t\t\treturn cuenta;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction comprobarDia() {\r\n");
      out.write("\t\t\tif ($('#lunes').is(':checked') == false\r\n");
      out.write("\t\t\t\t\t&& $('#martes').is(':checked') == false\r\n");
      out.write("\t\t\t\t\t&& $('#miercoles').is(':checked') == false\r\n");
      out.write("\t\t\t\t\t&& $('#jueves').is(':checked') == false\r\n");
      out.write("\t\t\t\t\t&& $('#viernes').is(':checked') == false\r\n");
      out.write("\t\t\t\t\t&& $('#sabado').is(':checked') == false\r\n");
      out.write("\t\t\t\t\t&& $('#domingo').is(':checked') == false) {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"labelDiaMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t$('#labelDiaMal').html(\"Debe seleccionar al menos un dia\");\r\n");
      out.write("\t\t\t\t$('#labelDiaMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction comprobarValidezHora(hora) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (hora == '') {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t$('#labelHoraMal').html(\r\n");
      out.write("\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (hora.length != 5) {\r\n");
      out.write("\t\t\t\tconsole.log(\"hora mala\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t$('#labelHoraMal').html(\r\n");
      out.write("\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tfor (i = 0; i < hora.length; i++) {\r\n");
      out.write("\t\t\t\tswitch (i) {\r\n");
      out.write("\t\t\t\tcase 0:\r\n");
      out.write("\t\t\t\t\tif (hora.charAt(i) != \"0\" && hora.charAt(i) != \"1\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"2\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"hora mala se pasa del dos\");\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal')\r\n");
      out.write("\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase 1:\r\n");
      out.write("\t\t\t\t\tif (hora.charAt(i) != \"0\" && hora.charAt(i) != \"1\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"2\" && hora.charAt(i) != \"3\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"4\" && hora.charAt(i) != \"5\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"6\" && hora.charAt(i) != \"7\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"8\" && hora.charAt(i) != \"9\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"hora mala 1 se pasa del dos\");\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal')\r\n");
      out.write("\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase 2:\r\n");
      out.write("\t\t\t\t\tif (hora.charAt(i) != \":\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"hora mala no hay dos puntso\");\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal')\r\n");
      out.write("\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase 3:\r\n");
      out.write("\t\t\t\t\tif (hora.charAt(i) != \"0\" && hora.charAt(i) != \"1\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"2\" && hora.charAt(i) != \"3\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"4\" && hora.charAt(i) != \"5\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"hora mala 3 se pasa del dos\");\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal')\r\n");
      out.write("\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\tcase 4:\r\n");
      out.write("\t\t\t\t\tif (hora.charAt(i) != \"0\" && hora.charAt(i) != \"1\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"2\" && hora.charAt(i) != \"3\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"4\" && hora.charAt(i) != \"5\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"6\" && hora.charAt(i) != \"7\"\r\n");
      out.write("\t\t\t\t\t\t\t&& hora.charAt(i) != \"8\" && hora.charAt(i) != \"9\") {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"hora mala 4 se pasa del dos\");\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"labelHoraMal\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal')\r\n");
      out.write("\t\t\t\t\t\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"La hora no es válida, debe estar en formato 00:00\");\r\n");
      out.write("\t\t\t\t\t\t$('#labelHoraMal').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn 0;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(document)\r\n");
      out.write("\t\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t$('#confirmarMedico')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(event) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (comprobarValidezDatos() == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar diasSelecc = new Array();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar i = 0;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#lunes').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Lunes';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#martes').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Martes';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#miercoles').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Miércoles';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#jueves').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Jueves';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#viernes').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Viernes';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#sabado').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Sábado';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif ($('#domingo').is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdiasSelecc[i] = 'Domingo';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ti++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(diasSelecc);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar horaInicio = (document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getElementById(\"horaInicio\").value);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar horaFin = (document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getElementById(\"horaFin\").value);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(horaInicio);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(horaFin);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tenviarDatosModificacionHorario(diasSelecc,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thoraInicio, horaFin);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction enviarDatosModificacionHorario(dias, horaI, horaF) {\r\n");
      out.write("\t\t\tvar jsoMed = JSON.parse(sessionStorage.MedicoHorario);\r\n");
      out.write("\t\t\tvar jsodias = JSON.stringify(dias);\r\n");
      out.write("\t\t\tvar jsoGestor = JSON.parse(sessionStorage.usuario);\r\n");
      out.write("\t\t\tvar centro = jsoGestor.resultado.gestor.centro;\r\n");
      out.write("\t\t\tvar data = {\r\n");
      out.write("\t\t\t\tDNI : jsoMed.Medico[0].DNI,\r\n");
      out.write("\t\t\t\tespecialidad : jsoMed.Medico[0].especialidad,\r\n");
      out.write("\t\t\t\tdias : jsodias,\r\n");
      out.write("\t\t\t\thoraInicio : horaI,\r\n");
      out.write("\t\t\t\thoraFin : horaF,\r\n");
      out.write("\t\t\t\tcentro : centro,\r\n");
      out.write("\t\t\t\ttipo : \"enviarDatosModificacionHorario\"\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\tvar url = \"/formularioModificarHorario\";\r\n");
      out.write("\t\t\tvar type = \"POST\";\r\n");
      out.write("\t\t\tvar success;\r\n");
      out.write("\t\t\tvar xhrFields;\r\n");
      out.write("\t\t\tvar headers = {\r\n");
      out.write("\t\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\tdata = JSON.stringify(data);\r\n");
      out.write("\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : type,\r\n");
      out.write("\t\t\t\turl : url,\r\n");
      out.write("\t\t\t\tdata : data,\r\n");
      out.write("\t\t\t\theaders : headers,\r\n");
      out.write("\t\t\t\txhrFields : {\r\n");
      out.write("\t\t\t\t\twithCredentials : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : HorarioModificadoOK,\r\n");
      out.write("\t\t\t\terror : HorarioModificadoError\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction HorarioModificadoOK(respuesta) {\r\n");
      out.write("\t\t\tconsole.log(\"Horario modificado OK\");\r\n");
      out.write("\t\t\tswal({\r\n");
      out.write("\t\t\t\ttitle : \"Horario Modificado\",\r\n");
      out.write("\t\t\t\ticon : \"success\",\r\n");
      out.write("\t\t\t}).then(function() {\r\n");
      out.write("\t\t\t\twindow.location.href = \"/gestor\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction HorarioModificadoError(e) {\r\n");
      out.write("\t\t\tconsole.log(e);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction comprobarHora(texto) {\r\n");
      out.write("\t\t\tdocument.getElementById(\"noHayHora\").style.display = 'none';\r\n");
      out.write("\t\t\tif (texto == '') {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"noHayHora\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t$('#noHayHora')\r\n");
      out.write("\t\t\t\t\t\t.html(\"Tiene que escoger una hora para su cita.\");\r\n");
      out.write("\t\t\t\t$('#noHayHora').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction comprobarFecha(texto) {\r\n");
      out.write("\t\t\tdocument.getElementById(\"fecha\").style.display = 'none';\r\n");
      out.write("\t\t\tif (texto == '') {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"fecha\").style.display = 'inline';\r\n");
      out.write("\t\t\t\t$('#fecha').html(\"Tiene que escoger un día para su cita.\");\r\n");
      out.write("\t\t\t\t$('#fecha').css(\"color\", \"red\");\r\n");
      out.write("\t\t\t\treturn 1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
