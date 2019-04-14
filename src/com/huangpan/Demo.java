package com.huangpan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//注意：@WebServlet("test")不行，直接启动tomcat就有问题，必须加/斜杆
@WebServlet("/test")
public class Demo extends   HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test...");
		//需要屏蔽掉下面的super方法，不然jsp页面里面的<a href="test">t</a>会报错：HTTP Status 405 - HTTP method GET is not supported by this URL
		//super.service(request, response);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
	
}
