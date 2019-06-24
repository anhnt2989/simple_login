import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "simple_login", urlPatterns = "/login")
public class simple_login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html>");
//
//        if("admin".equals(username) && "admin".equals(password)) {
//            writer.println("<h1>Welcome "+username+" to website</h1>");
//        } else{
//            writer.println("<h1>Login Error</h1>");
//        }
//
//        writer.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");

        if("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome "+username+" to website</h1>");
        } else{
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");
    }
}
