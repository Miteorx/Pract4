package controllers;

import dao.UserList;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {


    String login = req.getParameter("login");
    String password = req.getParameter("password");

    User person = null;
    for (User user : UserList.getUsers()) {
      if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
        HttpSession session = req.getSession();
        session.setAttribute("currentUser", user);
        person = user;
        req.setAttribute("name", user.getName());
      }
    }
    if (person == null) {
      req.setAttribute("invalid", true);
      getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
    else resp.sendRedirect(req.getContextPath() + "/hello");
  }
}
