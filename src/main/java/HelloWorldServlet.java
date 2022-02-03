import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    int hitCounter;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = "Hello, World";
        String views = "Times viewed ";
        String name = request.getParameter("name");
        response.setContentType("text/html");
        hitCounter++;
        PrintWriter out = response.getWriter();

        out.println("<h1>"+ views + "</h1>" + "<h2>" + hitCounter + "</h2>");
        if(name == null){
            out.println("Hello, World");

        }else {
            out.println("<h1> Hello, " + name + "World!");
        }


    }
}
