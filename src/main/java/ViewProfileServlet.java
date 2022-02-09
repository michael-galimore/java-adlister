import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("/profile.jsp").forward(request, response);
//        if ((boolean)request.getSession().getAttribute("isUser") == false){
//            response.sendRedirect("login");
//
//
//        }
//        if(request.getSession().getAttribute("user") != null){
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
//
//        } else {
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//
//
//        }





//        if (request.getMethod().equalsIgnoreCase("post")) {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            boolean isUser = username.equals("username") && password.equals("password");
//            if (username.equals("admin") && password.equals("password")) {
//
//                response.sendRedirect("/profile");
//            } if(isUser){
//                request.getSession().setAttribute("isUser", true);
//
//            }
//        }
    }
}
