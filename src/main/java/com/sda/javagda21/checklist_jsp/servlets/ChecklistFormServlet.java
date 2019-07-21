package com.sda.javagda21.checklist_jsp.servlets;

import com.sda.javagda21.checklist_jsp.model.Checklist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/checklist/add")
public class ChecklistFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/checklist/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Checklist checklist = new Checklist();

        String archived = req.getParameter("archived");
        boolean checked = (archived != null) && archived.equalsIgnoreCase("on");

        String dateCompleted = req.getParameter("date_completed");
        LocalDate date = LocalDate.parse(dateCompleted);

        checklist.setName(req.getParameter("name"));
        checklist.setDate_completed(date);
        checklist.setArchived(checked);
    }
}
