package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

// TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        if(username.isEmpty() || password.isEmpty() || email.isEmpty()){
            response.sendRedirect("/register");
        }else {
            // TODO: create a new user based off of the submitted information
            // TODO: if a user was successfully created, send them to their profile
            User user = new User(
                    username, email, password
            );
            DaoFactory.getUsersDao().insert(user);
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        }
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(email);







    }




//    Ad ad = new Ad(
//            1, // for now we'll hardcode the user id
//            request.getParameter("title"),
//            request.getParameter("description")
//        );
//        DaoFactory.getAdsDao().insert(ad);
//        response.sendRedirect("/ads");
//    }
}
