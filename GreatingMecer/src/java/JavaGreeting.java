
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class JavaGreeting extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        try (PrintWriter pw = res.getWriter()) {
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<title>Mecer Greeting servlet</title");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<center><h1>One mug of delicious Mecer coffee please</h1></center>");
            pw.println("</body>");
            pw.println("</html>");
        }
    }
    
}
