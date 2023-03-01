package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.Course;
import com.service.SelectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/upDateCourseServlet")
public class upDateCourseServlet extends HttpServlet {
    SelectService selectService = new SelectService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //��request.getReader() ��ȡ BufferedReader ����
        BufferedReader bf = request.getReader();
        //��readLine() ��ȡ����������
        String s = bf.readLine();

        Course course = JSON.parseObject(s, Course.class);
        System.out.println(course);

        selectService.upDateCourse(course);

        response.getWriter().write("delete:success");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
