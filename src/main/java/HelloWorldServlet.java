import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    int hitCounter;
    public void init(){
        hitCounter = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        hitCounter++;
        PrintWriter out = response.getWriter();
        String title = "Times viewed ";
        out.println("<h1>"+ title + "</h1>" + "<h2>" + hitCounter + "</h2>");


    }
}
