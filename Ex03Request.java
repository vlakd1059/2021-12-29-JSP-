package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 응답데이터의 포맷을 설정하는 메소드
		// MIME Type : 데이터 포맷 설정
		// 인코딩 : 컴퓨터가 해석할 수 있도록 데이터의 형식을 지정(EUC-KR, UTF-8)
		response.setContentType("text/html; charset=utf-8");

		// 사용자에게 데이터를 전달하기 위한 객체생성
		PrintWriter out = response.getWriter();
		String ip = request.getRemoteAddr();
		
		out.print("<html>");
		out.print("<head><title>Request&Response 실습</title></head>");
		if (ip.equals("59.0.124.155")) {
			out.println("<h1>최종인님 환영합니다!</h1>");
		} else if (ip.equals("222.102.104.240")) {
			out.println("<h1>한국인님 환영합니다!</h1>");
		} else if (ip.equals("59.0.124.191")) {
			out.println("<h1>김희태님 환영합니다!</h1>");
		} else if (ip.equals("59.0.236.207")) {
			out.println("<h1>강사님 환영합니다!</h1>");
		} else {
			out.println("<h1>어 왔니?</h1>");
		}
	}

}
