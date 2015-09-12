<%@ page import="java.util.Random" %>
<%!
    public int add(int x, int y) {
        return x + y;
    }
%>
<html>
<head><title>Test</title></head>
<body>
<h1>Test JSP</h1>
<%@ include file="clock.jsp" %>
<%
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        out.println("<p>hello world<p>");
    }
    for (int i = 0; i < 10; i++) {
        int x = random.nextInt();
        int y = random.nextInt();
        out.println("<p>" + x + " + " + y + " = " + add(x, y) + "</p>");
    }
%>
<h3><%=add(5, 7)%>
</h3>

<p>This is my test.</p>
</body>
</html>