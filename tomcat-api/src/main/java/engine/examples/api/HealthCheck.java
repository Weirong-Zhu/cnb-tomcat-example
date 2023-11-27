package engine.examples.api;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HealthCheck extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        res.setContentType("application/json");
        PrintWriter out=res.getWriter();
        out.println("{status: up}");
        out.close();
    }

}
