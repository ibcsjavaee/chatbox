package com.ibcs.primax.javaee.web;

import com.ibcs.primax.javaee.model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by instructor on 4/22/2015.
 */
@WebServlet(name = "com.ibcs.primax.javaee.web.IndexServlet", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = new Person();
        person.setFirstName(request.getParameter("first_name"));
        person.setLastName(request.getParameter("last_name"));
        request.setAttribute("person", person);

        List<Person> personList = (List<Person>) getServletContext().getAttribute("personList");
        personList.add(person);


        HttpSession httpSession = request.getSession();

        httpSession.setAttribute("person", person);

        request.getRequestDispatcher("/WEB-INF/view/greet.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get call at /index");
        request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
    }
}
