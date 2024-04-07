package com.ignateva.tags_task.servlet;

import com.ignateva.tags_task.StudentService;
import com.ignateva.tags_task.entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SelectAllServlet", value ="/selectAll-servlet")
public class SelectAllServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = new ArrayList<>();
        StudentService studentService = new StudentService();
        students = studentService.getAll();
        req.setAttribute("students",students);

       req.getRequestDispatcher("/students.jsp").forward(req, resp);
        }

    }
