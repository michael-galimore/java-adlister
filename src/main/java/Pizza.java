import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


@WebServlet(name = "Pizza", urlPatterns = "/pizza-order")
public class Pizza extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza/order.jsp").forward(req, resp);

    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("crust"));
        System.out.println(req.getParameter("sauce"));
//        System.out.println(req.getParameter("toppings"));
        String[] toppings = req.getParameterValues("toppings");
        for (String topping : toppings){
            System.out.println(topping);
        }

        System.out.println(req.getParameter("size"));
        System.out.println(req.getParameter("address"));

    }





//        for (String crusts:crust)
//             {
//
//                 System.out.println(crusts);
//        }
//        for (String sauces:sauce){
//            System.out.println(req.getParameter("sauces"));
//        }
//        for(String toppings:topping){
//            System.out.println(toppings);
//        }
//        for(String sizes:size){
//            System.out.println(sizes);
//        }
//        System.out.println(address);

}
