package com.javaex.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ggd
 */
@WebServlet("/gugudan") //주소창에 칠때 이걸로 변경됨
public class Ggd extends HttpServlet { // HttpServlet을 상속받는 클래스를 만들어준것이라 생각
	//필드
//	private static final long serialVersionUID = 1L;
       
	//생성자
//    public Ggd() {// 기본 생성자 쓰면 이거 전체 생략가능
//        super();  // 생략가능. 
//    }

    //메소드-gs인데 필드가 있는데 안만들어진것같음
    
    //메소드-일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//get방식으로 요청하면 이게 실행됨. 특별한 요청 없으면 get으로 실행된다.
		System.out.println("servlet 구구단");
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan);
		
		PrintWriter writer = response.getWriter(); 
		writer.println("<table border=1>");
		for(int i=2; i<= 9; i++) {
			writer.println("<tr>");
			writer.println("   <td>"+ dan +"</td>");
			writer.println("   <td>"+ i +"</td>");
			writer.println("   <td>"+ dan*i +"</td>");
			writer.println("</tr>");
		}
		writer.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {//post방식으로 요청하면 이게 실행됨
		doGet(request, response);
	}

}
