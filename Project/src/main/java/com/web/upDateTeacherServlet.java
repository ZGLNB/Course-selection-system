package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.Course;
import com.pojo.User;
import com.service.SelectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/upDateTeacherServlet")
public class upDateTeacherServlet extends HttpServlet {
    SelectService selectService = new SelectService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //��request.getReader() ��ȡ BufferedReader ����
        BufferedReader bf = request.getReader();
        //��readLine() ��ȡ����������
        String s = bf.readLine();

        User user = JSON.parseObject(s, User.class);
        System.out.println(user);

        selectService.upDateTeacher(user);

        response.getWriter().write("delete:success");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
