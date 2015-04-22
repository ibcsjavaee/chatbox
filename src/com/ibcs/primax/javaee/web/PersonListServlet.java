package com.ibcs.primax.javaee.web;

import com.ibcs.primax.javaee.model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by instructor on 4/22/2015.
 */
@WebServlet(name = "PersonListServlet", urlPatterns = "/personList")
public class PersonListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> personList = (List<Person>) getServletContext().getAttribute("personList");
        for (Person p : personList) {
            response.getWriter().println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
