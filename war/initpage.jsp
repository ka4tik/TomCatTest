<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>InitJSP</title>
</head>
<body>
<%!
    public void jspInit(){
        String defaultUser = getServletConfig().getInitParameter("defaultUser");
        ServletContext context = getServletContext();
        context.setAttribute("defaultUser",defaultUser);
    }
%>
<h1>Default user is : <b><%=
  getServletConfig().getInitParameter("defaultUser")
%></b></h1>
<h1>Value in the Servlet context is : <b><%=
getServletContext().getAttribute("defaultUser")
%></b></h1>
</body>
</html>
